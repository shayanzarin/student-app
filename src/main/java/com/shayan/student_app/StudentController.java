package com.shayan.student_app;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @RequestMapping(value = "/students", method = RequestMethod.GET)    
    public List<Student> getAllStudents() {
        // return List.of(
        //     new Student(1, "Alice", 20),
        //     new Student(2, "Bob", 22),
        //     new Student(3, "Charlie", 19)
        // );

        return studentRepo.findAll();
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public String addStudent() {
        Student student = new Student();
        student.setName("New Student");
        student.setAge(18);
        studentRepo.save(student);
        return "Student added: " + student.toString();
    }
    
}
