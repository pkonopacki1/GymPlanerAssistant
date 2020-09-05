package org.example.view;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MenuBar menuBar;
    TrainingWorkoutPanel workoutPanel;

    public MainFrame() {
        menuBar = new MenuBar();
        workoutPanel = new TrainingWorkoutPanel();

        setJMenuBar(menuBar);
        add(workoutPanel, BorderLayout.CENTER);

        setTitle("Gym Planer Assistant");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
