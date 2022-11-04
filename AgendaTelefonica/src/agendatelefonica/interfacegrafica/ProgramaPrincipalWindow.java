package agendatelefonica.interfacegrafica;

import agendatelefonica.Contato;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;

public class ProgramaPrincipalWindow extends javax.swing.JFrame {

    private List<Contato> contatos;

    public ProgramaPrincipalWindow(List<Contato> contatos) {
        initComponents();
        this.contatos = contatos;

    }

    public void addContato(Contato contato) {
        contatos.add(contato);
        Collections.sort(contatos);
        DefaultListModel<String> modelList = new DefaultListModel<>();

        for (Contato c : contatos) {
            modelList.addElement(c.getNome());
        }

        listContatos.setModel(modelList);

    }

    public void removerContato(Contato contato) {
        contatos.remove(contato);
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (Contato c : contatos) {
            listModel.addElement(c.getNome());
        }
        listContatos.setModel(listModel);

    }

    public void editarContato(Contato contato) {

        int indexContato = listContatos.getSelectedIndex();
        contatos.set(indexContato, contato);
        Collections.sort(contatos);
        
        DefaultListModel listModel = (DefaultListModel) listContatos.getModel();
        
        listModel.setElementAt(contato.getNome(), contatos.indexOf(contato));

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
        btnAdd = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda telefônica ");
        setAutoRequestFocus(false);
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
        listContatos.setSelectionBackground(new java.awt.Color(61, 143, 143));
        listContatos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        listContatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listContatosValueChanged(evt);
            }
        });
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

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-adicionar-contato-40.png"))); // NOI18N
        btnAdd.setToolTipText("");
        btnAdd.setBorder(null);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panelButtons.add(btnAdd);

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-info-40.png"))); // NOI18N
        btnInfo.setBorder(null);
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        panelButtons.add(btnInfo);

        btnEdit.setBackground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-editar-40.png"))); // NOI18N
        btnEdit.setBorder(null);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        panelButtons.add(btnEdit);

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/icones/icone-excluir-40.png"))); // NOI18N
        btnExcluir.setBorder(null);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        panelButtons.add(btnExcluir);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        NovoContatoDialog novoContato = new NovoContatoDialog(this, true, this);

        novoContato.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed

        Contato contato = contatos.get(listContatos.getSelectedIndex());
        DetalhesContatoDialog detalhesContato = new DetalhesContatoDialog(this, true, contato, this);
        detalhesContato.setVisible(true);

    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Contato contato;
        contato = contatos.get(listContatos.getSelectedIndex());
        EditarContatoDialog editarContato = new EditarContatoDialog(this, true, contato, this);
        editarContato.setVisible(true);

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Contato contato = contatos.get(listContatos.getSelectedIndex());
        removerContato(contato);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void listContatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listContatosValueChanged

        if (listContatos.isSelectionEmpty()) {
            labelPanelNomeContato.setText("Contato");
            labelNumeroContato.setText("");

        } else {
            labelPanelNomeContato.setText(listContatos.getSelectedValue());
            labelNumeroContato.setText(contatos.get(listContatos.getSelectedIndex()).getNumero());
        }
    }//GEN-LAST:event_listContatosValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInfo;
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
