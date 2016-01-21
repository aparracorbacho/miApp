/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

/**
 *
 * @author aparracorbacho
 */
public class Contacto {
    private int id;
    private String nombre;
    private String apellido;
    private String numero;
    private String email;

    public void setId(int id ){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getNumero(){
        return numero;
    }    
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
            
    public void iContacto() {
        System.out.println("Contacto" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numero=" + numero + ", email=" + email);
    }
    
    
    
}
