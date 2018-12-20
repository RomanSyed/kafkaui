package oss.kafka.ui.swing.pages;

import javax.swing.*;
import java.awt.*;

public class NewConnection extends JPanel {
  public NewConnection() {
    initComponents();
  }

  private void initComponents() {
    //   setBackground(Color.BLUE);

    // Application main panel

    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    JPanel header = new JPanel();
    gbc.gridx = gbc.gridy = 0;
    gbc.gridwidth = gbc.gridheight = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.weightx = gbc.weighty = 5;
    // add(panel1, gbc); // add component to the ContentPane

    header.setBackground(new Color(244, 246, 247));
    add(header, gbc);

    JPanel body = new JPanel();
    gbc.gridy = 1;
    gbc.weightx = gbc.weighty = 95;
    gbc.insets = new Insets(2, 2, 2, 2);

    body.setBackground(Color.WHITE);
    add(body, gbc);
  }
}
