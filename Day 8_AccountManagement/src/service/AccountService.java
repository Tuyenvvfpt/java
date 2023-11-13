package service;

import model.Account;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class AccountService {
    final String path = "C:\\SourceCode\\test.txt";
    // List chứa thông tin tài khoản
    List<Account> accountModels = new ArrayList<>();

    // Phương thức để lấy danh sách tài khoản theo tuổi tăng hoặc giảm dần
    public void getAllAscOrDescByAge() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ban muon danh sach tang hay giam (up/down): ");
        String type = scanner.nextLine();
        readFile(); // Đọc dữ liệu từ file
        sortByAge(type); // Sắp xếp danh sách theo tuổi

        // Kiểm tra nếu danh sách tài khoản rỗng
        if (accountModels.isEmpty()) {
            System.out.println("Danh sach tai khoan rong.");
        } else {
            // Sử dụng Java 8 để in danh sách tài khoản
            accountModels.forEach(e -> System.out.println(e.toString()));
        }
    }


    // Phương thức sắp xếp danh sách tài khoản theo tuổi
    public void sortByAge(String type) {
        if (type.equals("up")) {
            Collections.sort(accountModels, (d1, d2) -> {
                return d1.getAge() - d2.getAge();
            });
        } else {
            Collections.sort(accountModels, (d1, d2) -> {
                return d2.getAge() - d1.getAge();
            });
        }
    }

    // Phương thức để tìm kiếm tài khoản theo tên
    public void search() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem: ");
        String username = scanner.nextLine();
        readFile(); // Đọc dữ liệu từ file
        accountModels.stream().forEach(e -> {
            if (e.getUsername().equals(username)) {
                System.out.println(e.toString());
            }
        });
    }

    // Phương thức để lưu tài khoản mới
    public void save() {
        try {
            writeToFile(inputData()); // Ghi dữ liệu vào file
            System.out.println("Them moi thanh cong");
        } catch (Exception e) {
            System.out.println("Them moi that bai");
        }
    }

    // Phương thức để nhập thông tin tài khoản mới
    public Account inputData() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap vao username: ");
            String username = scanner.nextLine();
            System.out.println("Nhap vao password: ");
            String password = scanner.nextLine();
            System.out.println("Nhap vao sdt: ");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhap vao tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());
            Account account = new Account(id, username, password, phoneNumber, age, new Date());
            return account;
        } catch (Exception e) {
            System.out.println("Co loi xay ra");
            return null;
        }
    }

    public void update() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            findById(id);
//            System.out.println("Nhap vao ID: ");
//            int id = Integer.parseInt(scanner.nextLine());
            writeToFile();
        } catch (Exception e) {
        }
    }

    public void delete() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            readFile();
            for (Account acc : accountModels) {
                if (acc.getId() == id) {
                    accountModels.remove(accountModels.indexOf(acc));
                    break;
                }
            }
            writeToFile();
        } catch (Exception e) {
        }
    }

    public void findById(int id) throws IOException {
        Scanner scanner = new Scanner(System.in);
        readFile();
        for (Account accountUpdate : accountModels) {
            if (accountUpdate.getId() == id) {
                System.out.println("Nhap vao username: ");
                accountUpdate.setUsername(scanner.nextLine());
                System.out.println("Nhap vao password: ");
                accountUpdate.setPassword(scanner.nextLine());
                System.out.println("Nhap vao sdt: ");
                accountUpdate.setPassword(scanner.nextLine());
                System.out.println("Nhap vao tuoi: ");
                accountUpdate.setAge(Integer.parseInt(scanner.nextLine()));
                accountUpdate.setDateCreate(new Date());
            }
        }
    }

    // Phương thức để đọc dữ liệu từ file và cập nhật danh sách tài khoản
    private void readFile() throws IOException {
        try {
            List<Account> accountList = new ArrayList<>();
            File f = new File(path);

            FileInputStream inputStream = new FileInputStream(f);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                String[] data = str.split(",");
                Account a = new Account();
                a.setId(Integer.parseInt(data[0]));
                a.setUsername(data[1]);
                a.setPassword(data[2]);
                a.setPhoneNumber(data[3]);
                a.setAge(Integer.parseInt(data[4]));
                String dateString = data[5];

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                Date parseDate = simpleDateFormat.parse(dateString);
                a.setDateCreate(parseDate);
                accountList.add(a);
            }
            inputStream.close();
            bufferedReader.close();
            accountModels = accountList; // Cập nhật danh sách tài khoản
        } catch (Exception e) {
            System.out.println("Co loi xay ra");
        }
    }

    // Phương thức để ghi dữ liệu tài khoản vào file
    public boolean writeToFile(Account account) {
        try {
            FileOutputStream outputStream = new FileOutputStream(path, true); //true giữ lại nội dung cũ và ghi đè nội dung mới
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write(account.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean writeToFile() {
        try {
            FileOutputStream outputStream = new FileOutputStream(path, true); //true giữ lại nội dung cũ và ghi đè nội dung mới
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            for (Account account : accountModels) {
                bufferedWriter.write(account.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
