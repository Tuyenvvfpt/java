import service.AccountService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountService();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("1. Dang ky tai khoan");
            System.out.println("2. Cap nhat thong tin");
            System.out.println("3. Tim kiem tai khoan");
            System.out.println("4. Xoa tai khoan");
            System.out.println("5. Hien thi danh sach tai khoan");
            System.out.println("6. Thoat");
            System.out.println("Lua chon chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    accountService.save();
                    break;
                case 2:
                    accountService.update();
                    break;
                case 3:
                    accountService.search();
                    break;
                case 4:
                    accountService.delete();
                    break;
                case 5:
                    accountService.getAllAscOrDescByAge();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}
