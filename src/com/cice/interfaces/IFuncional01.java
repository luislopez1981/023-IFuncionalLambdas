/*
 *  INTERFACE FUNCIONAL : aquella que sólo contiene un método abstracto.
 *  NOTA: Una I.F. puede considerarse como tal aunque incluya métodos por defecto.
 *  METODO POR DEFECTO: son una funcionalidad de interfaces en JAVA SE8 (JDK 1.8).
 */
package com.cice.interfaces;

/**
 *
 * @author NYL
 */
public interface IFuncional01 {
    
    void suma (int a, int b); // Método abstracto.SÓLO PUEDE TENER UNO para considerarse FUNCIONAL.
    
    //Método por defecto: pueden definir una funcionalidad del método.
    //Pueden ser sobreescritos para cambiar su funcionalidad.
    default void resta (int a, int b){
        System.out.println("La resta es: "+ (a-b));
        
    }
    
}
