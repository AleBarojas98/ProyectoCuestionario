/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocuestionario;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class DAOCuestionario {
    //Primera operacion insert 
    public static void guardar(Ingresar i)throws Exception{
    Connection con=Conexion.conectarse("root", ""); 
   
   //Generamos un Prepared Statement 
   PreparedStatement ps= con.prepareStatement("insert into preguntas values(?,?,?,?,?)" ); 
   ps.setString(1, i.getPregunta());
   ps.setString(2, i.getOpcion1());
   ps.setString(3, i.getOpcion2());
   ps.setString(4, i.getOpcion3());
   ps.setString(5, i.getOpcion4());
   
   ps.execute(); 
  
    }
    
}
