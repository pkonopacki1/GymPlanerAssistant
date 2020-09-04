package org.example;

import org.example.controller.ExerciseField;
import org.example.controller.Training;
import org.example.enums.Exercise;
import org.example.enums.MuscleGroup;
import org.example.enums.TrainingAge;
import org.example.enums.TrainingType;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Training testTraining = new Training("Test training", TrainingAge.Novice, TrainingType.Strength);
        ExerciseField exField1 = new ExerciseField(Exercise.BenchPress, 4, 5, 80, 8);

        for (Map.Entry<MuscleGroup, Integer> entry: testTraining.getMusclesVolume().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        testTraining.addTrainingDay("Day A");
        testTraining.addExercise("Day A", exField1);

        for (Map.Entry<MuscleGroup, Integer> entry: testTraining.getMusclesVolume().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
