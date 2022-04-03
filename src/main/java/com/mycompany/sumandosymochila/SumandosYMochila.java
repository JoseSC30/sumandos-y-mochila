/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sumandosymochila;

import java.util.LinkedList;
import java.util.Objects;

/**
 *
 * @author jose luis
 */
public class SumandosYMochila {
    //-- Complemento.
    private int suma(LinkedList<Integer> L1){
        Integer r = 0;
        for(Integer recorrido: L1) {
            r = r + recorrido;
        }
        return r;
    }
    
    private int multiplicacion(LinkedList<Integer> L1){
        Integer r = 1;
        for(Integer recorrido: L1) {
            r = r * recorrido;
        }
        return r;
    }
    
    private boolean esPrimo(int n){
        for(int i = 2; i < n ; i++) {
            if((n % i) == 0 ) {
                return false;
            }
        }
        return true;
    }
    
    private int decimalABinario(int n){
    if (n == 1) {
        return 1;
    } else {
        int resultado1 = decimalABinario(n/2);
        return ((resultado1 * 10) + n % 2);
    }
}
    //-- Para el trabajo con las Listas.
    private boolean esDivisor(int numero, int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if(i == numero) {
                    return true;
                }
            }   
        }
        return false;
    }
    
    private boolean listaDiferente(LinkedList<Integer> L1){
        Integer r = 0;     
        for(Integer recorrido: L1) {
            if(Objects.equals(recorrido, r)) {
                return false;
            }
            if(recorrido > r){
                r = recorrido;
            }
        }
        return true;
    }
    
    private boolean listaIguales(LinkedList<Integer> L1){
        Integer r = L1.getFirst();     
        for(Integer recorrido: L1) {
            if(!Objects.equals(recorrido, r)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean listaPrimos(LinkedList<Integer> L1){ 
        boolean r = true;
        for(Integer recorrido: L1) {
            if(!esPrimo(recorrido)) {
                return false;
            }
        }
        return r;
    }
    
    private boolean listaEntreAB(LinkedList<Integer> L1, int a, int b){ 
        if((L1.getFirst() >= a) && (L1.getLast() <= b)){
            return true;
        }
        return false;
    }
    
    private boolean listaPares(LinkedList<Integer> L1){
        for(Integer recorrido: L1) {
            if(recorrido%2 != 0) {
                return false;
            }
        }
        return true;
    }
    
    private boolean listaImpares(LinkedList<Integer> L1){
        for(Integer recorrido: L1) {
            if(recorrido%2 == 0) {
                return false;
            }
        }
        return true;
    }
    
    private String listaBinario(LinkedList<Integer> L1){
        String b = "[";
        for(Integer recorrido: L1) {
            b = b + decimalABinario(recorrido) + ",";
        }
        b = b.substring(0, b.length()-1) + "]";
        return b;
    }
    
    private boolean listaDivisores(LinkedList<Integer> L1, int n){
        for(Integer recorrido: L1) {
            if(!esDivisor(recorrido, n)) {
                return false;
            }
        }
        return true;
    }
    
//Dado un entero N, encontrar todos los sumandos posibles, enteros positivos de N.
//
//-- Encontrar los sumandos posibles en una Lista.
//-- Encontrar todos los sumandos posibles diferentes en una Lista.
//-- Encontrar todos los sumandos posibles iguales en una Lista.
//-- Encontrar todos los sumandos primos posibles en una Lista.
//-- Encontrar todos los sumandos entre a y b inclusive en una Lista.
//-- Proponer adicionalmente otros problemas similares interesantes sobre Sumandos y/o sus variantes.
    
    public void sumandos(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if(sum == n) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandos(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }    
    }
    
    public void sumandosDiferentes(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaDiferente(L1))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
                L1.add(k);
                sumandosDiferentes(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosIguales(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaIguales(L1))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosIguales(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosPrimos(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaPrimos(L1))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosPrimos(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosEntreAB(LinkedList<Integer> L1, int n, int i, int a, int b) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaEntreAB(L1,a,b))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosEntreAB(L1, n ,k, a, b);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosPares(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaPares(L1))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosPares(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosImpares(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaImpares(L1))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosImpares(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosBinario(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n)) {
            String binario = listaBinario(L1);
            System.out.println(binario);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosBinario(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    public void sumandosDivisores(LinkedList<Integer> L1, int n, int i) {
        int sum = suma(L1);
        if(sum > n) return;
        if((sum == n) && (listaDivisores(L1, n))) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            sumandosDivisores(L1, n ,k);
            L1.removeLast();
            k = k + 1;
        }
    }
    
    
//*****************************************************************************//

// Dado un entero N, encontrar todos los factores posibles, enteros positivos de N.
//
//-- Encontrar los factores posibles en una Lista.
//-- Encontrar todos los factores posibles diferentes en una Lista.
//-- Encontrar todos los factores posibles iguales en una Lista.
//-- Encontrar todos los factores primos posibles en una Lista.
//-- Encontrar todos los factores entre a y b inclusive en una Lista.
//-- Proponer adicionalmente otros problemas similares interesantes sobre Factores y/o sus variantes y/o Combinarlos.    

//    public void factoresTODOS(LinkedList<Integer> L1, int n, int i) {
//        if(i > n+1) return;
//        if((i == n+1)) {
//            System.out.println(L1);
//            return;
//        }
//        //LinkedList<Integer> listaAux = L1;
//        int k = 1;
//        while(k <= n+1){
//            if (((n/i) == k) && (n%i == 0)) {
//                L1.add(k);
//            } else {
//                if(k == n+1){
//                    factoresTODOS(L1, n ,i+1);
//                }
//            }
//                k++;
//        }
//    }
    
    public void factores(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factores(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factores(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresDiferentes(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaDiferente(L1)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresDiferentes(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresDiferentes(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresIguales(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaIguales(L1)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresIguales(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresIguales(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresPrimos(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaPrimos(L1)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresPrimos(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresPrimos(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresEntreAB(LinkedList<Integer> L1, int n, int i, int a, int b) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaEntreAB(L1, a, b)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresEntreAB(L1, n, n, a, b);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresEntreAB(L1, n, k, a, b);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresPares(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaPares(L1)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresPares(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresPares(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresImpares(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n) && listaImpares(L1)) {
            System.out.println(L1);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresImpares(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresImpares(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
    public void factoresBinario(LinkedList<Integer> L1, int n, int i) {
        int fac = multiplicacion(L1);
        if(fac > n) return;
        if(fac == n && (L1.getFirst() != n)) {
            String binario = listaBinario(L1);
            System.out.println(binario);
            return;
        }
        int k = i;
        while(k <= n){
            L1.add(k);
            if (L1.getFirst()== 1) {
                L1.add(n);
                factoresBinario(L1, n, n);
                L1.removeLast();
                L1.removeLast();
                k = k + 1;
            } else {
                factoresBinario(L1, n, k);
                L1.removeLast();
                k = k + 1;
            }
        }    
    }
    
//*****************************************************************************//    
    public void mochila(LinkedList<Integer> L1,
                        LinkedList<Integer> L2,int max, int i) {
        int sum = suma(L2);
        if(sum > max) return;
        System.out.println(L2);
        
        int k = i;
        while(k < L1.size()) {
            L2.add(L1.get(k));
            mochila(L1, L2, max, k + 1);
            L2.removeLast();
            k = k + 1;
        }
    }
}

