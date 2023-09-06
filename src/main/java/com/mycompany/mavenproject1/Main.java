/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jchavez
 */
public class Main {
    
   public static void main(String[] args) throws IOException{
        System.out.println("Ingresar el primer numero ");
        int primerDato = cargarNumero();
        
        Boolean esPar = primerDato % 2 == 0;
        if (esPar) {
        System.out.println("El numero es par");
        } else {
        System.out.println("El numero es impar");   
        }
        
        /*System.out.println("Ingresar el segundo numero ");
        int segundoDato = cargarNumero();
        
        System.out.println("Ingresar el tercer numero ");
        int tercerDato = cargarNumero();

        calcularNumeroMayor(primerDato,segundoDato,tercerDato);
        calcularNumeroMenor(primerDato,segundoDato,tercerDato);
        calcularPromedio(primerDato,segundoDato,tercerDato);*/
   }

   private static int cargarNumero() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String strDato = reader.readLine();
        int Dato = Integer.parseInt(strDato);
        return Dato;
   }

    /*private static void calcularNumeroMayor(int primerDato,int segundoDato,int tercerDato) {

    int resultadoMayor = Math.max(primerDato,segundoDato);
    System.out.println("El numero mayor es " +Math.max(tercerDato,resultadoMayor));

    }
    
    private static void calcularNumeroMenor(int primerDato,int segundoDato,int tercerDato) {

    int resultadoMenor = Math.min(primerDato,segundoDato);
    System.out.println("El numero menor es " +Math.min(tercerDato,resultadoMenor));

    }
    
    private static void calcularPromedio(int primerDato,int segundoDato,int tercerDato) {

    int sumaTotal = (primerDato+segundoDato+tercerDato);
    Double promedioFinal = Double.valueOf(sumaTotal)/3;
    System.out.println("El promedio es " + promedioFinal);
    }*/
}