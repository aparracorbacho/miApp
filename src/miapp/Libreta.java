/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miapp;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Libreta {
    private String nombre;
    private String dni;
    Contacto [] listaContactos = new Contacto[10];
    
    public void Libreta(String nombre, String dni){
        this.nombre=nombre;
        this.dni=dni;
        for (int i=0;i<listaContactos.length;i++){
            listaContactos[i]=new Contacto();
        }
    }
    
    public int cualLibre(){
        int id=-1;
        for (Contacto listaContacto : listaContactos) {
            if (listaContacto.getNombre() == null) {
                id = listaContacto.getId();
                break;
            }
        }
         return id;
    }
    
    public void agregarContacto(){
        if (cualLibre()<0){
            System.out.println("Tu agenda esta llena. Borra algun contacto");
        } else {
            int id = cualLibre();
            System.out.println("Introduce el nombre del contacto");
            Scanner nombreTeclado = new Scanner(System.in);
            String nombre = nombreTeclado.next();
            listaContactos[id].setNombre(nombre);
            
            System.out.println("Introduce el Apellido del contacto");
            Scanner apellidoTeclado = new Scanner(System.in);
            String apellido = apellidoTeclado.next();
            listaContactos[id].setApellido(apellido);
            
            System.out.println("Introduce el numero del contacto");
            Scanner numeroTeclado = new Scanner(System.in);
            String numero = numeroTeclado.next();
            listaContactos[id].setNumero(numero);
            
            System.out.println("Introduce el email del contacto");
            Scanner emailTeclado = new Scanner(System.in);
            String email = emailTeclado.next();
            listaContactos[id].setEmail(email);
            
            System.out.println("Contacto creado");
         
        }
    }
    
    public void eliminarContacto(){
        System.out.println("Que contacto quieres borrar, di el nombre");
        Scanner nBorrarTeclado = new Scanner(System.in);
        String nBorrar = nBorrarTeclado.next();
        
        for (Contacto listaContacto : listaContactos) {
            if (listaContacto.getNombre().equals(nBorrar)) {
                listaContacto.setNombre(null);
                listaContacto.setApellido(null);
                listaContacto.setNumero(null);
                listaContacto.setEmail(null);
            }
        }
    }
    
    public void modificarContacto(){
        
    }
    
}
