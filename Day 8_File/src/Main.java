import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.getAll();
    }

    private List<Customer> getAll() throws IOException {
        String path = "C:\\SourceCode\\test.txt";
        List<Customer> customers = readFile(path);
        return customers;
    }

    private List<Customer> readFile(String file) throws IOException {
        List<Customer> customerList = new ArrayList<>();
        File f = new File(file);

        FileInputStream inputStream = new FileInputStream(file);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String str;

        while ((str = bufferedReader.readLine()) != null) {
            String[] data = str.split(" ");
            Customer customer = new Customer();
            customer.setId(Integer.parseInt(data[0]));
            customer.setName(data[1]);
            customer.setAge(Integer.parseInt(data[2]));
            customer.setSex(data[3]);
            customerList.add(customer);
        }

        inputStream.close();
        bufferedReader.close();
        return customerList;
    }

}
