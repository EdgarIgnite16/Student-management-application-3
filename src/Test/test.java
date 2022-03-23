package Test;

import GUI.LoginDialogGUI;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LoginDialogGUI(new JFrame(), true).setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
