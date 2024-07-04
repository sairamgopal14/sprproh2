package com.ramgopal.model;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

@Entity  
@Table(name = "student")  // Specify the table name
public class Student {  

    @Id  
    @Column(name = "id")  // Specify the column name
    private int id;  
    
    @Column(name = "name")  // Specify the column name
    private String name;  
    
    @Column(name = "age")  // Specify the column name
    private int age;  
    
    @Column(name = "email")  // Specify the column name
    private String email;  
    
    // Getter and setter for id
    public int getId() {  
        return id;  
    }  
    
    public void setId(int id) {  
        this.id = id;  
    }  
    
    // Getter and setter for name
    public String getName() {  
        return name;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }  
    
    // Getter and setter for age
    public int getAge() {  
        return age;  
    }  
    
    public void setAge(int age) {  
        this.age = age;  
    }  
    
    // Getter and setter for email
    public String getEmail() {  
        return email;  
    }  
    
    public void setEmail(String email) {  
        this.email = email;  
    }  
}
