import Presentacion.SudokuModelo;

      

/**
 *
 * @author Oscar Felipe Zambrano Rodriguez - Magada Lucia Vera Grupo 1
 * Informatica 1
 * Esp. Ingenieria Software
 */
public class Launcher {

    private SudokuModelo aplicacion;

    public Launcher() {
        aplicacion = new SudokuModelo();
        aplicacion.iniciar();
    }
       
    public static void main(String[] args) 
    {
         new Launcher();
    }

}
