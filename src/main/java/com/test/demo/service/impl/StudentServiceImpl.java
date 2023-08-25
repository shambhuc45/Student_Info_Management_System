/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.demo.service.impl;

import com.test.demo.model.Student;
import com.test.demo.repository.StudentRepository;
import com.test.demo.service.StudentService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 *
 * @author shiva
 */
@Service
@AllArgsConstructor
@NonNull
public class StudentServiceImpl implements StudentService{
private final StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudents() {
            return studentRepository.findAll();
    }
    @Override
    public String deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
         return "Deleted";
    }
     @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Save";
    }
     @Override
    public Student getStudent(Long studentId) {
      return studentRepository.findById(studentId).get();          
    }
}
