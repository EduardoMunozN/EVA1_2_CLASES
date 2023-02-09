/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_2_clases;

/**
 *
 * @author eduar
 */
public class EVA1_2_CLASES {

    public static void main(String[] args) {
        //persona -- constructor
        //constructor -- método
        //INSTANCIACIÓN
       //1. Declarar el identificadoor para el objeto
       //2. Asignar memoria con new.
       //3. Invocar su constructor
        Persona person1 = new Persona();
        //System.out.println(person1);
        /*
        //ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS
        //ATRIBUTOS CON MODIFICADOR DEFAULT
         person1.nombre ="Eduardo";
        person1.apellido ="Muñoz";
        person1.edad = 18;
        person1.estadoCivil = false; //true es casado
        
        System.out.println(person1.nombre); */
        person1.setNombre("Rubén Eduardo");
        person1.setApellido("Muñoz Nieto");
        person1.setEdad(18);
        person1.setEstadoCivil(false);
        person1.imprimirDatos();
        
        //persona 2
        
        Persona person2 = new Persona();
        person2.setNombre("Juan Alberto");
        person2.setApellido("Dominguez Nieto");
        person2.setEdad(19);
        person2.setEstadoCivil(true);
        person2.imprimirDatos();
        
        
    }
}
