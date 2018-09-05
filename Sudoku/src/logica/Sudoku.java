/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Presentacion.SudokuModelo;

/**
 *
 * @author estudiantes
 */
public class Sudoku {
    public Sudoku() 
    {
        mtzNumeros = new int[9][9];
    }
    
    //<editor-fold defaultstate="collapsed" desc="Miembros">  
         private int[][] mtzNumeros;
    // </editor-fold>  
         
    //<editor-fold defaultstate="collapsed" desc="Propiedades">  
        public int[][] getTablero()
        {
            return mtzNumeros;
        }
    // </editor-fold>  
        
    //<editor-fold defaultstate="collapsed" desc="Metodos">  
        public void ingreasrValorMatriz(int x, int y ,int valor)
        {
             this.getTablero()[x][y]=valor;
        }

         public boolean validarMovimientoHorizontal(int x, int y, int numero) 
         {
             boolean ban = true;
             for (int j = 0; j <= 8; j++) {
                 if (j != y) {
                     if (mtzNumeros[x][j] == numero) {
                         ban = false;
                         break;
                     }
                 }
             }
             return ban;
         }

         public boolean validarMovimientoVertical(int x, int y, int numero) 
         {
             boolean ban = true;
             for (int i = 0; i <= 8; i++) {
                 if (i != x) {
                     if (mtzNumeros[i][y] == numero) {
                         ban = false;
                         break;
                     }
                 }
             }
             return ban;
         }

         private int buscarLimite(int cuadrante) 
         {
             int limiteInf = 0;
             int limiteSupe = 0;
             if (cuadrante == 1) {
                 limiteInf = 1;
                 limiteSupe = 3;
             }
             if (cuadrante == 2) {
                 limiteInf = 4;
                 limiteSupe = 6;
             }
             if (cuadrante == 3) {
                 limiteInf = 7;
                 limiteSupe = 9;
             }
             return (limiteInf + limiteSupe);
         }

         private int buscarCuadrante(int coordenada) 
         {
             int cuadrante = 0;
             int cociente;
             int modulo;

             cociente = coordenada / 3;
             modulo = coordenada % 3;

             if (cociente == 0) {
                 cuadrante = 1;
             }
             if (cociente == 1 && modulo == 0) {
                 cuadrante = 1;
             }
             if (cociente == 1 && modulo > 0) {
                 cuadrante = 2;
             }
             if (cociente == 2 && modulo == 0) {
                 cuadrante = 2;
             }
             if (cociente == 2 && modulo > 0) {
                 cuadrante = 3;
             }
             if (cociente == 3 && modulo == 0) {
                 cuadrante = 3;
             }

             return cuadrante;
         }

         public boolean validarFinal() 
         {
             boolean ban = true;

             for (int i = 0; i <= 8; i++) {
                 for (int j = 0; j <= 8; j++) {
                     if (mtzNumeros[i][j] == 0) {
                         ban = false;
                         break;
                     }
                 }
                 if (!ban) {
                     break;
                 }
             }
             return ban;
         }

         public boolean validarCuadrante(int x, int y, int numero) 
         {
             boolean ban = true;
             int cuadrantex = this.buscarCuadrante(x + 1);
             int cuadrantey = this.buscarCuadrante(y + 1);
             int limiteInfx = 0;
             int limiteSupx = 0;
             int limiteInfy = 0;
             int limiteSupy = 0;

             int limiteBuscado = this.buscarLimite(cuadrantex);

             if (limiteBuscado == 4) {
                 limiteInfx = 1;
                 limiteSupx = 3;
             }
             if (limiteBuscado == 10) {
                 limiteInfx = 4;
                 limiteSupx = 6;
             }
             if (limiteBuscado == 16) {
                 limiteInfx = 7;
                 limiteSupx = 9;
             }
             limiteBuscado = this.buscarLimite(cuadrantey);
             if (limiteBuscado == 4) {
                 limiteInfy = 1;
                 limiteSupy = 3;
             }
             if (limiteBuscado == 10) {
                 limiteInfy = 4;
                 limiteSupy = 6;
             }
             if (limiteBuscado == 16) {
                 limiteInfy = 7;
                 limiteSupy = 9;
             }

             for (int i = (limiteInfx - 1); i <= (limiteSupx - 1); i++) {
                 for (int j = (limiteInfy - 1); j <= (limiteSupy - 1); j++) {
                     if (!(i == x && j == y)) {
                         if (mtzNumeros[i][j] == numero) {
                             ban = false;
                             break;

                         }
                     }
                 }
                 if (!ban) {
                     break;
                 }
             }
             return ban;
         }

         public void llenarMatrizInicial() 
         {
             for (int i = 0; i <= 8; i++) {
                 for (int j = 0; j <= 8; j++) {
                     this.mtzNumeros[i][j] = 0;
                 }
             }

             mtzNumeros[0][1] = 4;
             mtzNumeros[0][3] = 6;
             mtzNumeros[0][7] = 2;

             mtzNumeros[1][0] = 5;
             mtzNumeros[1][7] = 7;
             mtzNumeros[1][8] = 9;

             mtzNumeros[2][2] = 6;
             mtzNumeros[2][4] = 7;

             mtzNumeros[3][2] = 3;
             mtzNumeros[3][5] = 6;

             mtzNumeros[4][3] = 5;
             mtzNumeros[4][4] = 3;

             mtzNumeros[5][1] = 5;
             mtzNumeros[5][3] = 4;

             mtzNumeros[6][1] = 9;
             mtzNumeros[6][4] = 8;
             mtzNumeros[6][8] = 4;

             mtzNumeros[7][0] = 3;
             mtzNumeros[7][4] = 6;
             mtzNumeros[7][8] = 2;

             mtzNumeros[8][3] = 1;
             mtzNumeros[8][5] = 2;
             mtzNumeros[8][8] = 3;
         }
       // </editor-fold>  

}
