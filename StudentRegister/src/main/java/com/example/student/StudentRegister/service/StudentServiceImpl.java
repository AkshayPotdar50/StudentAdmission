package com.example.student.StudentRegister.service;

import com.example.student.StudentRegister.model.Student;
import com.example.student.StudentRegister.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentRepository StudentRepository;


    @Override
    public List<Student> getAllStudents() {
        List<Student> list= new ArrayList<Student>();
        StudentRepository.findAll().forEach(empl->list.add(empl)); //this findall method will return the iterable object henece
        // we have to use java 8 feature foreach
        return list;
    }

    @Override
    public Student getStudentById(int id) {
       Student student= StudentRepository.findById(id).get();//here we ahve used java 8 feature get
        //find by id returns optional employee to avoid nullPointerException
        //we have to make return type as optional
        return student;
    }

    @Override
    public Student saveStudent(Student student) {
      Student student1=  StudentRepository.save(student);
        return student1;
    }

    @Override
    public void DeleteById(int id) {
        StudentRepository.deleteById(id);
        System.out.println("student record are deleted successfully");

    }

    @Override
    public void updateStudent(Student student) {
        StudentRepository.save(student);

    }
}
