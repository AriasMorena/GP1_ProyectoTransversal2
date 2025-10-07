/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entidades;

import entidades.Alumno;
import java.time.LocalDate;
import persistencia.AlumnoData;

/**
 *
 * @author lucio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  Alumno Morena = new Alumno (11455098, "Arias", "Morena", LocalDate.of(2003, 11, 14), true);
    AlumnoData alumn = new AlumnoData();
    alumn.guardarAlumno(Morena); 
    
    }           
}
