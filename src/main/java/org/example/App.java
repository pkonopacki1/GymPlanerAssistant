package org.example;

import org.example.controller.Training;
import org.example.enums.TrainingAge;
import org.example.enums.TrainingType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Training testTraining = new Training("Test training", 2, TrainingAge.Novice, TrainingType.Strength);
        testTraining.generateTraining();


    }
}
