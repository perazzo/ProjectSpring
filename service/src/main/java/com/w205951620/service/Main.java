/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.w205951620.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Perazzo
 */
public class Main {
    public static void main(String [] args){
        ApplicationContext context =
               new ClassPathXmlApplicationContext(new String[] {"ServiceConfig.xml"});
        StudentManager test = (StudentManager) context.getBean("StudentManager");

       test.printStudent();
    }
}
