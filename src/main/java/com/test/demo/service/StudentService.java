/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.demo.service;

import com.test.demo.model.Student;
import java.util.List;

/**
 *
 * @author shambhu
 */
public interface StudentService {
     List<Student> getAllStudents();
      public String deleteStudentById(Long studentId);
      public String createStudent(Student student);
      public Student getStudent(Long studentId);
}
