import model.Product;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.findByName("ao nu");
    }
//    public static void main(String[] args) {
//        System.out.println("Hello World!");
//
//        String DB_URL = "jdbc:mysql://localhost:3306/demo_first?useSSL=false"; //testdb la ten dtb ma cta ket noi den
//        String USER_NAME = "root";
//        String PASSWORD = "123456";
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver"); //driver của mysql de ket noi csdl
//            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD); //tao ra coonect toi csdl
//            System.out.println("Connect Successfully");
//
////            String sql = "select * from Product";//select all
////            String sql = "insert into Product(productName, productMadeIn, productStatus) values (?, ?, ?)";//add
//            String sql = "update Product set productName = ?, productMadeIn = ?, productStatus = ? where productId = ?";//update
//
////            Statement statement = connection.createStatement();
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setString(1, "demo insert");
//            statement.setString(2, "kr");
//            statement.setInt(3, 1);
//            statement.setInt(4, 1); //update
//
////            ResultSet resultSet = statement.executeQuery(sql);
//            statement.executeUpdate();
////            connection.commit(); //Can''t call commit when autocommit=true
//
//
//            System.out.println("Finish");
//
//            //thêm
////            while (resultSet.next()) {
////                Product product = new Product();
////                product.setProductId(resultSet.getInt("productId"));
////                product.setProductName(resultSet.getString("productName"));
////                product.setProductMadeIn(resultSet.getString("productMadeIn"));
////                product.setProductStatus(resultSet.getInt("productStatus"));
////                System.out.println(product.toString());
////                System.out.println("");
////            }
//
//            connection.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public Connection openConnect() {
        String DB_URL = "jdbc:mysql://localhost:3306/demo_first?useSSL=false"; //testdb la ten dtb ma cta ket noi den
        String USER_NAME = "root";
        String PASSWORD = "123456";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver của mysql de ket noi csdl
            Connection connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD); //tao ra coonect toi csdl
            System.out.println("Connect Successfully");
            return connection;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        Connection connection = openConnect();
        try {
            String sql = "select * from Product where productName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Product product = new Product();
                product.setProductId(resultSet.getInt("productId"));
                product.setProductName(resultSet.getString("productName"));
                product.setProductMadeIn(resultSet.getString("productMadeIn"));
                product.setProductStatus(resultSet.getInt("productStatus"));

                productList.add(product);
            }
            return productList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
