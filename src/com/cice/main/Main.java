/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.main;

import com.cice.interfaces.IFuncional01;
import com.cice.interfaces.IFuncional02;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author NYL
 */
public class Main {

    public static void main(String[] args) {

        /*IFuncional01 funcional = new IFuncional01() {
            @Override
            public void suma(int a, int b) {
                System.out.println("La suma es: " + (a + b));
            }
        };

        //Nuestra primera expresión Lambda.
        IFuncional01 func = (a, b) -> (System.out.println("La suma es: " + (a + b)));
        func.suma(4, 6);
        func.resta(0, 0);

        //ANALISIS DE LA EXPRESIÓN LAMBDA:
        //(a,b)  ******** Parámetros de entrada.
        //-> ************ Operador Lambda.
        //(....)********* Funcionalidad del método.
        func = (a, b) -> System.out.println("Otra cosa:");
        func.suma(2, 3);

        func = (a, b) -> {
            //Esto es un bloque de código lambda.  
        };
         */
        /////////////////////////////////////////////
        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Gustavo");
        listaNombres.add("Pedro");
        listaNombres.add("Marcela");
        listaNombres.add("Ana");
        listaNombres.add("Virginia");
        listaNombres.add("Sergio");
        listaNombres.add("Sara");

        //ordenar(listaNombres);
        IFuncional02 interfaz = (a) -> (new ArrayList<>(new PriorityQueue<>(a)));

       
        //Esto es lo que yo he hecho y no sale bien ordenada.
        List<String> ordenada = interfaz.ordenarLista(listaNombres);

        for (int i = 0; i < ordenada.size(); i++) {
            System.out.println("Nombre:" + ordenada.get(i));
        }

    }

    public static void ordenar(List<String> lista) {

        PriorityQueue<String> cola = new PriorityQueue<>(lista);

        do {
            System.out.println("Nombre: " + cola.poll());

        } while (cola.size() > 0);

    }
}
