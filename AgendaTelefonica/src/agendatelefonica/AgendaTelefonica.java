package agendatelefonica;

import agendatelefonica.interfacegrafica.ProgramaPrincipalWindow;
import java.util.List;
import java.util.ArrayList;

public class AgendaTelefonica {

    public static void main(String args[]) {

        List<Contato> contatos = new ArrayList<Contato>();
        

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {

            java.util.logging.Logger.getLogger(ProgramaPrincipalWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaPrincipalWindow(contatos).setVisible(true);
            }
        });
    }

}
