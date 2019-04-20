/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author AJO
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner (System.in);
        System.out.print("");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double D = (Math.pow(b,2)-(4*a*c));
        System.out.println("Polinomial = " +a+"x^2 + "+b+"x + "+ c + "memiliki");
        System.out.println("1. Diskriminan : " + D);
        if (D<0){
            D*=-1;
        }
        double E = ((-Math.sqrt(D)-b) /(2*a));
        double F = ((Math.sqrt(D)-b) /(2*a));
        System.out.println("2. Akar-akar dari polinomial : " + E + " dan " + F );
        double G = ((-1*b)/(2*a));
        double H = (-1 * D )/(4*a));
        System.out.println("3. Titik stationer : ( " + G + ", " + H " ) ");
        if (a>0){
            System.out.println("4. Kecekungan Kurva : Atas");}
        if (a<0){
            System.out.println("4.Kecekungan Kurva : Bawah");}
        if ( G > H ){
            System.out.println("5. Nilai minimum lokal : " + H );}
        if ( G < H ){
            System.out.println("5. Nilai minimum lokal : " + G );}
        
        }
   
        }

