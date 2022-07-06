/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author danie
 */
public class Auto {

    int PuertasAuto = 0;
    
}
class CreaciondelAuto 
{
     public static void main(String[] args) {
         Auto obj1 = new Auto();
       int Fabricacion1 = 3;
       int Suma = obj1.PuertasAuto + Fabricacion1;
       String frase = "La cantidad de puertas del auto es " + Suma;
       System.out.println(frase);
    }
}
