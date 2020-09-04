package org.example.controller;

import org.example.enums.Exercise;

public class ExerciseField {
    private Exercise exerciseName;
    private int sets;
    private int[] reps;
    private int maxRepPercent;
    private int rpe;

    public ExerciseField(Exercise exerciseName, int sets, int[] reps, int maxRepPercent, int rpe) {
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.reps = reps;
        this.maxRepPercent = maxRepPercent;
        this.rpe = rpe;
    }

    public ExerciseField(Exercise exerciseName, int sets, int reps, int maxRepPercent, int rpe) {
        this.exerciseName = exerciseName;
        this.sets = sets;
        this.maxRepPercent = maxRepPercent;
        this.rpe = rpe;
        this.reps = new int[sets];

        for (int i: this.reps ) {
            i = reps;
        }
    }

    public Exercise getExerciseName() {
        return exerciseName;
    }

    public int getSets() {
        return sets;
    }

    public int[] getReps() {
        return reps;
    }

    public int getMaxRepPercent() {
        return maxRepPercent;
    }

    public int getRpe() {
        return rpe;
    }

    public void setExerciseName(Exercise exerciseName) {
        this.exerciseName = exerciseName;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public void setReps(int[] reps) {
        this.reps = reps;
    }

    public void setMaxRepPercent(int maxRepPercent) {
        this.maxRepPercent = maxRepPercent;
    }

    public void setRpe(int rpe) {
        this.rpe = rpe;
    }
}
