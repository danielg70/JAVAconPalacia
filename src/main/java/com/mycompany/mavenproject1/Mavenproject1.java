/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author danie
 */
public class Mavenproject1 {

    public int SumaDeTresNumeros(int numero1, int numero2, int numero3){
        int suma = numero1 + numero2 + numero3;
        return suma;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mavenproject1 project = new Mavenproject1(); 
        
        System.out.println(project.SumaDeTresNumeros(12,3,4));
    }
}
