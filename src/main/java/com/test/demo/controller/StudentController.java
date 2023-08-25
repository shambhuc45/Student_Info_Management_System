/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.demo.controller;

import com.test.demo.model.Student;
import com.test.demo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author shambhu
 */
@Controller
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService;
    
    @GetMapping("/students")
    public String getAllStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
    @GetMapping("/student/delete/{id}")
	public String deleteStudentById(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
		studentService.deleteStudentById(id);
                // redirectAttributes.addFlashAttribute("message", "The Student with id=" + id + " has been deleted successfully!");
		return "redirect:/students";
	}
    @GetMapping("/student/new")
  public String addStudent(Model model) {
    Student student = new Student();
    //student.setPublished(true);

    model.addAttribute("student", student);
    model.addAttribute("pageTitle", "Create new Student");

    return "student_form";
  }
   @PostMapping("/student/save")
     public String createStudent(Student student,RedirectAttributes redirectAttributes){
        studentService.createStudent(student);
        return "redirect:/students";
        
     }
      @GetMapping("/student/edit/{id}")
  public String editStudent(@PathVariable("id") Long id, Model model, RedirectAttributes redirectAttributes) {
    Student student = studentService.getStudent(id);
    //student.setPublished(true);

    model.addAttribute("student", student);
    model.addAttribute("pageTitle", "Update new Student");

    return "student_form";
  }
}
