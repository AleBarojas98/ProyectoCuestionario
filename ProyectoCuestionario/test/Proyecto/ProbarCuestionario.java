/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Ale
 */
public class ProbarCuestionario {
    public static void main(String[] args) {
        
        try{
            // Creamos un objeto de tipo menso 
            Cuestionario c=new Cuestionario("¿Como te llamas? ", "Rocko","Diego","Alejandra","Ninguno"); 
            //Lo guardaremos
        
            DAOCuestionario.guardar(c);
            System.out.println("Guardado");
             
        
        
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
