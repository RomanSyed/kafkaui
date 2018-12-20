package oss.kafka.ui.swing.shell;

import javax.swing.*;
import java.awt.*;

public class Navigation extends JPanel {

  private JButton newConnection;
  private JButton favourites;
  private JButton recants;

  public Navigation() {
    initComponents();
  }

  private void initComponents() {

    JPanel contentArea;
    {
      setLayout(new GridBagLayout());
      GridBagConstraints gbc = new GridBagConstraints();

      JPanel header = new JPanel();
      gbc.gridx = gbc.gridy = 0;
      gbc.gridwidth = gbc.gridheight = 1;
      gbc.fill = GridBagConstraints.BOTH;
      gbc.anchor = GridBagConstraints.NORTHWEST;
      gbc.weightx = gbc.weighty = 7;
      // add(panel1, gbc); // add component to the ContentPane

      header.setBackground(new Color(53, 52, 52));
      add(header, gbc);

      gbc.gridy = 1;
      gbc.weightx = gbc.weighty = 93;
      gbc.insets = new Insets(2, 2, 2, 2);
      contentArea = new JPanel();
      add(contentArea, gbc);
    }

    contentArea.setLayout(new GridLayout(13, 1, 0, 5));
    contentArea.setBackground(Color.GREEN);
    newConnection = new JButton("New Connection");
    favourites = new JButton("Favourites");
    recants = new JButton("RECANTS");

    contentArea.add(newConnection);
    contentArea.add(favourites);
    contentArea.add(recants);

    //    setLayout(new GridLayout(13, 1, 0, 5));
    //    newConnection = new JButton("New Connection");
    //    favourites = new JButton("Favourites");
    //    recants = new JButton("RECANTS");
    //
    //    add(newConnection);
    //    add(favourites);
    //    add(recants);
  }
}
