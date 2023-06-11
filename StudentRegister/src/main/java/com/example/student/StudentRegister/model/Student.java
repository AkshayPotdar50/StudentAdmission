package com.example.student.StudentRegister.model;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private Long mobileno;

    public Student(int id, String name, String address, Long mobileno) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileno = mobileno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobileno=" + mobileno +
                '}';
    }
}
