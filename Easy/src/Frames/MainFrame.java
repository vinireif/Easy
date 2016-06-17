package Frames;

import Fonts.BancoDeDados;
import java.awt.Color;

/**
 *
 * @author vinicius.reif
 */
public class MainFrame extends javax.swing.JFrame {

    private BancoDeDados bd;
    
    /** Creates new form MainFrame */
    public MainFrame(BancoDeDados bd) {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblBkp = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        painelAba = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCriar = new javax.swing.JTable();
        btnDelCriar = new javax.swing.JButton();
        btnCriar = new javax.swing.JButton();
        btnAddCriar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaAlterar = new javax.swing.JTable();
        btnAddAlterar = new javax.swing.JButton();
        btnDelAlterar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaDeletar = new javax.swing.JTable();
        btnAddDeletar = new javax.swing.JButton();
        btnDelDeletar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        dirDomain = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radioPadrao = new javax.swing.JRadioButton();
        radioPersonalizado = new javax.swing.JRadioButton();
        btnPesquisar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Executar:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/right-arrow.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Nome", "Endereço"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable1);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/plus.png"))); // NOI18N
        jLabel4.setText(" Add Aplicação");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/error.png"))); // NOI18N
        jLabel5.setText(" Remover Aplicação");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/history.png"))); // NOI18N
        jLabel6.setText("Histórico");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/list.png"))); // NOI18N
        jLabel7.setText("Variáveis");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Executar", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblBkp.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblBkp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        painelAba.setBackground(new java.awt.Color(255, 255, 255));
        painelAba.setEnabled(false);
        painelAba.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabelaCriar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"-Xrs"},
                {"-Xmn512m"},
                {"-Xms1024m"},
                {"-XX:+CMSParallelRemarkEnabled"},
                {"-XX:SurvivorRatio=20"},
                {"-XX:+UseParNewGC"},
                {"-XX:+UseConcMarkSweepGC"}
            },
            new String []
            {
                "Chave"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tabelaCriar.setEnabled(false);
        jScrollPane1.setViewportView(tabelaCriar);

        btnDelCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/delete.png"))); // NOI18N
        btnDelCriar.setBorderPainted(false);
        btnDelCriar.setContentAreaFilled(false);
        btnDelCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelCriar.setEnabled(false);
        btnDelCriar.setOpaque(true);
        btnDelCriar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnDelCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnDelCriarMouseExited(evt);
            }
        });
        btnDelCriar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDelCriarActionPerformed(evt);
            }
        });

        btnCriar.setBackground(new java.awt.Color(153, 153, 153));
        btnCriar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCriar.setForeground(new java.awt.Color(255, 255, 255));
        btnCriar.setText("Criar");
        btnCriar.setBorderPainted(false);
        btnCriar.setContentAreaFilled(false);
        btnCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCriar.setEnabled(false);
        btnCriar.setOpaque(true);
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnCriarMouseExited(evt);
            }
        });
        btnCriar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCriarActionPerformed(evt);
            }
        });

        btnAddCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/add.png"))); // NOI18N
        btnAddCriar.setBorderPainted(false);
        btnAddCriar.setContentAreaFilled(false);
        btnAddCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCriar.setEnabled(false);
        btnAddCriar.setOpaque(true);
        btnAddCriar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnAddCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnAddCriarMouseExited(evt);
            }
        });
        btnAddCriar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddCriarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCriar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnAddCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(btnCriar)
                .addContainerGap())
        );

        painelAba.addTab("Criar", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tabelaAlterar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"-XX:MaxPermSize=192m", "-XX:MaxPermSize=512m"},
                {"-client", "-server"},
                {"-Xmx512m", "-Xmx2048m"}
            },
            new String []
            {
                "De", "Para"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tabelaAlterar.setEnabled(false);
        jScrollPane2.setViewportView(tabelaAlterar);

        btnAddAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/add.png"))); // NOI18N
        btnAddAlterar.setBorderPainted(false);
        btnAddAlterar.setContentAreaFilled(false);
        btnAddAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAlterar.setEnabled(false);
        btnAddAlterar.setOpaque(true);
        btnAddAlterar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnAddAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnAddAlterarMouseExited(evt);
            }
        });
        btnAddAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddAlterarActionPerformed(evt);
            }
        });

        btnDelAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/delete.png"))); // NOI18N
        btnDelAlterar.setBorderPainted(false);
        btnDelAlterar.setContentAreaFilled(false);
        btnDelAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelAlterar.setEnabled(false);
        btnDelAlterar.setOpaque(true);
        btnDelAlterar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnDelAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnDelAlterarMouseExited(evt);
            }
        });
        btnDelAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDelAlterarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(153, 153, 153));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorderPainted(false);
        btnAlterar.setContentAreaFilled(false);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setEnabled(false);
        btnAlterar.setOpaque(true);
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnAlterarMouseExited(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnAddAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(btnAlterar)
                .addContainerGap())
        );

        painelAba.addTab("Alterar", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        tabelaDeletar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {"-XX:NewRatio=2"}
            },
            new String []
            {
                "Chave"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        tabelaDeletar.setEnabled(false);
        jScrollPane3.setViewportView(tabelaDeletar);

        btnAddDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/add.png"))); // NOI18N
        btnAddDeletar.setBorderPainted(false);
        btnAddDeletar.setContentAreaFilled(false);
        btnAddDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddDeletar.setEnabled(false);
        btnAddDeletar.setOpaque(true);
        btnAddDeletar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnAddDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnAddDeletarMouseExited(evt);
            }
        });
        btnAddDeletar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddDeletarActionPerformed(evt);
            }
        });

        btnDelDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/delete.png"))); // NOI18N
        btnDelDeletar.setBorderPainted(false);
        btnDelDeletar.setContentAreaFilled(false);
        btnDelDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelDeletar.setEnabled(false);
        btnDelDeletar.setOpaque(true);
        btnDelDeletar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnDelDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnDelDeletarMouseExited(evt);
            }
        });
        btnDelDeletar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDelDeletarActionPerformed(evt);
            }
        });

        btnDeletar.setBackground(new java.awt.Color(153, 153, 153));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setBorderPainted(false);
        btnDeletar.setContentAreaFilled(false);
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.setEnabled(false);
        btnDeletar.setOpaque(true);
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                btnDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                btnDeletarMouseExited(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnAddDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(btnDeletar)
                .addContainerGap())
        );

        painelAba.addTab("Deletar", jPanel7);

        dirDomain.setToolTipText("");
        dirDomain.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                dirDomainFocusLost(evt);
            }
        });

        jLabel1.setText("Caminho domínio:");

        radioPadrao.setBackground(new java.awt.Color(255, 255, 255));
        radioPadrao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioPadrao.setSelected(true);
        radioPadrao.setText("Padrão");
        radioPadrao.setEnabled(false);
        radioPadrao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioPadraoActionPerformed(evt);
            }
        });

        radioPersonalizado.setBackground(new java.awt.Color(255, 255, 255));
        radioPersonalizado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioPersonalizado.setText("Personalizado");
        radioPersonalizado.setEnabled(false);
        radioPersonalizado.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                radioPersonalizadoActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/search.png"))); // NOI18N
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setOpaque(true);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnPesquisarFocusLost(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/stop.png"))); // NOI18N
        jButton1.setText("Stop-Domain");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/help.png"))); // NOI18N
        jButton2.setText("Help");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(radioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioPersonalizado))
                                .addComponent(painelAba, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                            .addComponent(dirDomain)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(lblBkp, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dirDomain, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPersonalizado)
                    .addComponent(radioPadrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAba, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBkp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ConfigDomain", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseEntered
        colocarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseEntered

    private void btnDelCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseExited
        tirarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseExited

    private void btnDelCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCriarActionPerformed

        int qtdCriar = 0;

        if(radioPadrao.isSelected()){
            qtdCriar = 7;
        }

        if(tabelaCriar.getRowCount() > qtdCriar){
            this.modelCriar.removeRow(tabelaCriar.getRowCount()-1);
        }

        if(this.modelCriar.getRowCount() > 0){
            btnCriar.setEnabled(true);
        } else {
            btnCriar.setEnabled(false);
        }
    }//GEN-LAST:event_btnDelCriarActionPerformed

    private void btnCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseEntered

        if(btnCriar.isEnabled()){
            colocarMouseBtnAcao(btnCriar);
        }

    }//GEN-LAST:event_btnCriarMouseEntered

    private void btnCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseExited

        if(btnCriar.isEnabled()){
            tirarMouseBtnAcao(btnCriar);
        }

    }//GEN-LAST:event_btnCriarMouseExited

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        lblStatus.setText("");
        lblBkp.setText("");

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            stopDomain(false);
            backupDomainXml(xml);

            if(isPadrao()){
                criarConfigPadrao(xml);
            } else {
                criarConfigPerson(xml);
            }
        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnAddCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseEntered
        colocarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseEntered

    private void btnAddCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseExited
        tirarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseExited

    private void btnAddCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCriarActionPerformed

        this.modelCriar.addRow(new Object[]{"", ""});

        if(this.modelCriar.getRowCount() > 0){
            btnCriar.setEnabled(true);
        } else {
            btnCriar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddCriarActionPerformed

    private void btnAddAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseEntered
        colocarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseEntered

    private void btnAddAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseExited
        tirarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseExited

    private void btnAddAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlterarActionPerformed

        this.modelAlterar.addRow(new Object[]{"", ""});

        if(this.modelAlterar.getRowCount() > 0){
            btnAlterar.setEnabled(true);
        } else {
            btnAlterar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddAlterarActionPerformed

    private void btnDelAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseEntered
        colocarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseEntered

    private void btnDelAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseExited
        tirarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseExited

    private void btnDelAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAlterarActionPerformed

        int qtdAlterar = 0;

        if(radioPadrao.isSelected()){
            qtdAlterar = 3;
        }

        if(tabelaAlterar.getRowCount() > qtdAlterar){
            this.modelAlterar.removeRow(tabelaAlterar.getRowCount()-1);
        }

        if(this.modelAlterar.getRowCount() > 0){
            btnAlterar.setEnabled(true);
        } else {
            btnAlterar.setEnabled(false);
        }

    }//GEN-LAST:event_btnDelAlterarActionPerformed

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered

        if(btnAlterar.isEnabled()){
            colocarMouseBtnAcao(btnAlterar);
        }

    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited

        if(btnAlterar.isEnabled()){
            tirarMouseBtnAcao(btnAlterar);
        }

    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            stopDomain(false);
            backupDomainXml(xml);

            if(isPadrao()){
                alterarConfigPadrao(xml);
            } else {
                alterarConfigPerson(xml);
            }

        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAddDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseEntered
        colocarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseEntered

    private void btnAddDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseExited
        tirarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseExited

    private void btnAddDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeletarActionPerformed

        this.modelDeletar.addRow(new Object[]{"", ""});

        if(this.modelDeletar.getRowCount() > 0){
            btnDeletar.setEnabled(true);
        } else {
            btnDeletar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddDeletarActionPerformed

    private void btnDelDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseEntered
        colocarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseEntered

    private void btnDelDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseExited
        tirarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseExited

    private void btnDelDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDeletarActionPerformed

        int qtdDelete = 0;

        if(radioPadrao.isSelected()){
            qtdDelete = 1;
        }

        if(tabelaDeletar.getRowCount() > qtdDelete){
            this.modelDeletar.removeRow(tabelaDeletar.getRowCount()-1);
        }

        if(this.modelDeletar.getRowCount() > 0){
            btnDeletar.setEnabled(true);
        } else {
            btnDeletar.setEnabled(false);
        }

    }//GEN-LAST:event_btnDelDeletarActionPerformed

    private void btnDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseEntered

        if(btnDeletar.isEnabled()){
            colocarMouseBtnAcao(btnDeletar);
        }

    }//GEN-LAST:event_btnDeletarMouseEntered

    private void btnDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseExited

        if(btnDeletar.isEnabled()){
            tirarMouseBtnAcao(btnDeletar);
        }

    }//GEN-LAST:event_btnDeletarMouseExited

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            stopDomain(false);
            backupDomainXml(xml);

            if(isPadrao()){
                deletarConfigPadrao(xml);
            } else {
                deletarConfigPerson(xml);
            }

        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void dirDomainFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dirDomainFocusLost

        if(!dirDomain.getText().isEmpty()){

            if(!existDomainXML()){
                radioPadrao.setEnabled(false);
                radioPersonalizado.setEnabled(false);
                btnCriar.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnDeletar.setEnabled(false);
                painelAba.setEnabled(false);
                menuStop.setEnabled(false);
                lblMensagem.setText("Arquivo domain.xml não existe! Verifique o caminho informado!");
            } else {
                lblMensagem.setText("");
                radioPadrao.setEnabled(true);
                radioPersonalizado.setEnabled(true);
                btnCriar.setEnabled(true);
                btnAlterar.setEnabled(true);
                btnDeletar.setEnabled(true);
                painelAba.setEnabled(true);
                menuStop.setEnabled(true);
                if(isPadrao()){
                    btnAddAlterar.setEnabled(false);
                    btnAddCriar.setEnabled(false);
                    btnAddDeletar.setEnabled(false);
                    btnDelAlterar.setEnabled(false);
                    btnDelCriar.setEnabled(false);
                    btnDelDeletar.setEnabled(false);
                    tabelaAlterar.setEnabled(false);
                    tabelaCriar.setEnabled(false);
                    tabelaDeletar.setEnabled(false);
                } else {
                    btnAddAlterar.setEnabled(true);
                    btnAddCriar.setEnabled(true);
                    btnAddDeletar.setEnabled(true);
                    btnDelAlterar.setEnabled(true);
                    btnDelCriar.setEnabled(true);
                    btnDelDeletar.setEnabled(true);
                    tabelaAlterar.setEnabled(true);
                    tabelaCriar.setEnabled(true);
                    tabelaDeletar.setEnabled(true);
                }
            }
        } else {
            lblMensagem.setText("");
        }
    }//GEN-LAST:event_dirDomainFocusLost

    private void radioPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPadraoActionPerformed

        if(existDomainXML()){
            deleteTabelaAlterar();
            deleteTabelaCriar();
            deleteTabelaDeletar();

            populaTabelaAlterar();
            populaTabelaCriar();
            populaTabelaDeletar();

            btnAddAlterar.setEnabled(false);
            btnAddCriar.setEnabled(false);
            btnAddDeletar.setEnabled(false);
            btnDelAlterar.setEnabled(false);
            btnDelCriar.setEnabled(false);
            btnDelDeletar.setEnabled(false);
            tabelaAlterar.setEnabled(false);
            tabelaCriar.setEnabled(false);
            tabelaDeletar.setEnabled(false);
        }
    }//GEN-LAST:event_radioPadraoActionPerformed

    private void radioPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPersonalizadoActionPerformed

        if(existDomainXML()){
            deleteTabelaAlterar();
            deleteTabelaCriar();
            deleteTabelaDeletar();

            populaTabelaAlterar();
            populaTabelaCriar();
            populaTabelaDeletar();

            painelAba.setEnabled(true);
            btnAddAlterar.setEnabled(true);
            btnAddCriar.setEnabled(true);
            btnAddDeletar.setEnabled(true);
            btnDelAlterar.setEnabled(true);
            btnDelCriar.setEnabled(true);
            btnDelDeletar.setEnabled(true);

            tabelaAlterar.setEnabled(true);
            tabelaCriar.setEnabled(true);
            tabelaDeletar.setEnabled(true);
        }

    }//GEN-LAST:event_radioPersonalizadoActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        JFileChooser fc;

        if(!dirDomain.getText().isEmpty()){

            File f = new File(dirDomain.getText());

            if(f.exists()){
                fc = new JFileChooser(dirDomain.getText());
            } else {
                fc = new JFileChooser("C:\\");
                }
            } else {
                fc = new JFileChooser("C:\\");
                }

                fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                int res = fc.showOpenDialog(null);

                if(res == JFileChooser.APPROVE_OPTION){
                    dirDomain.setText(fc.getSelectedFile().getAbsolutePath());

                    if(!existDomainXML()){
                        radioPadrao.setEnabled(false);
                        radioPersonalizado.setEnabled(false);
                        painelAba.setEnabled(false);
                        btnCriar.setEnabled(false);
                        btnAlterar.setEnabled(false);
                        btnDeletar.setEnabled(false);
                        menuStop.setEnabled(false);
                        lblMensagem.setText("Arquivo domain.xml não existe! Verifique o caminho informado!");
                    } else {

                        radioPadrao.setEnabled(true);
                        radioPersonalizado.setEnabled(true);
                        painelAba.setEnabled(true);
                        btnCriar.setEnabled(true);
                        btnAlterar.setEnabled(true);
                        btnDeletar.setEnabled(true);
                        menuStop.setEnabled(true);
                        if(isPadrao()){
                            btnAddAlterar.setEnabled(false);
                            btnAddCriar.setEnabled(false);
                            btnAddDeletar.setEnabled(false);
                            btnDelAlterar.setEnabled(false);
                            btnDelCriar.setEnabled(false);
                            btnDelDeletar.setEnabled(false);
                            tabelaAlterar.setEnabled(false);
                            tabelaCriar.setEnabled(false);
                            tabelaDeletar.setEnabled(false);
                        } else {
                            btnAddAlterar.setEnabled(true);
                            btnAddCriar.setEnabled(true);
                            btnAddDeletar.setEnabled(true);
                            btnDelAlterar.setEnabled(true);
                            btnDelCriar.setEnabled(true);
                            btnDelDeletar.setEnabled(true);
                            tabelaAlterar.setEnabled(true);
                            tabelaCriar.setEnabled(true);
                            tabelaDeletar.setEnabled(true);
                        }
                    }
                }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPesquisarFocusLost

    }//GEN-LAST:event_btnPesquisarFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAlterar;
    private javax.swing.JButton btnAddCriar;
    private javax.swing.JButton btnAddDeletar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDelAlterar;
    private javax.swing.JButton btnDelCriar;
    private javax.swing.JButton btnDelDeletar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JTextField dirDomain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBkp;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTabbedPane painelAba;
    private javax.swing.JRadioButton radioPadrao;
    private javax.swing.JRadioButton radioPersonalizado;
    private javax.swing.JTable tabelaAlterar;
    private javax.swing.JTable tabelaCriar;
    private javax.swing.JTable tabelaDeletar;
    // End of variables declaration//GEN-END:variables

}
