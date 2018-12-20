package oss.kafka.ui.swing.shell;

import oss.kafka.ui.swing.pages.NewConnection;

import javax.swing.*;
import java.awt.*;

public class Container extends JPanel {

    private NewConnection newConnection;

    public Container() {
        initComponents();
    }

    private void initComponents() {
        setLayout(new CardLayout());
        newConnection = new NewConnection();
        add(newConnection);
    }
}
