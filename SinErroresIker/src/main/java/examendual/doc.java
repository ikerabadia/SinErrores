/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendual;

/**
 *
 * @author Iker
 */
public interface doc {    
    /**
     * Devuelve el contenido del archivo tras insertar la linea line en la linea numero x, el contenido de la linea x, pasa a ser la linea x+1 y asi sucesivamente.
     * @param x numero de la linea en la que se quiere insertar el contenido de la linea line
     * @param line contenido que se desea insertar en la linea x
     * @param file archivo donde se guarda el contenido
     * @return contenido del archivo tras insertar la linea line en la linea numero x
     */
   public abstract String escribirLinea(int x, String line, String file);
   
   /**
    * Recibe una ciudad, calcula su area, y finalmente devuelve el area en km^2
    * @param ciudad ciudad de la que calcular el area, debe ser una ciudad existente
    * @return el area de la ciudad en kilometros cuadrados
    * 
    */
   public abstract int getAreaCiudad(String ciudad); 
}
