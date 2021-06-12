/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Alex
 */
public class Usuario {
    String rol,nombre,password;

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String rol, String nombre, String password) {
        this.rol = rol;
        this.nombre = nombre;
        this.password = password;
    }
    
    public boolean logIn(String nombre, String pass){
        boolean rp = false;
        if(this.nombre.equals(nombre) && this.password.equals(pass)){
            rp = true;
        }
        return rp;
    }
    public boolean logOut(){
       
        return true;
    }
  
}
