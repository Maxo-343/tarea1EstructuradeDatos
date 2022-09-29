/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tare1estructura;

/**
 *
 * @author joset
 */
public class Tare1Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int [][] matriz = new int [3][3];
      int cont = 1;
      int sumaDiagI = 0;
      int sumaDiagD = 0;
      int  acumulador1 = 0;
      
      for (int f = 0; f < matriz.length; f++) {
          for (int c = 0; c < matriz[f].length; c++){
              matriz [f] [c] = cont++;
              
          }
      } 
      
      for( int fil = 0 ;  fil < matriz.length ; fil++){
            for( int colu = 0;  colu < matriz[fil].length; colu++ ){
                acumulador1 +=  matriz[ fil ] [ colu ];         
            }
        }
        System.out.println( "ls sumatoria total es de: " +acumulador1);
      
      for (int fila = 0; fila < matriz.length; fila++){
            for (int col = 0; col < matriz[fila].length; col++){
                if ( fila == col){
                    sumaDiagI += matriz[fila][col];
                }
            }
        }
      System.out.println("La suma de la diagonal izquierda es: " +sumaDiagI);
      
      for(int fila = 0; fila < matriz.length; fila++){
            for(int col = 0; col < matriz[fila].length; col++){
                if(fila + col == (matriz.length - 1)){
                    sumaDiagD += matriz[fila][col];
                }
            }
        }
      
      System.out.println("La suma de la diagonal derecha es: " +sumaDiagD);
      
      for (int i = 0; i < matriz.length; i++) {
          for (int j = 0; j < matriz[i].length; j++) {
              System.out.print( "   " +matriz [i] [j] );
          }
          System.out.println("");
      }
        
    }
    
}
