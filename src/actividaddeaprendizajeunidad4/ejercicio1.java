/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddeaprendizajeunidad4;

/**
 *
 * @author rafa pc
 */
public class ejercicio1 {
    public void eje1(){
        
        
        int matrixA[] = {1,2,3,4,5,6,7};
        
        int matrixB[];
        matrixB = new int[7];
       
      
        System.out.println("Matrix A:");
        
        for (int i = 0; i < matrixA.length; i++) {
            System.out.print(matrixA[i] + " ");
        }

        System.out.println("");
        System.out.println("Matrix B: Inversa de la Matrix A: ");
        
        int cantidad = matrixA.length -1;
        int cont = cantidad;
        for (int i = 0; i <= cantidad; i++) {
            
            matrixB[i] = matrixA[cont];
            
            cont--;
        }
        
        for (int i = 0; i < matrixB.length; i++) {
            System.out.print(matrixB[i] + " ");
        }
        

   
        
        System.out.println(""); //para el espacio al final
    }
}
