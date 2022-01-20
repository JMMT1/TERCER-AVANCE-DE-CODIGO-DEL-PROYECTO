/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinical;

/**
 *
 * @author Jesus Chavez
 */
public abstract class Datos_Personales {
    String nombre, correo, edad, sexo, telefono, domicilio;

    
    //Metodo constructor, para inicializar las variables
    public Datos_Personales(String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }

    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    
    
    
}
