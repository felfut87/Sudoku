package Presentacion;

import java.awt.Color;
import logica.Sudoku;
/**
 * @author Asesoftware
 */
public class SudokuModelo {
    
         //<editor-fold defaultstate="collapsed" desc="Miembros">  
        private VistaPrincipal ventanaPrincipal;
        private Sudoku logica;
        private String casillaPresionada;
        private boolean error;
       // </editor-fold> 
        
         //<editor-fold defaultstate="collapsed" desc="Propiedades">  
            public boolean isError() 
            {
                return error;
            }

            /**
             * @param error the error to set
             */
            public void setError(boolean error) 
            {
                this.error = error;
            } 
           public Sudoku getLogica()
           {
              if (this.logica==null)
              {
                this.logica=new Sudoku();
              }
               return this.logica;
           }
           /**
            * @param logica the logica to set
            */
            public String getCasillaPresionada() 
            {
                return casillaPresionada;
            }

            public void setCasillaPresionada(String casillaPresionada) 
            {
                this.casillaPresionada = casillaPresionada;
            }
            private VistaPrincipal getVentanaPrincipal() 
            {
                if(ventanaPrincipal ==null){
                    ventanaPrincipal=new VistaPrincipal(this);
                }
                return ventanaPrincipal;
            }
        // </editor-fold>  
            
         //<editor-fold defaultstate="collapsed" desc="Metodos"> 
            //Borra el valor de un Label
            public void borrarInterfaz()
            {
              for(int i=0;i<=8;i++)
                {
                    for(int j=0;j<=8;j++)
                    {                
                        if(!this.getVentanaPrincipal().getMtzLabel()[i][j].getName().equals("P"))
                        {
                            this.getVentanaPrincipal().getMtzLabel()[i][j].setBackground(Color.BLUE);
                            this.getVentanaPrincipal().getMtzLabel()[i][j].setForeground(Color.white);
                        }
                    }
                }
            }
            public void iniciar()
            {    
                resetearJuego();
                getVentanaPrincipal().setSize(292, 436);
                getVentanaPrincipal().setTitle("Sudoku");
                getVentanaPrincipal().setVisible(true);
                
            } 
            public void resetearJuego()
            {
                // Ir a la logica y restablecer el tablerooriginal
                getLogica().llenarMatrizInicial(); 
                // limpiar la GUI       
                this.getVentanaPrincipal().limpiarVista();
                this.juegoInicial();
            }
            //Inicializa los Label (de la vista) con los datos iniciales del Sudoku (los toma del modelo)
            public void juegoInicial()
            {        
                for(int i=0;i<=8;i++)
                {
                    for(int j=0;j<=8;j++)
                    {                
                     if(getLogica().getTablero()[i][j]!=0)
                     {                 
                       String numero= String.valueOf(getLogica().getTablero()[i][j]);               
                       this.getVentanaPrincipal().getMtzLabel()[i][j].setText(numero);
                        this.getVentanaPrincipal().getMtzLabel()[i][j].setBackground(Color.white);
                       this.getVentanaPrincipal().getMtzLabel()[i][j].setForeground(Color.blue);
                       this.getVentanaPrincipal().getMtzLabel()[i][j].setName("P");             
                     }                
                    }
                }

            }  
            //Revisa que el valor ingresado a un Label sea valido
            public void establecerValor(String valor)
            {
                boolean banFinal=false;
                for(int i=0;i<=8;i++)
                {
                    for(int j=0;j<=8;j++)
                    {             
                     if( this.getVentanaPrincipal().getMtzLabel()[i][j].getName().equals(this.getCasillaPresionada()) &&
                         !this.getCasillaPresionada().equals("P"))
                     {           
                            this.getVentanaPrincipal().getMtzLabel()[i][j].setText(valor);
                            if(valor.equals(""))
                            {
                                valor="0";
                            }
                            this.getLogica().ingreasrValorMatriz(i, j, Integer.parseInt(valor));
                            if(Integer.parseInt(valor)>=1 && Integer.parseInt(valor)<=9)
                            {
                                     this.setError(false);
                                     if(!this.getLogica().validarMovimientoVertical(i, j,  Integer.parseInt(valor)))
                                     {
                                         this.setError(true);
                                         this.getVentanaPrincipal().mostarMensajeError("Ya fue ingresadó el valor en la misma columna");
                                     }
                                     else if (!this.getLogica().validarMovimientoHorizontal(i, j,  Integer.parseInt(valor)))
                                      {
                                         this.getVentanaPrincipal().mostarMensajeError("Ya fue ingresadó el valor en la misma fila");
                                         this.setError(true);
                                     } 
                                     else if (!this.getLogica().validarCuadrante(i, j,  Integer.parseInt(valor)))
                                     {
                                         this.getVentanaPrincipal().mostarMensajeError("Ya fue ingresadó el valor en el mismo cuadrante");
                                         this.setError(true);
                                     }
                                     if(!isError())
                                     {
                                      banFinal=this.getLogica().validarFinal();
                                      if (banFinal)
                                      {
                                          this.getVentanaPrincipal().mostarMensajeFelicitacion("¡Ganaste!");
                                          break;
                                      }
                                     }
                            }
                     }

                    }//Fin for interno
                    if(banFinal)
                    {
                        break;
                    }
                }//Fin for externo
            }    
        // </editor-fold>  
}
