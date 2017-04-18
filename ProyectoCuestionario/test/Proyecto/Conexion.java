/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;
import java.sql.*; 

public class Conexion {
     public static Connection conectarse(String login, String password)throws Exception{
        //Paso 1 escribir la url de conexion
        String url="jdbc:mysql://localhost:3306/mysql";
        //Paso 2 Cargar el driver en este caso de mysql
        Class.forName("com.mysql.jdbc.Driver");
        //Paso 3 Conectarse a mysql
        Connection con=DriverManager.getConnection(url,login, password);
        
        return con;
    
     }
}