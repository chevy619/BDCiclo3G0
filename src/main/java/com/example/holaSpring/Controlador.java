/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.holaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lore-
 */
@RestController
public class Controlador {
    @GetMapping("/")
    public String mensaje(){
        return "Haciendo prueba en Oracle cloud";
    }
}
