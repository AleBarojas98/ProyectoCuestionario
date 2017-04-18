/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;


import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOCuestionario {
    //Primera operacion insert 
    public static void guardar(Cuestionario c)throws Exception{
    Connection con=Conexion.conectarse("root", ""); 
   
   //Generamos un Prepared Statement 
   PreparedStatement ps= con.prepareStatement("insert into pregunta values(?,?,?,?,?)" ); 
   ps.setString(1, c.getPregunta());
   ps.setString(2, c.getOpcion1());
   ps.setString(3, c.getOpcion2());
   ps.setString(4, c.getOpcion3());
   ps.setString(5, c.getOpcion4());
  
   ps.execute(); 
  
    }
    
}