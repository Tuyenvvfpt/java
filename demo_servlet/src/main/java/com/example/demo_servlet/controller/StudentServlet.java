package com.example.demo_servlet.controller;

import com.example.demo_servlet.entities.Student;
import com.example.demo_servlet.services.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServlet",value = "/student")
public class StudentServlet extends HttpServlet {
    private StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.getAll();
        req.setAttribute("list_student", studentList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("student.jsp");
        requestDispatcher.forward(req, resp);
    }
}
