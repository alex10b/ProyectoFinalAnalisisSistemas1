
import models.Estudiante;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paola Hernandez
 */
public class Main {
    
   

      public static void main(String args[])
        {
                Estudiante estudiante1= new Estudiante();
                
            
                // Ingreso los datos con los Setter a la nueva instancia de
                // Estudiante, estos datos pueden ingresarse desde teclado
                // o a través de una GUI
                estudiante1.setCarnet(1);
                estudiante1.setNombre("María");
                estudiante1.setApellido("Lopez");
                estudiante1.setCorreo("maria.paucar@umg.edu.ec");
                estudiante1.setCarrera(1);
                
                

                // Para obtener los datos uso los Getter
                // y los podemos imprimir en Consola o a una GUI
                System.out.println(estudiante1.getCarnet());
                System.out.println(estudiante1.getNombre());
                System.out.println(estudiante1.getApellido());
                System.out.println(estudiante1.getCorreo());
                System.out.println(estudiante1.getCarrera());
        }
}
    

