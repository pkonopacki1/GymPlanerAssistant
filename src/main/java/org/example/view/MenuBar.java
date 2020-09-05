package org.example.view;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu optionsMenu = new JMenu("Options");
        JMenuItem addWorkoutMenu = new JMenuItem("Add new workout");

        optionsMenu.add(addWorkoutMenu);

        add(optionsMenu);
    }
}
