/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.demo.repository;

import com.test.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author shambhu
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
