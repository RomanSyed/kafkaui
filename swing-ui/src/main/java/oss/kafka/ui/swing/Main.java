package oss.kafka.ui.swing;

import oss.kafka.ui.swing.shell.Shell;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(
                new Runnable() {
                    public void run() {
                        Shell shell = new Shell();
                        shell.setVisible(true);
                        shell.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        shell.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                });
    }
}
