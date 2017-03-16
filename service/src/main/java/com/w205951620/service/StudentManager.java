/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w205951620.service;

import com.w205951620.dao.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Perazzo
 */
@Service("StudentManager")
public class StudentManager {
    @Autowired
    Student st = new Student();
    
    public void printStudent(){
        System.out.println("\n\nStudent Information");
        System.out.println(st.getFirstName() + " " + st.getLastName());
        System.out.println("DOB: " + st.getDob());
        System.out.println("Address: " + st.getAddress().getStreet() + ", " + 
                st.getAddress().getCity() + " " + st.getAddress().getZip());
        System.out.println("Class: " + st.getGrade().getSubject() + ". Grade: " + 
                st.getGrade().getLetterGrade());
        System.out.println("\n\n");
    }
}
