// PEDRO MORENO Y ROMARIO SANCHEZ
package Formularios;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(() -> {
            frmMatriz matriz = new frmMatriz();
            matriz.setVisible(true);
        });
    }
}
