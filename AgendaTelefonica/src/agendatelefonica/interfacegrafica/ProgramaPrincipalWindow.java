
package agendatelefonica.interfacegrafica;


public class ProgramaPrincipalWindow extends javax.swing.JFrame {

   
    public ProgramaPrincipalWindow() {
        initComponents();
    }

    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        splitPanePrincipal = new javax.swing.JSplitPane();
        panelContatos = new javax.swing.JPanel();
        scrollContatos = new javax.swing.JScrollPane();
        listContatos = new javax.swing.JList<>();
        panelPrincipal = new javax.swing.JPanel();
        labelImagem = new javax.swing.JLabel();
        labelPanelNomeContato = new javax.swing.JLabel();
        labelNumeroContato = new javax.swing.JLabel();
        panelButtons = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonI = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonExcluir = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        splitPanePrincipal.setDividerLocation(300);
        splitPanePrincipal.setDividerSize(2);

        panelContatos.setBackground(new java.awt.Color(255, 255, 255));
        panelContatos.setMinimumSize(new java.awt.Dimension(300, 100));

        scrollContatos.setBorder(null);

        listContatos.setBackground(new java.awt.Color(255, 255, 255));
        listContatos.setBorder(null);
        listContatos.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        listContatos.setForeground(new java.awt.Color(0, 0, 0));
        listContatos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Yudi Tamashiro", "Luke Greenwood", "Lakia Ebert", "Tonia Pipkin" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listContatos.setSelectionBackground(new java.awt.Color(61, 143, 143));
        listContatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        scrollContatos.setViewportView(listContatos);

        org.jdesktop.layout.GroupLayout panelContatosLayout = new org.jdesktop.layout.GroupLayout(panelContatos);
        panelContatos.setLayout(panelContatosLayout);
        panelContatosLayout.setHorizontalGroup(
            panelContatosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelContatosLayout.createSequentialGroup()
                .addContainerGap()
                .add(scrollContatos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelContatosLayout.setVerticalGroup(
            panelContatosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelContatosLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(scrollContatos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 521, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        splitPanePrincipal.setLeftComponent(panelContatos);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icone-principal.png"))); // NOI18N
        labelImagem.setToolTipText("");

        labelPanelNomeContato.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        labelPanelNomeContato.setForeground(new java.awt.Color(0, 0, 0));
        labelPanelNomeContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPanelNomeContato.setText("Yudi Tamashiro");

        labelNumeroContato.setFont(new java.awt.Font("Ubuntu Light", 0, 24)); // NOI18N
        labelNumeroContato.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroContato.setText("+55 4002 8922");

        panelButtons.setBackground(new java.awt.Color(255, 255, 255));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 60, 5));

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-adicionar-contato-40.png"))); // NOI18N
        buttonAdd.setToolTipText("");
        buttonAdd.setBorder(null);
        panelButtons.add(buttonAdd);

        buttonI.setBackground(new java.awt.Color(255, 255, 255));
        buttonI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-info-40.png"))); // NOI18N
        buttonI.setBorder(null);
        panelButtons.add(buttonI);

        buttonEdit.setBackground(new java.awt.Color(255, 255, 255));
        buttonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-editar-40.png"))); // NOI18N
        buttonEdit.setBorder(null);
        panelButtons.add(buttonEdit);

        buttonExcluir.setBackground(new java.awt.Color(255, 255, 255));
        buttonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-excluir-40.png"))); // NOI18N
        buttonExcluir.setBorder(null);
        panelButtons.add(buttonExcluir);

        org.jdesktop.layout.GroupLayout panelPrincipalLayout = new org.jdesktop.layout.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(labelImagem, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(labelNumeroContato, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(panelButtons, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .add(labelPanelNomeContato, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panelPrincipalLayout.createSequentialGroup()
                .add(51, 51, 51)
                .add(labelImagem, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 258, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(labelPanelNomeContato)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(labelNumeroContato)
                .add(93, 93, 93)
                .add(panelButtons, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        splitPanePrincipal.setRightComponent(panelPrincipal);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(splitPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(splitPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaPrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaPrincipalWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExcluir;
    private javax.swing.JButton buttonI;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelNumeroContato;
    private javax.swing.JLabel labelPanelNomeContato;
    private javax.swing.JList<String> listContatos;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelContatos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollContatos;
    private javax.swing.JSplitPane splitPanePrincipal;
    // End of variables declaration//GEN-END:variables
}
