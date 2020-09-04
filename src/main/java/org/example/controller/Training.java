package org.example.controller;

import org.example.enums.*;

import java.util.*;

public class Training {
    // In data
    private String name;
    private TrainingAge trainingAge;
    private int setsPerGroup;
    private TrainingType trainingType;

    // Out data
    private int estimatedTime;
    private Map<String, List<ExerciseField>> trainingDays;
    private Map<MuscleGroup, Integer> musclesVolume;
    private Map<StrengthMuscleGroup, Integer> strengthVolume;


    // Constructors
    public Training(String name, TrainingAge trainingAge, int setsPerGroup, TrainingType trainingType) {
        this.name = name;
        this.trainingAge = trainingAge;
        this.setsPerGroup = setsPerGroup;
        this.trainingType = trainingType;

        trainingDays = new HashMap<>();
        musclesVolume = new HashMap<>();
        strengthVolume = new HashMap<>();

        fillMuscleVolume();
    }

    public Training(String name, TrainingAge trainingAge, TrainingType trainingType) {
        this.name = name;
        this.trainingAge = trainingAge;
        this.trainingType = trainingType;

        trainingDays = new HashMap<>();
        musclesVolume = new HashMap<>();
        strengthVolume = new HashMap<>();

        switch (trainingAge) {
            case Novice:
                setsPerGroup = 10;
                break;
            case Intermediate:
                setsPerGroup = 13;
                break;
            case Advanced:
                setsPerGroup = 16;
                break;
        }

        fillMuscleVolume();
    }

    // Functionality

    /**
     * Adds all muscle groups to this training
     */
    private void fillMuscleVolume() {
        EnumSet
                .allOf(MuscleGroup.class)
                .forEach(muscleGroup -> musclesVolume.put(muscleGroup, 0));
        EnumSet
                .allOf(StrengthMuscleGroup.class)
                .forEach(strengthMuscleGroup -> strengthVolume.put(strengthMuscleGroup, 0));
    }

    /**
     * Calculates training volume
     */
    private void calculateVolume() {
        for (List<ExerciseField> trainingDay : trainingDays.values()) {
            for (ExerciseField exrcFld : trainingDay) {
                addExerciseVolume(exrcFld);
            }
        }
    }

    private void addExerciseVolume(ExerciseField exercise) {
        for (MuscleGroup muscle : exercise.getExerciseName().getPrimaryMuscles()) {
            int currentSets = musclesVolume.get(muscle);
            int updatedSets = currentSets + exercise.getSets();
            musclesVolume.replace(muscle, updatedSets);
        }

        for (MuscleGroup muscle : exercise.getExerciseName().getSecondaryMuscles()) {
            int currentSets = musclesVolume.get(muscle);
            int updatedSets = currentSets + exercise.getSets();
            musclesVolume.replace(muscle, updatedSets);
        }

        for (StrengthMuscleGroup muscle : exercise.getExerciseName().getStrengthMuscleGroups()) {
            int currentSets = strengthVolume.get(muscle);
            int updatedSets = currentSets + exercise.getSets();
            strengthVolume.replace(muscle, updatedSets);
        }

    }

    /**
     * Add new training day to this training
     */
    public void addTrainingDay(String name) {
        trainingDays.put(name, new ArrayList<>());
    }

    public void addExercise(String dayName, ExerciseField exerciseField) {
        trainingDays.get(dayName).add(exerciseField);
        calculateVolume();
    }

    public Map<MuscleGroup, Integer> getMusclesVolume() {
        return musclesVolume;
    }

    public Map<StrengthMuscleGroup, Integer> getStrengthVolume() {
        return strengthVolume;
    }

    public Integer getMuscleVolume(MuscleGroup muscleGroup) {
        return musclesVolume.get(muscleGroup);
    }

    public Integer getStrengthGroupVolume(StrengthMuscleGroup strengthMuscleGroup) {
        return strengthVolume.get(strengthMuscleGroup);
    }

    public TrainingAge getTrainingAge() {
        return trainingAge;
    }

    public void setTrainingAge(TrainingAge trainingAge) {
        this.trainingAge = trainingAge;
    }

    public int getSetsPerGroup() {
        return setsPerGroup;
    }

    public void setSetsPerGroup(int setsPerGroup) {
        this.setsPerGroup = setsPerGroup;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }
}
