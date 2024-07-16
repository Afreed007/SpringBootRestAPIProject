package com.afreed.restapi.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    @Column(name = "Student_name")
    private String name;    
    @Column
    private float percentage;
    @Column(name = "Student_branch")
    private String branch;

    public Student(){
        // TODO Auto-generated constructor stub
    }
    

    public Student(String name, float percentage, String branch) {
        this.name = name;
        this.percentage = percentage;
        this.branch = branch;
    }


    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public float getPercentage() {
        return percentage;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
                + "]";
    }
;}
