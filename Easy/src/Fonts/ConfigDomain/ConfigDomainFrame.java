package Fonts.ConfigDomain;

import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConfigDomainFrame extends javax.swing.JFrame {

    private final DefaultTableModel modelCriar;
    private final DefaultTableModel modelAlterar;
    private final DefaultTableModel modelDeletar;
    private int aux;
    
    public ConfigDomainFrame(){
        initComponents();        
        this.modelCriar = (DefaultTableModel) tabelaCriar.getModel();  
        this.modelAlterar = (DefaultTableModel) tabelaAlterar.getModel();  
        this.modelDeletar = (DefaultTableModel) tabelaDeletar.getModel();
        this.aux = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        painelFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dirDomain = new javax.swing.JTextField();
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
        btnPesquisar = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        radioPadrao = new javax.swing.JRadioButton();
        radioPersonalizado = new javax.swing.JRadioButton();
        lblStatus = new javax.swing.JLabel();
        lblBkp = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuConfig = new javax.swing.JMenu();
        menuStop = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSTDN = new javax.swing.JMenuItem();
        menuWIKI = new javax.swing.JMenuItem();
        menuStopD = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuração de Domínio");
        setResizable(false);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Caminho domínio:");

        dirDomain.setToolTipText("");
        dirDomain.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dirDomainFocusLost(evt);
            }
        });

        painelAba.setBackground(new java.awt.Color(255, 255, 255));
        painelAba.setEnabled(false);
        painelAba.setOpaque(true);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tabelaCriar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"-Xrs"},
                {"-Xmn512m"},
                {"-Xms1024m"},
                {"-XX:+CMSParallelRemarkEnabled"},
                {"-XX:SurvivorRatio=20"},
                {"-XX:+UseParNewGC"},
                {"-XX:+UseConcMarkSweepGC"}
            },
            new String [] {
                "Chave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaCriar.setEnabled(false);
        jScrollPane1.setViewportView(tabelaCriar);

        btnDelCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnDelCriar.setBorderPainted(false);
        btnDelCriar.setContentAreaFilled(false);
        btnDelCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelCriar.setEnabled(false);
        btnDelCriar.setOpaque(true);
        btnDelCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelCriarMouseExited(evt);
            }
        });
        btnDelCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        btnCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCriarMouseExited(evt);
            }
        });
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnAddCriar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddCriar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        btnAddCriar.setBorderPainted(false);
        btnAddCriar.setContentAreaFilled(false);
        btnAddCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCriar.setEnabled(false);
        btnAddCriar.setOpaque(true);
        btnAddCriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddCriarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddCriarMouseExited(evt);
            }
        });
        btnAddCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
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
            new Object [][] {
                {"-XX:MaxPermSize=192m", "-XX:MaxPermSize=512m"},
                {"-client", "-server"},
                {"-Xmx512m", "-Xmx2048m"}
            },
            new String [] {
                "De", "Para"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaAlterar.setEnabled(false);
        jScrollPane2.setViewportView(tabelaAlterar);
        if (tabelaAlterar.getColumnModel().getColumnCount() > 0) {
            tabelaAlterar.getColumnModel().getColumn(0).setResizable(false);
            tabelaAlterar.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAddAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        btnAddAlterar.setBorderPainted(false);
        btnAddAlterar.setContentAreaFilled(false);
        btnAddAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAlterar.setEnabled(false);
        btnAddAlterar.setOpaque(true);
        btnAddAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddAlterarMouseExited(evt);
            }
        });
        btnAddAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAlterarActionPerformed(evt);
            }
        });

        btnDelAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnDelAlterar.setBorderPainted(false);
        btnDelAlterar.setContentAreaFilled(false);
        btnDelAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelAlterar.setEnabled(false);
        btnDelAlterar.setOpaque(true);
        btnDelAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelAlterarMouseExited(evt);
            }
        });
        btnDelAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
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
            new Object [][] {
                {"-XX:NewRatio=2"}
            },
            new String [] {
                "Chave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaDeletar.setEnabled(false);
        jScrollPane3.setViewportView(tabelaDeletar);

        btnAddDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnAddDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/add.png"))); // NOI18N
        btnAddDeletar.setBorderPainted(false);
        btnAddDeletar.setContentAreaFilled(false);
        btnAddDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddDeletar.setEnabled(false);
        btnAddDeletar.setOpaque(true);
        btnAddDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddDeletarMouseExited(evt);
            }
        });
        btnAddDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeletarActionPerformed(evt);
            }
        });

        btnDelDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDelDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/delete.png"))); // NOI18N
        btnDelDeletar.setBorderPainted(false);
        btnDelDeletar.setContentAreaFilled(false);
        btnDelDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelDeletar.setEnabled(false);
        btnDelDeletar.setOpaque(true);
        btnDelDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelDeletarMouseExited(evt);
            }
        });
        btnDelDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
        btnDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeletarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeletarMouseExited(evt);
            }
        });
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
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

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/search.png"))); // NOI18N
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setOpaque(true);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        btnPesquisar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btnPesquisarFocusLost(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        radioPadrao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioPadrao);
        radioPadrao.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioPadrao.setSelected(true);
        radioPadrao.setText("Padrão");
        radioPadrao.setEnabled(false);
        radioPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPadraoActionPerformed(evt);
            }
        });

        radioPersonalizado.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioPersonalizado);
        radioPersonalizado.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        radioPersonalizado.setText("Personalizado");
        radioPersonalizado.setEnabled(false);
        radioPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPersonalizadoActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblBkp.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblBkp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(radioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioPersonalizado))
                    .addComponent(painelAba)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dirDomain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMensagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBkp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dirDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioPersonalizado)
                    .addComponent(radioPadrao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelAba, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBkp, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), null));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setOpaque(false);

        menuConfig.setBackground(new java.awt.Color(255, 255, 255));
        menuConfig.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuConfig.setText("Configuração");
        menuConfig.setOpaque(true);

        menuStop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuStop.setBackground(new java.awt.Color(255, 255, 255));
        menuStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/ConfigDomain/stop.png"))); // NOI18N
        menuStop.setText("stop-domain");
        menuStop.setBorder(null);
        menuStop.setEnabled(false);
        menuStop.setOpaque(true);
        menuStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuStopActionPerformed(evt);
            }
        });
        menuConfig.add(menuStop);

        jMenuBar1.add(menuConfig);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/help.png"))); // NOI18N
        jMenu2.setToolTipText("Help");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu2.setOpaque(true);

        menuSTDN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuSTDN.setBackground(new java.awt.Color(255, 255, 255));
        menuSTDN.setText("STDN");
        menuSTDN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSTDN.setOpaque(true);
        menuSTDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSTDNActionPerformed(evt);
            }
        });
        jMenu2.add(menuSTDN);

        menuWIKI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuWIKI.setBackground(new java.awt.Color(255, 255, 255));
        menuWIKI.setText("Wiki");
        menuWIKI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuWIKI.setOpaque(true);
        menuWIKI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuWIKIActionPerformed(evt);
            }
        });
        jMenu2.add(menuWIKI);

        jMenuBar1.add(jMenu2);

        menuStopD.setBackground(new java.awt.Color(255, 255, 255));
        menuStopD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        menuStopD.setEnabled(false);
        menuStopD.setOpaque(true);
        menuStopD.setPreferredSize(new java.awt.Dimension(303, 19));
        menuStopD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStopDMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStopD);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSTDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSTDNActionPerformed

        try {
            URI uri = new URI("http://intranet.senior.com.br/senior/portal-interno-documentacao/manual-usuario/stdn/svcl/default.htm#Subsystems/fad/content/tecnologia/info_tecnicas/servidor_javaee/glassfish/gf_configuracao_producao.htm%3FTocPath%3DFerramentas%2520Administrativas%7CInforma%25C3%25A7%25C3%25B5es%2520T%25C3%25A9cnicas%7CServidor%2520Java%2520EE%7CGlassFish%7C_____10");
            Desktop d = Desktop.getDesktop();
            d.browse(uri);
        } catch (URISyntaxException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuSTDNActionPerformed

    private void menuWIKIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuWIKIActionPerformed
        
        try {
            URI uri = new URI("http://wiki.senior.com.br/Paginas/Configura%C3%A7%C3%A3o%20Glassfish%203.aspx");
            Desktop d = Desktop.getDesktop();
            d.browse(uri);
        } catch (URISyntaxException ex) {      
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuWIKIActionPerformed

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

    private void btnAddAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAlterarActionPerformed
        
        this.modelAlterar.addRow(new Object[]{"", ""});
        
        if(this.modelAlterar.getRowCount() > 0){
            btnAlterar.setEnabled(true);
        } else {
            btnAlterar.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddAlterarActionPerformed

    private void btnAddDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeletarActionPerformed
        
        this.modelDeletar.addRow(new Object[]{"", ""});
        
        if(this.modelDeletar.getRowCount() > 0){
            btnDeletar.setEnabled(true);
        } else {
            btnDeletar.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddDeletarActionPerformed

    private void btnAddCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCriarActionPerformed
        
        this.modelCriar.addRow(new Object[]{"", ""});  
        
        if(this.modelCriar.getRowCount() > 0){
            btnCriar.setEnabled(true);
        } else {
            btnCriar.setEnabled(false);
        }
        
    }//GEN-LAST:event_btnAddCriarActionPerformed

    private void btnAddCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseEntered
        colocarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseEntered

    private void btnAddCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCriarMouseExited
        tirarMouseBtnAddDel(btnAddCriar);
    }//GEN-LAST:event_btnAddCriarMouseExited

    private void btnDelCriarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseEntered
        colocarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseEntered

    private void btnDelCriarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelCriarMouseExited
        tirarMouseBtnAddDel(btnDelCriar);
    }//GEN-LAST:event_btnDelCriarMouseExited

    private void btnAddAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseEntered
        colocarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseEntered

    private void btnAddAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddAlterarMouseExited
        tirarMouseBtnAddDel(btnAddAlterar);
    }//GEN-LAST:event_btnAddAlterarMouseExited

    private void btnDelAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseEntered
        colocarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseEntered

    private void btnDelAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelAlterarMouseExited
        tirarMouseBtnAddDel(btnDelAlterar);
    }//GEN-LAST:event_btnDelAlterarMouseExited

    private void btnAddDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseEntered
        colocarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseEntered

    private void btnAddDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddDeletarMouseExited
        tirarMouseBtnAddDel(btnAddDeletar);
    }//GEN-LAST:event_btnAddDeletarMouseExited

    private void btnDelDeletarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseEntered
        colocarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseEntered

    private void btnDelDeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelDeletarMouseExited
        tirarMouseBtnAddDel(btnDelDeletar);
    }//GEN-LAST:event_btnDelDeletarMouseExited

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

    private void btnPesquisarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnPesquisarFocusLost
        
                    
        
    }//GEN-LAST:event_btnPesquisarFocusLost

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

    private void menuStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuStopActionPerformed

        try {
            stopDomain(true);
        } catch (IOException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(ConfigDomainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_menuStopActionPerformed

    private void menuStopDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStopDMouseClicked
        
        this.aux++;
        
        if(aux == 5){
            new About(this, true).setVisible(true);
            this.aux = 0;
        }
        
    }//GEN-LAST:event_menuStopDMouseClicked
    
    private void tirarMouseBtnAcao(JButton btn){
        btn.setBackground(new Color(153,153,153));
    }
    
    private void colocarMouseBtnAcao(JButton btn){
        btn.setBackground(new Color(102, 102, 102));
    }    
    
    private void tirarMouseBtnAddDel(JButton btn){
        btn.setBackground(Color.WHITE);
    }
    
    private void colocarMouseBtnAddDel(JButton btn){
        btn.setBackground(new Color(230, 255, 255));
    }    
    
    private boolean existDomainXML(){
        
        if(dirDomain.getText().isEmpty()){            
            return false;
        } else {            
            File f = new File(dirDomain.getText() + "\\config\\domain.xml");            
            if(!f.exists()){
                return false;
            } else {
                return true;
            }
        }
    }
    
    private void populaTabelaCriar(){
        this.modelCriar.addRow(new Object[]{"-Xrs"});
        this.modelCriar.addRow(new Object[]{"-Xmn512m"});
        this.modelCriar.addRow(new Object[]{"-Xms1024m"});
        this.modelCriar.addRow(new Object[]{"-XX:+CMSParallelRemarkEnabled"});
        this.modelCriar.addRow(new Object[]{"-XX:SurvivorRatio=20"});
        this.modelCriar.addRow(new Object[]{"-XX:+UseParNewGC"});
        this.modelCriar.addRow(new Object[]{"-XX:+UseConcMarkSweepGC"});
    }
    
    private void populaTabelaAlterar(){
        this.modelAlterar.addRow(new Object[]{"-XX:MaxPermSize=192m", "-XX:MaxPermSize=512m"});
        this.modelAlterar.addRow(new Object[]{"-client", "-server"});
        this.modelAlterar.addRow(new Object[]{"-Xmx512m", "-Xmx2048m"});
    }
    
    private void populaTabelaDeletar(){
        this.modelDeletar.addRow(new Object[]{"-XX:NewRatio=2"});
    }
    
    private void deleteTabelaCriar(){
        this.modelCriar.setRowCount(0);
    }
    
    private void deleteTabelaAlterar(){
        this.modelAlterar.setRowCount(0);
    }
    
    private void deleteTabelaDeletar(){
        this.modelDeletar.setRowCount(0);
    }
    
    private void backupDomainXml(File xmlFile) throws IOException, InterruptedException{
               
        Date data = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        
        Process p = Runtime.getRuntime().exec("cmd /C xcopy " + xmlFile.getAbsolutePath() + " %TEMP% /A");        
        p.waitFor();
        p.destroy();
        Runtime.getRuntime().exec("cmd /C ren %TEMP%\\" + xmlFile.getName() + " " + nomeDomain() + "-" + df.format(data) + ".xml");
    }
    
    private void stopDomain(boolean message) throws IOException, InterruptedException{
        File asadmin = new File(dirDomain.getText() + "\\..\\..\\bin\\asadmin.bat");
                
        Process p = Runtime.getRuntime().exec("cmd /C " + asadmin.getAbsolutePath() + " stop-domain " + nomeDomain());        
                
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        if(stdInput.readLine() != null){
            String s = null;
            while ((s = stdInput.readLine()) != null) {
                
                if(s.contains("Command stop-domain executed successfully")){                    
                    
                    if(message){
                        JOptionPane.showMessageDialog(null, s);
                    }
                }
            }
        }
        
        if(stdError.readLine() != null){
            String s = null;
            while ((s = stdError.readLine()) != null) {                
                if(message){
                    JOptionPane.showMessageDialog(null, s);                
                }
            }
        }
        p.destroy();
    }
    
    private String nomeDomain(){
        
        String[] splitDomain = dirDomain.getText().split("\\\\");
        
        for(int i=0; i < splitDomain.length; i++){
            if(i == splitDomain.length -1){
                return splitDomain[i];                
            }
        }
        
        return null;
    }
        
    private Document carregarXML(File xml) throws IOException, SAXException, ParserConfigurationException{
        
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();        
        Document doc = docBuilder.parse(xml);        
        
        doc.getDocumentElement().normalize();
        
        return doc;        
    }
    
    private void alterarConfigPadrao(File xml) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerException {
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean alterou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element firstPersonElement = (Element)firstPersonNode; 
                                
                String att = firstPersonElement.getTextContent();
                
                if(att.contains("-XX:MaxPermSize=")){                    
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[0]);                    
                } else if(att.contains("-client")){
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[1]);
                } else if(att.contains("-Xmx512")){
                    alterou = true;
                    firstPersonElement.setTextContent(carregarConfigsPadraoAlterar()[2]);
                }
            }            
        }
        
        if(alterou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) alterado(s) com sucesso!"); 
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi alterado. Verifique se eles existem!");
            lblStatus.setText("");
        }
    }
    
    private void alterarConfigPerson(File xml) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException, TransformerException {
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean alterou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element firstPersonElement = (Element)firstPersonNode; 
                                
                String att = firstPersonElement.getTextContent();
                
                
                for(int i = 0; i < this.modelAlterar.getRowCount(); i++){
                    
                    if(att.contains(this.modelAlterar.getValueAt(i, 0) + "")){
                        firstPersonElement.setTextContent(this.modelAlterar.getValueAt(i, 1) + "");
                        alterou = true;
                    }                    
                }
            }            
        }
        
        if(alterou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) alterado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi alterado. Verifique se eles existem!");
            lblBkp.setText("");
        }
    }
    
    private void criarConfigPadrao(File xml) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);
        
        NodeList listOfPersons = doc.getElementsByTagName("java-config");        
        
        boolean criou = false;
        
        for(int i = 0; i < this.modelCriar.getRowCount(); i++){            
            
            if(!existParam(doc, this.modelCriar.getValueAt(i, 0) + "")){                
                Element add = doc.createElement("jvm-options");
                add.appendChild(doc.createTextNode(this.modelCriar.getValueAt(i, 0) + ""));            
                listOfPersons.item(0).appendChild(add);
                criou = true;
            }            
        }
        
        if(criou){
            saveNewXMLFile(doc, xml.getAbsolutePath());  
            lblStatus.setText("Parâmetro(s) criado(s) com sucesso!");     
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi criado.\nVerifique se já existem!");
            lblBkp.setText("");
        }
    }
    
    private void criarConfigPerson(File xml) throws TransformerException, IOException, SAXException, ParserConfigurationException{
        
        Document doc = carregarXML(xml);
        
        NodeList listOfPersons = doc.getElementsByTagName("java-config");        
        
        boolean criou = false;
        
        for(int i = 0; i < this.modelCriar.getRowCount(); i++){            
                        
            if(!existParam(doc, this.modelCriar.getValueAt(i, 0) + "")){                
                Element add = doc.createElement("jvm-options");
                add.appendChild(doc.createTextNode(this.modelCriar.getValueAt(i, 0) + ""));            
                listOfPersons.item(0).appendChild(add);    
                criou = true;
            }
        }        
        
        if(criou){
            saveNewXMLFile(doc, xml.getAbsolutePath());  
            lblStatus.setText("Parâmetro(s) criado(s) com sucesso!");            
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi criado.\nVerifique se já existem!");
            lblBkp.setText("");
        }
    }
    
    private void deletarConfigPadrao(File xml) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);

        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean apagou = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element remove = (Element)firstPersonNode; 
                
                String att = remove.getTextContent();
                
                if(att.contains("-XX:NewRatio")){ 
                    remove.getParentNode().removeChild(remove);
                    apagou = true;
                }
            }            
        }
        
        if(apagou){
            saveNewXMLFile(doc, xml.getAbsolutePath());    
            lblStatus.setText("Parâmetro(s) deletado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("O parâmetro não foi deletado pois não existe!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        }        
    }
    
    private void deletarConfigPerson(File xml) throws IOException, SAXException, ParserConfigurationException, TransformerException{
        
        Document doc = carregarXML(xml);

        NodeList listElem = doc.getElementsByTagName("jvm-options");
        
        boolean deletou = false; 
        
        for(int i = 0; i < this.modelDeletar.getRowCount(); i++){                    
            
            String chaveTabela = this.modelDeletar.getValueAt(i, 0) + "";

            for(int s = 0; s < listElem.getLength(); s++){

                Node firstElemNode = listElem.item(s);

                if(firstElemNode.getNodeType() == Node.ELEMENT_NODE){

                    Element remove = (Element)firstElemNode;         
                    String text = remove.getTextContent();

                    if(text.contains(chaveTabela.trim())){
                        remove.getParentNode().removeChild(remove);                        
                        deletou = true;
                    }
                }
            }            
        }
        
        if(deletou){
            saveNewXMLFile(doc, xml.getAbsolutePath());
            lblStatus.setText("Parâmetro(s) deletado(s) com sucesso!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        } else {
            lblStatus.setText("Nenhum parâmetro foi deletado. Verifique se eles existem!");
            lblBkp.setText("Backup salvo em: " + System.getProperty("user.home") + "\\AppData\\Local\\Temp");
        }
    }
    
    private void saveNewXMLFile(Document doc, String newFile) throws TransformerException{
        
        doc.getDocumentElement().normalize();
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(newFile));
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(source, result);        
    }
    
    private boolean isPadrao(){
        return radioPadrao.isSelected();
    }
    
    private String[] carregarConfigsPadraoAlterar(){
        
        String [] configs = new String[this.modelAlterar.getRowCount()];
        
        for(int i=0; i < this.modelAlterar.getRowCount(); i++){
            configs[i] = this.modelAlterar.getValueAt(i, 1) + "";            
        }
                
        return configs;
    }
            
    private boolean existParam(Document doc, String param) throws IOException, SAXException, ParserConfigurationException{
        
        NodeList listOfPersons = doc.getElementsByTagName("jvm-options");
        
        boolean isParamXm = false;
        
        for(int s = 0; s < listOfPersons.getLength(); s++){

            Node firstPersonNode = listOfPersons.item(s);
            
            if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){                
                
                Element elem = (Element)firstPersonNode; 
                
                String att = elem.getTextContent();
                
                String verifica = "";
                
                String paramXm = param.charAt(0) + "" + param.charAt(1) + "" + param.charAt(2) + "" + param.charAt(3);
                
                if(param.contains("Xmx") || param.contains("Xmn") || param.contains("Xms")){
                    verifica = paramXm;
                    isParamXm = true;
                } else {
                    verifica = param;
                    isParamXm = false;
                }
                                                
                if(att.contains(verifica)){                    
                    return true;
                }
            }            
        }
        return false;
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dirDomain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBkp;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenuItem menuSTDN;
    private javax.swing.JMenuItem menuStop;
    private javax.swing.JMenu menuStopD;
    private javax.swing.JMenuItem menuWIKI;
    private javax.swing.JTabbedPane painelAba;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JRadioButton radioPadrao;
    private javax.swing.JRadioButton radioPersonalizado;
    private javax.swing.JTable tabelaAlterar;
    private javax.swing.JTable tabelaCriar;
    private javax.swing.JTable tabelaDeletar;
    // End of variables declaration//GEN-END:variables
}