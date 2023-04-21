/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddeaprendizajeunidad4;

import java.util.Scanner;

/**
 *
 * @author JOHN
 */
public class ejercicio2 {

    public void eje2() {
        Scanner xd = new Scanner(System.in);

int matriz [][]= new int [3][3];


matriz [0][0]=1;
matriz [0][1]=1;
matriz [0][2]=1;

matriz [1][0]=1;
matriz [1][1]=1;
matriz [1][2]=1;

matriz [2][0]=1;
matriz [2][1]=1;
matriz [2][2]=1;


        System.out.println("la matriz es");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                
            }
            
        }
            
        }



    }