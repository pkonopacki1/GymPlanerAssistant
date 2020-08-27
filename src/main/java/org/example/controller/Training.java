package org.example.controller;

import org.example.enums.TrainingAge;
import org.example.enums.TrainingType;

import static org.example.enums.TrainingAge.*;
import static org.example.enums.TrainingType.*;

public class Training {
    private int days;
    private TrainingAge trainingAge;
    private int setsPerGroup;
    private TrainingType trainingType;
    private int estimatedTime;

    public Training() {
        trainingAge = Custom;
        trainingType = Unspecified;
    }
}
