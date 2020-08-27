package org.example.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    SettingsPanel settingsPanel;

    public MainFrame() {
        settingsPanel = new SettingsPanel();

        add(settingsPanel, BorderLayout.WEST);


        setTitle("Gym Planer Assistant");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
