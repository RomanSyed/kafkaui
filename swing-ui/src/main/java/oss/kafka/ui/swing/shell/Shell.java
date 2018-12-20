/*
 * Created by JFormDesigner on Wed Dec 19 13:44:31 IST 2018
 */

package oss.kafka.ui.swing.shell;

import javax.swing.*;
import java.awt.*;

public class Shell extends JFrame {

  private Container container;
  private JMenuBar menuBar;

  public Shell() {
    initComponents();
  }

  private void initComponents() {
    // Application main panel
    JPanel mainPanel = new JPanel();
    mainPanel.setBackground(Color.BLACK);
    mainPanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    Navigation navigation = new Navigation();
    gbc.gridx = gbc.gridy = 0;
    gbc.gridwidth = gbc.gridheight = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.anchor = GridBagConstraints.NORTHWEST;
    gbc.weightx = gbc.weighty = 20;
    // add(panel1, gbc); // add component to the ContentPane

    navigation.setBackground(new Color(76, 83, 89));
    mainPanel.add(navigation, gbc);

    container = new Container();
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 2;
    gbc.weightx = /*gbc.weighty = */ 80;
    gbc.insets = new Insets(2, 2, 2, 2);
    //  add(panel3, gbc); // add component to the ContentPane

    container.setBackground(Color.WHITE);
    mainPanel.add(container, gbc);

    // mainPanel.add(container);

    // Set the window to be visible as the default to be false
    // mainPanel.setPreferredSize();
    // mainPanel.setPreferredSize();

    menuBar = new JMenuBar();
    this.setJMenuBar(menuBar);

    this.add(mainPanel);

    this.pack();
  }
}
