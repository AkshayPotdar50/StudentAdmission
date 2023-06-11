package com.example.student.StudentRegister.Controller;

import com.example.student.StudentRegister.model.Student;
import com.example.student.StudentRegister.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/allStudent")
    public List<Student> getAllStudents(){
     List<Student> list1=  studentServiceImpl.getAllStudents();
     return list1;
    }
@GetMapping("{stu_id}")
    public Student getStudentById(@PathVariable("stu_id") int stu_id){
       Student student1= studentServiceImpl.getStudentById(stu_id);
return student1;
    }

    @PostMapping("/save/Student")
    public Student saveStudent(@RequestBody Student student){
      Student student2 = studentServiceImpl.saveStudent(student);
      return student2;
    }
@DeleteMapping("/delete/{id}")
    public void DeleteById(@PathVariable("stu_id") int id){
        studentServiceImpl.DeleteById(id);
        System.out.println("employee is deleted");

    }
@PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentServiceImpl.saveStudent(student);

    }

}
