package com.example.demo_servlet.services;

import com.example.demo_servlet.entities.Student;
import com.example.demo_servlet.repository.StudentRepository;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
public class StudentService {
    private StudentRepository repository = new StudentRepository();
    public List<Student> getAll(){
        return repository.getAll();
    }
}
