/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista;

/**
 *
 * @author Fernando
 */
public class Lista {

    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int i, contador=0;
        
        for(i=0;i<v1.length;i++){
            v1[i] = Funcionetes.lligInt("Introduce el numero " + (i+1) + ": ");
        }
        
        for (i=v1.length-1;i>-1;i--){
            v2[contador] = v1[i];
            contador++;
        }
        
        System.out.println("");
        System.out.println("La lista 2 es: ");
        
        for(i=0;i<v1.length;i++){
            System.out.println(v2[i]);
        }
        
        System.out.println("");
        System.out.println("La sumas es: ");
        
        for(i=0;i<v1.length;i++){
            System.out.println("La suma de " + v1[i] + " + " + v2[i] + " = " + (v1[i]+v2[i]));
        }
    }
}
