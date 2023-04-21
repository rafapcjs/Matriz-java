/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddeaprendizajeunidad4;

/**
 *
 * @author rapa pc
 */
public class ejercicio3 {
    public void eje3(){
        int matrix[][] = new int[5][4];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 2;
        matrix[0][3] = 2;

        matrix[1][0] = 2;
        matrix[1][1] = 2;
        matrix[1][2] = 2;
        matrix[1][3] = 2;

        matrix[2][0] = 3;
        matrix[2][1] = 4;
        matrix[2][2] = 5;
        matrix[2][3] = 6;

        matrix[3][0] = 2;
        matrix[3][1] = 2;
        matrix[3][2] = 2;
        matrix[3][3] = 7;

        matrix[4][0] = 2;
        matrix[4][1] = 2;
        matrix[4][2] = 2;
        matrix[4][3] = 8;
System.out.println("Matrix Automatica: \n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
