/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.crce.interns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Leon
 */
@Controller
public class TestController {
    @RequestMapping("/sendMail")
    public String doSomething()
    {
        System.out.println("Reached Here");
        return "EmailForm";
    }
            
}
