/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexión;

import com.mysql.jdbc.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class Conexión {
    
    Connection conectar=null;
    
    public Connection conexion(){
    
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/usuarios","root","");
            
          
        } catch(Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        }
        return conectar;
    }
    
    
}
