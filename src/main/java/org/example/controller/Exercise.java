package org.example.controller;

import org.example.enums.MuscleGroup;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
    private List<MuscleGroup> primaryMuscles;
    private List<MuscleGroup> secondaryMuscles;
    boolean isCompound;

    public Exercise() {
        primaryMuscles = new ArrayList<>();
        secondaryMuscles = new ArrayList<>();
        isCompound = false;
    }

    public List<MuscleGroup> getPrimaryMuscles() {
        return primaryMuscles;
    }

    public void setPrimaryMuscles(List<MuscleGroup> primaryMuscles) {
        this.primaryMuscles = primaryMuscles;
    }

    public List<MuscleGroup> getSecondaryMuscles() {
        return secondaryMuscles;
    }

    public void setSecondaryMuscles(List<MuscleGroup> secondaryMuscles) {
        this.secondaryMuscles = secondaryMuscles;
    }

    public boolean isCompound() {
        return isCompound;
    }

    public void setCompound(boolean compound) {
        isCompound = compound;
    }
}
