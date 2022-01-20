/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinical;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Chavez
 */
public class Medico extends Datos_Personales {

    String cedula, especialidad, departamento, egresado;
    int numero, opt = -1;
    public static int total =0;
    

    public Medico(String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        super(nombre, correo, edad, sexo, telefono, domicilio);
    }

    
    
    public Medico(String cedula, String especialidad, String departamento, String egresado, String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        super(nombre, correo, edad, sexo, telefono, domicilio);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.egresado = egresado;
        total++;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEgresado() {
        return egresado;
    }

    public void setEgresado(String egresado) {
        this.egresado = egresado;
    }

    //Metodo de nuevo paciente 
    public boolean nuevoDoctor(int doctores,String cedula, String especialidad, String departamento, String egresado, String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        try {
            while (opt != 0) {
                if (doctores <= 10) {
                    setCedula(cedula);
                    setEspecialidad(especialidad);
                    setDepartamento(departamento);
                    setEgresado(egresado);
                    setNombre(nombre);
                    setCorreo(correo);
                    setEdad(edad);
                    setSexo(sexo);
                    setTelefono(telefono);
                    setDomicilio(domicilio);
                    

                }
                break;
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido",
                    "Error", JOptionPane.WARNING_MESSAGE);
            
        }
        return true;
    }

    //Metodo de mostrar paciente
    public String mostrarMedico() {
        String datos;
        datos = "\nNombre: "+getNombre()
                +"\nEdad: "+ getEdad()
                +"\nSexo: "+ getSexo()
                +"\nEspecialidad: "+getEspecialidad()
                +"\nDepartamento: "+getDepartamento()
                +"\nEgresado: "+getEgresado()
                +"\nCedula: " +getCedula()
                +"\nCorreo: "+getCorreo()
                +"\nTelefono: "+getTelefono()
                +"\nDomicilio: "+getDomicilio();
        return datos;
    }

}
