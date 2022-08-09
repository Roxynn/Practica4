/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author robin
 */

// Padre e hijo, herencia
public class Usuario extends Persona{
    
    
   private String usuario;
   private String contra;
    
    
    public Usuario (String usuario, String contra, String nombre, String apellido,String correo, String telefono){
    
    super(nombre,apellido,correo,telefono);
    this.usuario=usuario;
    this.contra=contra;
        
    }
    
    
    // Encapslm, listo.
        
   public String getUsuario(){
   
       
       return this.usuario;
   }
    
   public void setUsuario(String usuario){
       
       this.usuario=usuario;
       
   }
    
    
       
   public String getContra(){
   
       
       return this.contra;
   }
    
   public void setContra(String contra){
       
       this.contra=contra;
       
   }
    
}


