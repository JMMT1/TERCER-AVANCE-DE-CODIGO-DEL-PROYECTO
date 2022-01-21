/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinical;

import javax.swing.JOptionPane;

/**
 *
 */
public class Paciente extends Datos_Personales {

    String padecimiento, doctor, historial;
    int numero, opt = -1;

    public Paciente(String padecimiento, String doctor, String historial, String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        super(nombre, correo, edad, sexo, telefono, domicilio);
        this.padecimiento = padecimiento;
        this.doctor = doctor;
        this.historial = historial;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
   
    

    
    
    
    
    
    
    
    
    
        //Metodo de nuevo paciente 
    public boolean nuevoDoctor(int pacientes,String padecimiento, String doctor, String historial, String nombre, String correo, String edad, String sexo, String telefono, String domicilio) {
        try {
            while (opt != 0) {
                if (pacientes <= 10) {
                    setPadecimiento(padecimiento);
                    setDoctor(doctor);
                    setHistorial(historial);
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
                +"\nPadecimiento: "+getPadecimiento()
                +"\nDoctor: "+getDoctor()
                +"\nHistorial: "+getHistorial()
                +"\nCorreo: "+getCorreo()
                +"\nTelefono: "+getTelefono()
                +"\nDomicilio: "+getDomicilio();
        return datos;
    }



}
