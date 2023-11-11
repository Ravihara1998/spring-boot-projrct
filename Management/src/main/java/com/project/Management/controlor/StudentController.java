package com.project.Management.controlor;


import com.project.Management.model.Student;
import com.project.Management.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/studentCrud")
@CrossOrigin
public class StudentController {


    @GetMapping(value = "/getstudent")
    public List<Student> getAllstudent(){

        return StudentService.getAllStudent();
    }

    @PostMapping(value = "/addStudent")
    public List<Student> addStudent(@RequestBody Student student){

        return StudentService.addStudent(student);
    }

    @PutMapping(value = "/updateStudent")
    public List<Student> updateStudent(@RequestBody Student student){

        return StudentService.updateStudent(student);
    }

    @DeleteMapping(value = "/deleteStudent")
    public List<Student> deleteStudent(@RequestBody Student student){

        return StudentService.deleteStudent(student);
    }
}
