/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.tarea7.controllers;

/**
 *
 * @author roman
 */
import com.example.tarea7.url.url;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class maincontroller {

    private String message = "greeting";

    @RequestMapping("/")
    public String greeting(Map<String, Object> model) throws IOException {
        System.out.println("Comienzo");
        model.put("message", this.message);
        List<url> references = new ArrayList<>();
            references.add(new url ("http://url1.com", "URL One"));
            references.add(new url ("http://url2.com", "URL Two"));
            references.add(new url("http://url3.com", "URL Three"));
            
        model.put("referencesR", references);
        
        
        return "newhtml";
    }

}
