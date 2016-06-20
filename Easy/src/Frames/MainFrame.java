package Frames;

import Fonts.ConfigDomain.ConfigDomain;
import Fonts.DataBase;
import Fonts.Executar.AddApplication;
import Fonts.Executar.AddVariable;
import Fonts.Executar.Application;
import Fonts.Executar.HistFrame;
import Fonts.Executar.Variable;
import Fonts.Update;
import VBUtils.VBChooser;
import VBUtils.VBMsg;
import VBUtils.VBSystem;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/**
 *
 * @author vinicius.reif
 */
public class MainFrame extends javax.swing.JFrame {

    private DataBase db;
    private DefaultTableModel tableAppModel;
    private ConfigDomain cd;
    private Object txtAddress;
    private DefaultTableModel tableDomainModel;
    
    /** Creates new form MainFrame */
    public MainFrame(DataBase db) {
        initComponents();
        this.db = db;
        this.getContentPane().setBackground(Color.white);
        this.tableAppModel = (DefaultTableModel)this.tbApp.getModel();
        this.tableDomainModel = (DefaultTableModel)this.tbDomain.getModel();
        new Update(this, db).start();
        this.cd = new ConfigDomain();
        this.updateToolTipExec();
        this.txtGf.setText(db.getDirGf());
        this.jLabel11MouseClicked(null);
        this.txtGf.setForeground(Color.black);
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
        txtExec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbApp = new javax.swing.JTable();
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
        btnStop = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbee = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbDomain = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGf = new javax.swing.JTextField();
        btnPesquisar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Easy");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Executar:");

        txtExec.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyReleased(java.awt.event.KeyEvent evt)
            {
                txtExecKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/right-arrow.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel3MouseClicked(evt);
            }
        });

        tbApp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nome", "Endereço"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbApp.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tbAppMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbApp);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/plus.png"))); // NOI18N
        jLabel4.setText(" Add Aplicação");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/error.png"))); // NOI18N
        jLabel5.setText(" Remover Aplicação");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/history.png"))); // NOI18N
        jLabel6.setText("Histórico");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Executar/var.png"))); // NOI18N
        jLabel7.setText("Variáveis");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExec)
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
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

        jTabbedPane1.addTab("Executar Aplicação", jPanel3);

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

        btnStop.setBackground(new java.awt.Color(255, 255, 255));
        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/stop.png"))); // NOI18N
        btnStop.setText("Stop-Domain");
        btnStop.setBorderPainted(false);
        btnStop.setContentAreaFilled(false);
        btnStop.setOpaque(true);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/help.png"))); // NOI18N
        jButton2.setText("Help");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        lbee.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lbeeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnStop)
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
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap(174, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbee, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(btnStop)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(lbee, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ConfigDomain", jPanel4);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tbDomain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Domínios"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbDomain);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Domain/stop.png"))); // NOI18N
        jLabel8.setText("Parar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Domain/icon.png"))); // NOI18N
        jLabel9.setText("Reiniciar");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Domain/power-button.png"))); // NOI18N
        jLabel10.setText("Iniciar");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Domain/reload.png"))); // NOI18N
        jLabel11.setText("Atualizar");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setText("Diretório GlassFish:");

        btnPesquisar1.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/search.png"))); // NOI18N
        btnPesquisar1.setBorderPainted(false);
        btnPesquisar1.setContentAreaFilled(false);
        btnPesquisar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar1.setOpaque(true);
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisar1ActionPerformed(evt);
            }
        });
        btnPesquisar1.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                btnPesquisar1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel9)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addComponent(btnPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Dominios", jPanel8);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* Executar App */
    public void updateTablesExecutar()
    {
        //tbApp
        this.tableAppModel.setRowCount(0);
        for(Application app : this.db.getListApps())
        {
            this.tableAppModel.addRow(new Object[]{app.getId(), app.getName(), app.getPath()});
        }
    }
    
    /* ConfigDomain*/
    private void btnDelCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseEntered

    private void btnDelCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseExited
        this.cd.tirarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseExited

    private void btnDelCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCriarActionPerformed

        int qtdCriar = 0;

        if(radioPadrao.isSelected()){
            qtdCriar = 7;
        }

        if(tabelaCriar.getRowCount() > qtdCriar){
            this.cd.getModelCriar().removeRow(tabelaCriar.getRowCount()-1);
        }

        if(this.cd.getModelCriar().getRowCount() > 0){
            btnCriar.setEnabled(true);
        } else {
            btnCriar.setEnabled(false);
        }
    }//GEN-LAST:event_btnDelCriarActionPerformed

    private void btnCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseEntered

        if(btnCriar.isEnabled()){
            this.cd.colocarMouseBtnAcao(btnCriar);
        }

    }//GEN-LAST:event_btnCriarMouseEntered

    private void btnCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCriarMouseExited

        if(btnCriar.isEnabled()){
            this.cd.tirarMouseBtnAcao(btnCriar);
        }

    }//GEN-LAST:event_btnCriarMouseExited

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed

        lblStatus.setText("");
        lblBkp.setText("");

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            this.cd.stopDomain(false, dirDomain);
            this.cd.backupDomainXml(xml, dirDomain);

            if(this.cd.isPadrao(radioPadrao)){
                this.cd.criarConfigPadrao(xml, lblStatus, lblMensagem);
            } else {
                this.cd.criarConfigPerson(xml, lblStatus, lblMensagem);
            }
        } catch (IOException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnAddCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseEntered

    private void btnAddCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseExited
        this.cd.tirarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseExited

    private void btnAddCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCriarActionPerformed

        this.cd.getModelCriar().addRow(new Object[]{"", ""});

        if(this.cd.getModelCriar().getRowCount() > 0){
            btnCriar.setEnabled(true);
        } else {
            btnCriar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddCriarActionPerformed

    private void btnAddAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseEntered

    private void btnAddAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseExited
        this.cd.tirarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseExited

    private void btnAddAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlterarActionPerformed

        this.cd.getModelAlterar().addRow(new Object[]{"", ""});

        if(this.cd.getModelAlterar().getRowCount() > 0){
            btnAlterar.setEnabled(true);
        } else {
            btnAlterar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddAlterarActionPerformed

    private void btnDelAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseEntered

    private void btnDelAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseExited
        this.cd.tirarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseExited

    private void btnDelAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAlterarActionPerformed

        int qtdAlterar = 0;

        if(radioPadrao.isSelected()){
            qtdAlterar = 3;
        }

        if(tabelaAlterar.getRowCount() > qtdAlterar){
            this.cd.getModelAlterar().removeRow(tabelaAlterar.getRowCount()-1);
        }

        if(this.cd.getModelAlterar().getRowCount() > 0){
            btnAlterar.setEnabled(true);
        } else {
            btnAlterar.setEnabled(false);
        }

    }//GEN-LAST:event_btnDelAlterarActionPerformed

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered

        if(btnAlterar.isEnabled()){
            this.cd.colocarMouseBtnAcao(btnAlterar);
        }

    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited

        if(btnAlterar.isEnabled()){
            this.cd.tirarMouseBtnAcao(btnAlterar);
        }

    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            this.cd.stopDomain(false, dirDomain);
            this.cd.backupDomainXml(xml, dirDomain);

            if(this.cd.isPadrao(radioPadrao)){
                this.cd.alterarConfigPadrao(xml, lblStatus, lblMensagem);
            } else {
                this.cd.alterarConfigPerson(xml, lblStatus, lblMensagem);
            }

        } catch (IOException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (XPathExpressionException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAddDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseEntered

    private void btnAddDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseExited
        this.cd.tirarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseExited

    private void btnAddDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeletarActionPerformed

        this.cd.getModelDeletar().addRow(new Object[]{"", ""});

        if(this.cd.getModelDeletar().getRowCount() > 0){
            btnDeletar.setEnabled(true);
        } else {
            btnDeletar.setEnabled(false);
        }

    }//GEN-LAST:event_btnAddDeletarActionPerformed

    private void btnDelDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseEntered
        this.cd.colocarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseEntered

    private void btnDelDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseExited
        this.cd.tirarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseExited

    private void btnDelDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDeletarActionPerformed

        int qtdDelete = 0;

        if(radioPadrao.isSelected()){
            qtdDelete = 1;
        }

        if(tabelaDeletar.getRowCount() > qtdDelete){
            this.cd.getModelDeletar().removeRow(tabelaDeletar.getRowCount()-1);
        }

        if(this.cd.getModelDeletar().getRowCount() > 0){
            btnDeletar.setEnabled(true);
        } else {
            btnDeletar.setEnabled(false);
        }

    }//GEN-LAST:event_btnDelDeletarActionPerformed

    private void btnDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseEntered

        if(btnDeletar.isEnabled()){
            this.cd.colocarMouseBtnAcao(btnDeletar);
        }

    }//GEN-LAST:event_btnDeletarMouseEntered

    private void btnDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeletarMouseExited

        if(btnDeletar.isEnabled()){
            this.cd.tirarMouseBtnAcao(btnDeletar);
        }

    }//GEN-LAST:event_btnDeletarMouseExited

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed

        try {
            File xml = new File(dirDomain.getText() + "\\config\\domain.xml");
            this.cd.stopDomain(false, dirDomain);
            this.cd.backupDomainXml(xml, dirDomain);

            if(this.cd.isPadrao(radioPadrao)){
                this.cd.deletarConfigPadrao(xml, lblStatus, lblMensagem);
            } else {
                this.cd.deletarConfigPerson(xml, lblStatus, lblMensagem);
            }

        } catch (IOException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(ConfigDomain.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void dirDomainFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dirDomainFocusLost

        if(!dirDomain.getText().isEmpty()){

            if(!this.cd.existDomainXML(dirDomain)){
                radioPadrao.setEnabled(false);
                radioPersonalizado.setEnabled(false);
                btnCriar.setEnabled(false);
                btnAlterar.setEnabled(false);
                btnDeletar.setEnabled(false);
                painelAba.setEnabled(false);
                btnStop.setEnabled(false);
                lblMensagem.setText("Arquivo domain.xml não existe! Verifique o caminho informado!");
            } else {
                lblMensagem.setText("");
                radioPadrao.setEnabled(true);
                radioPersonalizado.setEnabled(true);
                btnCriar.setEnabled(true);
                btnAlterar.setEnabled(true);
                btnDeletar.setEnabled(true);
                painelAba.setEnabled(true);
                btnStop.setEnabled(true);
                if(this.cd.isPadrao(radioPadrao)){
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

        if(this.cd.existDomainXML(dirDomain)){
            this.cd.deleteTabelaAlterar();
            this.cd.deleteTabelaCriar();
            this.cd.deleteTabelaDeletar();

            this.cd.populaTabelaAlterar();
            this.cd.populaTabelaCriar();
            this.cd.populaTabelaDeletar();

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

        if(this.cd.existDomainXML(dirDomain)){
            this.cd.deleteTabelaAlterar();
            this.cd.deleteTabelaCriar();
            this.cd.deleteTabelaDeletar();

            this.cd.populaTabelaAlterar();
            this.cd.populaTabelaCriar();
            this.cd.populaTabelaDeletar();

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

                    if(!this.cd.existDomainXML(dirDomain)){
                        radioPadrao.setEnabled(false);
                        radioPersonalizado.setEnabled(false);
                        painelAba.setEnabled(false);
                        btnCriar.setEnabled(false);
                        btnAlterar.setEnabled(false);
                        btnDeletar.setEnabled(false);
                        btnStop.setEnabled(false);
                        lblMensagem.setText("Arquivo domain.xml não existe! Verifique o caminho informado!");
                    } else {

                        radioPadrao.setEnabled(true);
                        radioPersonalizado.setEnabled(true);
                        painelAba.setEnabled(true);
                        btnCriar.setEnabled(true);
                        btnAlterar.setEnabled(true);
                        btnDeletar.setEnabled(true);
                        btnStop.setEnabled(true);
                        if(this.cd.isPadrao(radioPadrao)){
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

    /**
     * Remove
     * @param evt 
     */
    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        if(this.tbApp.getSelectedRow() == -1)
        {
            return;
        }
        this.db.removeApp((int)(this.tbApp.getValueAt(this.tbApp.getSelectedRow(), 0)));
        this.db.updateIdsAppList();
        this.updateTablesExecutar();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel4MouseClicked
    {//GEN-HEADEREND:event_jLabel4MouseClicked
        new AddApplication(db, this).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel7MouseClicked
    {//GEN-HEADEREND:event_jLabel7MouseClicked
        new AddVariable(db, this).setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtExecKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_txtExecKeyReleased
    {//GEN-HEADEREND:event_txtExecKeyReleased
        if(this.txtExec.getText().contains("$"))
        {
            for(Variable v : this.db.getListVars())
            {
                if(v.getKey().equalsIgnoreCase(this.txtExec.getText()))
                {
                    this.txtExec.setText(v.getValue());
                    return;
                }
            }
        }
    }//GEN-LAST:event_txtExecKeyReleased

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel6MouseClicked
    {//GEN-HEADEREND:event_jLabel6MouseClicked
        new HistFrame(db, this).setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel3MouseClicked
    {//GEN-HEADEREND:event_jLabel3MouseClicked
        if(this.txtExec.getText().equals(""))
        {
            return;
        }
        System.out.println("Execute: " + this.txtExec.getText());
        try
        {
            this.db.getListHist().add(this.txtExec.getText());
            File f = new File(this.txtExec.getText());
            Desktop d = Desktop.getDesktop();
            d.open(f);
        } 
        catch (Exception ex)
        {
            VBMsg.error("Erro ao executar:\n" + ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tbAppMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tbAppMouseClicked
    {//GEN-HEADEREND:event_tbAppMouseClicked
        if(evt.getClickCount() >= 2)
        {
            this.txtExec.setText(this.tbApp.getValueAt(this.tbApp.getSelectedRow(), 2) + "");
            this.jLabel3MouseClicked(null);
        }
    }//GEN-LAST:event_tbAppMouseClicked

    private void lbeeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lbeeMouseClicked
    {//GEN-HEADEREND:event_lbeeMouseClicked
        lbee.setText(new String(Base64.decode("YnJ1bm8gdmlhZG8=")));
    }//GEN-LAST:event_lbeeMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel8MouseClicked
    {//GEN-HEADEREND:event_jLabel8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel9MouseClicked
    {//GEN-HEADEREND:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel10MouseClicked
    {//GEN-HEADEREND:event_jLabel10MouseClicked
        if(this.tbDomain.getSelectedRow() == -1)
        {
            return;
        }
        String domainName = this.tbDomain.getValueAt(this.tbDomain.getSelectedRow(), 0) + "";
        System.out.println("cmd " + this.db.getDirGf() + "/../bin asadmin start-domain " + domainName);
        try
        {
            VBSystem.cmdCommand("cmd " + this.db.getDirGf() + "/../bin asadmin start-domain " + domainName);
        } 
        catch(Exception ex)
        {
            VBMsg.error("Erro ao executar ação:\n" + ex);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel11MouseClicked
    {//GEN-HEADEREND:event_jLabel11MouseClicked
        this.tableDomainModel.setRowCount(0);
        
        File f = new File(this.txtGf.getText());
        if(!f.exists())
        {
            this.txtGf.setForeground(Color.red);
            return;
        }
        this.txtGf.setForeground(Color.black);
        for(File file : f.listFiles())
        {
            this.tableDomainModel.addRow(new Object[]{file.getName()});
        }
        this.db.setDirGf(this.txtGf.getText());
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisar1ActionPerformed
    {//GEN-HEADEREND:event_btnPesquisar1ActionPerformed
        VBChooser chooser = new VBChooser();
        chooser.setType(VBChooser.DIRECTORIES_ONLY);
        File f = chooser.showOpenDialog();
        if(f != null)
        {
            this.txtGf.setText(f.getPath());
        }
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

    private void btnPesquisar1FocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_btnPesquisar1FocusLost
    {//GEN-HEADEREND:event_btnPesquisar1FocusLost

    }//GEN-LAST:event_btnPesquisar1FocusLost

    public JTextField getTxtExec()
    {
        return txtExec;
    }

    public void setTxtExec(JTextField txtExec)
    {
        this.txtExec = txtExec;
    }
    
    public void updateToolTipExec()
    {
        String tip = "<html><table border=0>";
        for(Variable v : this.db.getListVars())
        {
            tip += "<tr><td>" + v.getKey() + "</td><td>" + v.getValue() + "</td></tr>";
        }
        tip+="</table></html>";
        this.txtExec.setToolTipText(tip);
    }

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
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JButton btnStop;
    private javax.swing.JTextField dirDomain;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbee;
    private javax.swing.JLabel lblBkp;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTabbedPane painelAba;
    private javax.swing.JRadioButton radioPadrao;
    private javax.swing.JRadioButton radioPersonalizado;
    private javax.swing.JTable tabelaAlterar;
    private javax.swing.JTable tabelaCriar;
    private javax.swing.JTable tabelaDeletar;
    private javax.swing.JTable tbApp;
    private javax.swing.JTable tbDomain;
    private javax.swing.JTextField txtExec;
    private javax.swing.JTextField txtGf;
    // End of variables declaration//GEN-END:variables

}
