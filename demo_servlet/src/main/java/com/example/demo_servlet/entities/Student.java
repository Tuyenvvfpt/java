package com.example.demo_servlet.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
   private long id;
   private String name;
   private String address;
   private int age;
}
