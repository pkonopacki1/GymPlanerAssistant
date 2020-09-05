package org.example.view;

import org.example.controller.TrainingProgram;

import javax.swing.*;
import java.awt.*;

public class TrainingWorkoutPanel extends Panel {
    TrainingProgram trainingProgram;
    JButton newProgramBtn;

    public TrainingWorkoutPanel() {
        if(trainingProgram == null) {
            newProgramBtn = new JButton("Add new Workout Program");
            add(newProgramBtn);
        }
    }

    public void setTraining(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }
}
