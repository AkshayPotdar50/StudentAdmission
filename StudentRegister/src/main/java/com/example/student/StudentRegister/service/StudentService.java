package com.example.student.StudentRegister.service;

import com.example.student.StudentRegister.model.Student;

import java.util.List;

public interface StudentService {
    //create mthods for crud operations

    //getting all employee details

   public List<Student> getAllStudents();

   //getting record on based id
    public Student getStudentById(int id);

    //method for saving perticular employee
    public Student saveStudent(Student student);

    public void DeleteById(int id);

    public void updateStudent(Student student);






}
