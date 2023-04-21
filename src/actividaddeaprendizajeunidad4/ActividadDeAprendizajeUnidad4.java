/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddeaprendizajeunidad4;

import javax.swing.JOptionPane;

/**
 *
 * @author rafael pc
 */
public class ActividadDeAprendizajeUnidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        do{
            String men=  "";
            men+= "---------ACTIVIDAD UNIDAD 4 ----------\n\n";
            men+= "1) Ejercicio de Matrix Inversa.\n";
            men+= "2) Ejercicio de Matrix Automatica 1.\n";
            men+= "3) Ejercicio de Matrix Automatica 2.";
            men+= "0) Para salir.";
            
            num = Integer.parseInt(JOptionPane.showInputDialog(men));
            
            switch(num){
                
                case 1: 
                    ejercicio1 operar1 = new ejercicio1();
                    operar1.eje1();
                    break;
            
                case 2: 
                    ejercicio2 operar2 = new ejercicio2();
                    operar2.eje2();
                    break;
                    
                case 3: 
                    ejercicio3 operar3 = new ejercicio3();
                    operar3.eje3();
                    break;
                    
                default : System.out.println(" se acabo chiqui");
                
            }
            
        }while(num != 0);
        
        
    }
    
}
