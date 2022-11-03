
package agendatelefonica.interfacegrafica;

import agendatelefonica.Contato;
import javax.swing.ImageIcon;

public class DetalhesContatoDialog extends javax.swing.JDialog {
    private Contato contato;

    public DetalhesContatoDialog(java.awt.Frame parent, boolean modal, Contato contato) {
        super(parent, modal);
        this.contato = contato;
        initComponents();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        iconeLabel = new javax.swing.JLabel();
        labelNomeContato = new javax.swing.JLabel();
        labelNumeroContato = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        labelDetalhes = new javax.swing.JLabel();
        labelDetalhesTexto = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Detalhes");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        iconeLabel.setFont(new java.awt.Font("Liberation Sans", 1, 48)); // NOI18N
        iconeLabel.setForeground(new java.awt.Color(255, 255, 255));
        iconeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agendatelefonica/interfacegrafica/imagem/back-img-13.png"))); // NOI18N
        iconeLabel.setText("M");
        iconeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelNomeContato.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        labelNomeContato.setForeground(new java.awt.Color(0, 0, 0));
        labelNomeContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNomeContato.setText(contato.getNome());

        labelNumeroContato.setFont(new java.awt.Font("Ubuntu Light", 1, 24)); // NOI18N
        labelNumeroContato.setForeground(new java.awt.Color(0, 0, 0));
        labelNumeroContato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNumeroContato.setText(contato.getNumero());

        separador.setBackground(new java.awt.Color(204, 204, 204));
        separador.setForeground(new java.awt.Color(153, 153, 153));

        labelDetalhes.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        labelDetalhes.setForeground(new java.awt.Color(0, 0, 0));
        labelDetalhes.setText("Detalhes:");

        labelDetalhesTexto.setFont(new java.awt.Font("Ubuntu Light", 0, 13)); // NOI18N
        labelDetalhesTexto.setForeground(new java.awt.Color(0, 0, 0));
        labelDetalhesTexto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDetalhesTexto.setText(contato.getDetalhes());
        labelDetalhesTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnEditar.setBackground(new java.awt.Color(61, 143, 143));
        btnEditar.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 143, 143)));

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Ubuntu Light", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(61, 143, 143));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(61, 143, 143)));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNomeContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNumeroContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelPrincipalLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelDetalhesTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelDetalhes))))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(17, 17, 17))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(iconeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNomeContato)
                .addGap(18, 18, 18)
                .addComponent(labelNumeroContato)
                .addGap(27, 27, 27)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelDetalhesTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel iconeLabel;
    private javax.swing.JLabel labelDetalhes;
    private javax.swing.JLabel labelDetalhesTexto;
    private javax.swing.JLabel labelNomeContato;
    private javax.swing.JLabel labelNumeroContato;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
