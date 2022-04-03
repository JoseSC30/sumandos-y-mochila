/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumandosymochila;

//import static com.mycompany.sumandosymochila.SumandosYMochila.sumandos;
import java.util.LinkedList;

/**
 *
 * @author jose luis
 */
public class Main {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> L1 = new LinkedList<Integer>();
        LinkedList<Integer> L2 = new LinkedList<Integer>();
        int n = 8;
        int i = 1;
        
        int a = 2;
        int b = 6;
        
        //int max = 10;
     
        SumandosYMochila sm = new SumandosYMochila();
        
        //-- SUMANDOS
        
        System.out.println("Sumandos");
        sm.sumandos(L1, n, i);
        
        System.out.println("Sumandos Diferentes");
        sm.sumandosDiferentes(L1, n, i);
        
        System.out.println("Sumandos Iguales");
        sm.sumandosIguales(L1, n, i);
        
        System.out.println("Sumandos Primos");
        sm.sumandosPrimos(L1, n, i);
        
        System.out.println("Sumandos Entre " + a + " y " + b);
        sm.sumandosEntreAB(L1, n, i , a, b);
        
        System.out.println("Sumandos Pares");
        sm.sumandosPares(L1, n, i);
        
        System.out.println("Sumandos Impares");
        sm.sumandosImpares(L1, n, i);
        
        System.out.println("Sumandos Binario");
        sm.sumandosBinario(L1, n, i);
        
        System.out.println("Sumandos Divisores");
        sm.sumandosDivisores(L1, n, i);
        
        //-- FACTORES
        
//        System.out.println("Muestra de todos los factores");
//        sm.factoresTODOS(L1, n, i);
        
        System.out.println("Factores");
        sm.factores(L2, n, i);
        
        System.out.println("Factores Diferentes");
        sm.factoresDiferentes(L2, n, i);
        
        System.out.println("Factores Iguales");
        sm.factoresIguales(L2, n, i);
        
        System.out.println("Factores Primos");
        sm.factoresPrimos(L2, n, i);

        System.out.println("Factores Entre " + a + " y " + b);
        sm.factoresEntreAB(L2, n, i, a, b);
        
        System.out.println("Factores Pares");
        sm.factoresPares(L2, n, i);
        
        System.out.println("Factores Impares");
        sm.factoresImpares(L2, n, i);
        
        System.out.println("Factores Binario");
        sm.factoresBinario(L2, n, i);      
        
//        System.out.println("------------");
//        System.out.println("Mochila");
//        L1.add(2);
//        L1.add(3);
//        L1.add(5);
//        L1.add(6);
//        sm.mochila(L1, L2, max, i);
    }  
}
