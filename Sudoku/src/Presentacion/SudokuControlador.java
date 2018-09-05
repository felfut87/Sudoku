package Presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 *
 * @author Asesoftware
 */
public class SudokuControlador implements ActionListener,MouseListener{
    public SudokuControlador(VistaPrincipal aThis) {
            ventana =aThis;
            sistema = ventana.getSistema();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Miembros">  
        private VistaPrincipal ventana;
        private SudokuModelo sistema;
       // </editor-fold>  

    //<editor-fold defaultstate="collapsed" desc="Eventos">  
        public void actionPerformed(ActionEvent e)
          {  
              if(e.getSource()==this.getSudokuVista().getBtnClear())
              {
                  this.getSistema().setError(false);
                  this.getSistema().establecerValor("");        
              }        
              if(!this.getSistema().isError())
              {
                  if(e.getSource()==this.getSudokuVista().getBtnUno())
                  {
                      this.getSistema().establecerValor("1");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnDos())
                   {
                       this.getSistema().establecerValor("2");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnTres())
                   {
                      this.getSistema().establecerValor("3");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnCuatro())
                   {
                      this.getSistema().establecerValor("4");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnCinco())
                   {
                      this.getSistema().establecerValor("5");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnSeis())
                   {
                      this.getSistema().establecerValor("6");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnSiete())
                   {
                      this.getSistema().establecerValor("7");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnOcho())
                   {
                      this.getSistema().establecerValor("8");        
                  }
                  if(e.getSource()==this.getSudokuVista().getBtnNueve())
                  {
                      this.getSistema().establecerValor("9");        
                  }
                  if(e.getSource()==this.getSudokuVista().getLimpiar())
                  {
                      this.getSistema().resetearJuego();         
                  }        
              }
              else
              {
                  this.getSudokuVista().mostarMensajeError("Por favor borrar: Botón limpiar");
              }
          }
  

    //Actualiza la variable que mantiene el nombre del ultimo label diligenciado
        @Override
        public void mouseClicked(MouseEvent e) 
        {
          if(!this.getSistema().isError())
          {
                this.getSistema().borrarInterfaz();
                for(int i=0;i<=8;i++)
                {
                    for(int j=0;j<=8;j++)
                    {
                        if(e.getSource()==this.getSudokuVista().getMtzLabel()[i][j])
                        {
                           if(this.getSudokuVista().getMtzLabel()[i][j].getName().equals("P"))
                               {
                                   this.getSistema().setCasillaPresionada(this.getSudokuVista().getMtzLabel()[i][j].getName());
                               }
                               else
                               {
                                   this.getSudokuVista().getMtzLabel()[i][j].setBackground(Color.yellow);
                                   this.getSudokuVista().getMtzLabel()[i][j].setForeground(Color.red);
                                   this.getSistema().setCasillaPresionada(this.getSudokuVista().getMtzLabel()[i][j].getName());
                               }
                        }
                    }
                }     
            }
            else
            {
                this.getSudokuVista().mostarMensajeError("Por favor borrar: Botón Limpiar");
            }            
        }


        @Override
        public void mousePressed(MouseEvent evento) 
         {
         }

        @Override
        public void mouseReleased(MouseEvent evento) 
         {
         }

        @Override
        public void mouseExited(MouseEvent e) 
         {   
         }

        @Override
         public void mouseEntered(MouseEvent evento) 
         {
         }

       // </editor-fold>  

    //<editor-fold defaultstate="collapsed" desc="Propiedades">     
        public VistaPrincipal getSudokuVista() 
        {
            return  this.ventana;
        }
        public void setSudokuVista(VistaPrincipal sudokuVista) 
        {
            this.ventana = sudokuVista;
        }

        /**
         * @return the sistema
         */
        public SudokuModelo getSistema() {
            return sistema;
        }

        /**
         * @param sistema the sistema to set
         */
        public void setSistema(SudokuModelo sistema) {
            this.sistema = sistema;
        }
           // </editor-fold>  
  
}
