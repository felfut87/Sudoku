/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Asesoftware
 */
public class VistaPrincipal extends javax.swing.JFrame {   
    public VistaPrincipal(SudokuModelo aThis) {
        sistema =aThis;
        initComponents();
        this.construirUI();
        establecerEventos();
    }
    //<editor-fold defaultstate="collapsed" desc="Metodos">   
    public void limpiarVista()
    {              
        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<=8;j++)
            {
                this.getMtzLabel()[i][j].setText("");
            }
        }
    }

    public void construirUI()
    {
      
        GridLayout juegoLayout = new GridLayout(3,3,1,1);
        GridLayout juegoLayoutCuadrante = new GridLayout(3,3,1,1);
   
        this.pnlJuego.setLayout(juegoLayout);
        this.pnlJuegoPrimer.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoSeg.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoTer.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoCuar.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoCinco.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoSeis.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoSiete.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoOcho.setLayout(juegoLayoutCuadrante);
        this.pnlJuegoNueve.setLayout(juegoLayoutCuadrante);

        this.pnlJuego.add(pnlJuegoPrimer);
        this.pnlJuego.add(pnlJuegoSeg);
        this.pnlJuego.add(pnlJuegoTer);
        this.pnlJuego.add(pnlJuegoCuar);
        this.pnlJuego.add(pnlJuegoCinco);
        this.pnlJuego.add(pnlJuegoSeis);
        this.pnlJuego.add(pnlJuegoSiete);
        this.pnlJuego.add(pnlJuegoOcho);
        this.pnlJuego.add(pnlJuegoNueve);
        
        
        this.setMtzLabel(new javax.swing.JLabel[9][9]);

        for(int i=0;i<=8;i++)
        {
            for(int j=0;j<=8;j++)
            {
                
                String nombre= String.valueOf(i)+String.valueOf(j);
                javax.swing.JLabel lblTmp=new javax.swing.JLabel();
                lblTmp.setName(nombre);
                lblTmp.setText("");
                lblTmp.setOpaque(true);
                lblTmp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblTmp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
                lblTmp.setBackground(Color.BLUE);
                lblTmp.setForeground(Color.WHITE);
                lblTmp.setFont(new java.awt.Font("Georgia", 0, 12)); 
                lblTmp.setMinimumSize(new Dimension(28,28));
                lblTmp.setMinimumSize(new Dimension(28,28));
                lblTmp.setPreferredSize(new Dimension(28,28));
                
                this.getMtzLabel()[i][j]=lblTmp;
                
                if (i>=0 && i<=2)
                {
                    if (j>=0 && j<=2)
                    {
                        this.pnlJuegoPrimer.add(lblTmp);
                    }
                    if (j>=3 && j<=5)
                    {
                        this.pnlJuegoSeg.add(lblTmp);
                    }
                    
                    if (j>=6 && j<=8)
                    {
                        this.pnlJuegoTer.add(lblTmp);
                    
                    }                
                }
                
                if (i>=3 && i<=5)
                {
                    if (j>=0 && j<=2)
                    {
                        this.pnlJuegoCuar.add(lblTmp);
                    }
                    if (j>=3 && j<=5)
                    {
                        this.pnlJuegoCinco.add(lblTmp);
                    }                    
                    if (j>=6 && j<=8)
                    {
                        this.pnlJuegoSeis.add(lblTmp);                    
                    }                
                }                   
                   
                if (i>=6 && i<=8)
                {
                    if (j>=0 && j<=2)
                    {
                        this.pnlJuegoSiete.add(lblTmp);
                    }
                    if (j>=3 && j<=5)
                    {
                        this.pnlJuegoOcho.add(lblTmp);
                    }
                    
                    if (j>=6 && j<=8)
                    {
                        this.pnlJuegoNueve.add(lblTmp);
                    
                    }                
                }           
            }
        }                
    }
   
    //Establece los eventos de los botones y los Label de la vista
    public void establecerEventos()
    {
        getBtnUno().addActionListener(getControl());
        getBtnDos().addActionListener(getControl());
        getBtnTres().addActionListener(getControl());
        getBtnCuatro().addActionListener(getControl());
        getBtnCinco().addActionListener(getControl());
        getBtnSeis().addActionListener(getControl());
        getBtnSiete().addActionListener(getControl());
        getBtnOcho().addActionListener(getControl());
        getBtnNueve().addActionListener(getControl());
        getBtnClear().addActionListener(getControl());
        getLimpiar().addActionListener(getControl());
        
        for(int i=0;i<=8;i++)
        {   for(int j=0;j<=8;j++)
            {                
                getMtzLabel()[i][j].addMouseListener(getControl());                
            }
        }           
    }
   
    public void mostarMensajeFelicitacion(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje,"Sudoku: ¡¡Felicitaciones!!",JOptionPane.INFORMATION_MESSAGE);
    }
    public void mostarMensajeError(String mensaje)
    {
        JOptionPane.showMessageDialog(this, mensaje,"Sudoku: Error Valor",JOptionPane.ERROR_MESSAGE);
    }

       // </editor-fold>  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        pnlJuego = new javax.swing.JPanel();
        pnlJuegoPrimer = new javax.swing.JPanel();
        pnlJuegoSiete = new javax.swing.JPanel();
        pnlJuegoSeg = new javax.swing.JPanel();
        pnlJuegoCinco = new javax.swing.JPanel();
        pnlJuegoSeis = new javax.swing.JPanel();
        pnlJuegoTer = new javax.swing.JPanel();
        pnlJuegoCuar = new javax.swing.JPanel();
        pnlJuegoOcho = new javax.swing.JPanel();
        pnlJuegoNueve = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 255, 255));

        pnlBotones.setBackground(new java.awt.Color(153, 204, 255));
        pnlBotones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlBotones.setForeground(new java.awt.Color(255, 255, 255));

        btnUno.setBackground(new java.awt.Color(255, 255, 255));
        btnUno.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnUno.setText("1");

        btnDos.setBackground(new java.awt.Color(255, 255, 255));
        btnDos.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnDos.setText("2");

        btnTres.setBackground(new java.awt.Color(255, 255, 255));
        btnTres.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnTres.setText("3");

        btnCuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnCuatro.setFont(new java.awt.Font("Georgia", 0, 9)); // NOI18N
        btnCuatro.setText("4");

        btnCinco.setBackground(new java.awt.Color(255, 255, 255));
        btnCinco.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnCinco.setLabel("5");

        btnSeis.setBackground(new java.awt.Color(255, 255, 255));
        btnSeis.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnSeis.setLabel("6");

        btnSiete.setBackground(new java.awt.Color(255, 255, 255));
        btnSiete.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnSiete.setLabel("7");

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnClear.setText("Limpiar");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnOcho.setBackground(new java.awt.Color(255, 255, 255));
        btnOcho.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnOcho.setLabel("8");

        btnNueve.setBackground(new java.awt.Color(255, 255, 255));
        btnNueve.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        btnNueve.setLabel("9");

        limpiar.setBackground(new java.awt.Color(255, 255, 255));
        limpiar.setFont(new java.awt.Font("Georgia", 0, 10)); // NOI18N
        limpiar.setText("Iniciar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSiete, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btnOcho)
                        .addGap(18, 18, 18)
                        .addComponent(btnNueve)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addComponent(btnDos)
                                .addGap(18, 18, 18)
                                .addComponent(btnTres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addComponent(btnCinco)
                                .addGap(18, 18, 18)
                                .addComponent(btnSeis)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUno)
                    .addComponent(btnDos)
                    .addComponent(btnTres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeis)
                    .addComponent(btnCinco)
                    .addComponent(btnCuatro)
                    .addComponent(limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiete)
                    .addComponent(btnOcho)
                    .addComponent(btnNueve)
                    .addComponent(btnClear))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pnlJuego.setBackground(new java.awt.Color(255, 255, 255));
        pnlJuego.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlJuego.setForeground(new java.awt.Color(255, 255, 255));

        pnlJuegoPrimer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));

        javax.swing.GroupLayout pnlJuegoPrimerLayout = new javax.swing.GroupLayout(pnlJuegoPrimer);
        pnlJuegoPrimer.setLayout(pnlJuegoPrimerLayout);
        pnlJuegoPrimerLayout.setHorizontalGroup(
            pnlJuegoPrimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoPrimerLayout.setVerticalGroup(
            pnlJuegoPrimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoSiete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoSieteLayout = new javax.swing.GroupLayout(pnlJuegoSiete);
        pnlJuegoSiete.setLayout(pnlJuegoSieteLayout);
        pnlJuegoSieteLayout.setHorizontalGroup(
            pnlJuegoSieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        pnlJuegoSieteLayout.setVerticalGroup(
            pnlJuegoSieteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoSeg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoSegLayout = new javax.swing.GroupLayout(pnlJuegoSeg);
        pnlJuegoSeg.setLayout(pnlJuegoSegLayout);
        pnlJuegoSegLayout.setHorizontalGroup(
            pnlJuegoSegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        pnlJuegoSegLayout.setVerticalGroup(
            pnlJuegoSegLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoCinco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoCincoLayout = new javax.swing.GroupLayout(pnlJuegoCinco);
        pnlJuegoCinco.setLayout(pnlJuegoCincoLayout);
        pnlJuegoCincoLayout.setHorizontalGroup(
            pnlJuegoCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoCincoLayout.setVerticalGroup(
            pnlJuegoCincoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        pnlJuegoSeis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoSeisLayout = new javax.swing.GroupLayout(pnlJuegoSeis);
        pnlJuegoSeis.setLayout(pnlJuegoSeisLayout);
        pnlJuegoSeisLayout.setHorizontalGroup(
            pnlJuegoSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoSeisLayout.setVerticalGroup(
            pnlJuegoSeisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoTer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 2, true));

        javax.swing.GroupLayout pnlJuegoTerLayout = new javax.swing.GroupLayout(pnlJuegoTer);
        pnlJuegoTer.setLayout(pnlJuegoTerLayout);
        pnlJuegoTerLayout.setHorizontalGroup(
            pnlJuegoTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );
        pnlJuegoTerLayout.setVerticalGroup(
            pnlJuegoTerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        pnlJuegoCuar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoCuarLayout = new javax.swing.GroupLayout(pnlJuegoCuar);
        pnlJuegoCuar.setLayout(pnlJuegoCuarLayout);
        pnlJuegoCuarLayout.setHorizontalGroup(
            pnlJuegoCuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoCuarLayout.setVerticalGroup(
            pnlJuegoCuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoOcho.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoOchoLayout = new javax.swing.GroupLayout(pnlJuegoOcho);
        pnlJuegoOcho.setLayout(pnlJuegoOchoLayout);
        pnlJuegoOchoLayout.setHorizontalGroup(
            pnlJuegoOchoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
        );
        pnlJuegoOchoLayout.setVerticalGroup(
            pnlJuegoOchoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlJuegoNueve.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));

        javax.swing.GroupLayout pnlJuegoNueveLayout = new javax.swing.GroupLayout(pnlJuegoNueve);
        pnlJuegoNueve.setLayout(pnlJuegoNueveLayout);
        pnlJuegoNueveLayout.setHorizontalGroup(
            pnlJuegoNueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlJuegoNueveLayout.setVerticalGroup(
            pnlJuegoNueveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlJuegoLayout = new javax.swing.GroupLayout(pnlJuego);
        pnlJuego.setLayout(pnlJuegoLayout);
        pnlJuegoLayout.setHorizontalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJuegoLayout.createSequentialGroup()
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlJuegoSiete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoPrimer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoCuar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlJuegoOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlJuegoCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlJuegoLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pnlJuegoSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJuegoTer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlJuegoLayout.setVerticalGroup(
            pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJuegoLayout.createSequentialGroup()
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJuegoTer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoPrimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoSeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJuegoCinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoSeis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoCuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlJuegoNueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoSiete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlJuegoOcho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed
    //<editor-fold defaultstate="collapsed" desc="Miembros">  
    
    private javax.swing.JLabel[][] mtzLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlJuego;
    private javax.swing.JPanel pnlJuegoCinco;
    private javax.swing.JPanel pnlJuegoCuar;
    private javax.swing.JPanel pnlJuegoNueve;
    private javax.swing.JPanel pnlJuegoOcho;
    private javax.swing.JPanel pnlJuegoPrimer;
    private javax.swing.JPanel pnlJuegoSeg;
    private javax.swing.JPanel pnlJuegoSeis;
    private javax.swing.JPanel pnlJuegoSiete;
    private javax.swing.JPanel pnlJuegoTer;
    // End of variables declaration//GEN-END:variables
     
   
    private SudokuControlador control;
    private final SudokuModelo sistema;

    
       // </editor-fold>  

    //<editor-fold defaultstate="collapsed" desc="Propiedades">   

    public SudokuModelo getSistema() 
    {
        return sistema;
    }
    public SudokuControlador getControl()
    {
        if(control == null){
            control = new SudokuControlador(this);
        }
        return control;
    }
    
    /**
     * @return the mtzLabel
     */
    public javax.swing.JLabel[][] getMtzLabel() 
    {
        return mtzLabel;
    }

    /**
     * @param mtzLabel the mtzLabel to set
     */
    public void setMtzLabel(javax.swing.JLabel[][] mtzLabel)
    {
        this.mtzLabel = mtzLabel;
    }

    /**
     * @return the btnCinco
     */
    public javax.swing.JButton getBtnCinco()
    {
        return btnCinco;
    }

    /**
     * @param btnCinco the btnCinco to set
     */
    public void setBtnCinco(javax.swing.JButton btnCinco)
    {
        this.btnCinco = btnCinco;
    }

    /**
     * @return the btnClear
     */
    public javax.swing.JButton getBtnClear() 
    {
        return btnClear;
    }

    /**
     * @param btnClear the btnClear to set
     */
    public void setBtnClear(javax.swing.JButton btnClear)
    {
        this.btnClear = btnClear;
    }

    /**
     * @return the btnCuatro
     */
    public javax.swing.JButton getBtnCuatro() 
    {
        return btnCuatro;
    }

    /**
     * @param btnCuatro the btnCuatro to set
     */
    public void setBtnCuatro(javax.swing.JButton btnCuatro)
    {
        this.btnCuatro = btnCuatro;
    }

    /**
     * @return the btnDos
     */
    public javax.swing.JButton getBtnDos() 
    {
        return btnDos;
    }

    /**
     * @param btnDos the btnDos to set
     */
    public void setBtnDos(javax.swing.JButton btnDos)
    {
        this.btnDos = btnDos;
    }

    /**
     * @return the btnNueve
     */
    public javax.swing.JButton getBtnNueve() 
    {
        return btnNueve;
    }

    /**
     * @param btnNueve the btnNueve to set
     */
    public void setBtnNueve(javax.swing.JButton btnNueve)
    {
        this.btnNueve = btnNueve;
    }

    /**
     * @return the btnOcho
     */
    public javax.swing.JButton getBtnOcho() 
    {
        return btnOcho;
    }

    /**
     * @param btnOcho the btnOcho to set
     */
    public void setBtnOcho(javax.swing.JButton btnOcho) 
    {
        this.btnOcho = btnOcho;
    }

    /**
     * @return the btnSeis
     */
    public javax.swing.JButton getBtnSeis()
    {
        return btnSeis;
    }

    /**
     * @param btnSeis the btnSeis to set
     */
    public void setBtnSeis(javax.swing.JButton btnSeis)
    {
        this.btnSeis = btnSeis;
    }

    /**
     * @return the btnSiete
     */
    public javax.swing.JButton getBtnSiete() 
    {
        return btnSiete;
    }

    /**
     * @param btnSiete the btnSiete to set
     */
    public void setBtnSiete(javax.swing.JButton btnSiete)
    {
        this.btnSiete = btnSiete;
    }

    /**
     * @return the btnTres
     */
    public javax.swing.JButton getBtnTres() 
    {
        return btnTres;
    }

    /**
     * @param btnTres the btnTres to set
     */
    public void setBtnTres(javax.swing.JButton btnTres)
    {
        this.btnTres = btnTres;
    }

    /**
     * @return the btnUno
     */
    public javax.swing.JButton getBtnUno()
    {
        return btnUno;
    }

    /**
     * @param btnUno the btnUno to set
     */
    public void setBtnUno(javax.swing.JButton btnUno)
    {
        this.btnUno = btnUno;
    }

    /**
     * @return the limpiar
     */
    public javax.swing.JButton getLimpiar()
    {
        return limpiar;
    }

    /**
     * @param limpiar the limpiar to set
     */
    public void setLimpiar(javax.swing.JButton limpiar)
    {
        this.limpiar = limpiar;
    }
    
    
       // </editor-fold>  
}
