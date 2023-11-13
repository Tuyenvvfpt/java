package com.example.demo_servlet.repository;

import com.example.demo_servlet.utils.DBContext;
import com.example.demo_servlet.entities.Student;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
public class StudentRepository {
    public List<Student> getAll() {
        List<Student> studentList = new ArrayList<>();
        DBContext context = new DBContext();

        Connection connection = context.openConnection();
        String sql = "select * from Student";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt("studentId"));
                student.setName(resultSet.getString("studentName"));
                student.setAddress(resultSet.getString("studentAddress"));
                student.setAge(resultSet.getInt("studentAge"));
                studentList.add(student);
            }
            return studentList;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ArrayList<Student>();
        }

    }
}
