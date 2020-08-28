package org.example.enums;

import static org.example.enums.MuscleGroup.*;
import static org.example.enums.StrengthMuscleGroup.*;

public enum Exercise {
    Squat(
            new MuscleGroup[]{Quads, Glutes},
            new MuscleGroup[]{Erectors},
            new StrengthMuscleGroup[]{Lower},
            true),
    BenchPress(
            new MuscleGroup[]{Chest, AnteriorDelts},
            new MuscleGroup[] {Tris},
            new StrengthMuscleGroup[] {Push},
            true),
    Deadlift(
            new MuscleGroup[] {Glutes, Hams, Erectors},
            new MuscleGroup[] {ScapularRetractors},
            new StrengthMuscleGroup[] {Lower, Pull},
            true
    );

    private MuscleGroup[] primaryMuscles;
    private MuscleGroup[] secondaryMuscles;
    private StrengthMuscleGroup[] strengthMuscleGroups;
    boolean isCompound;

    Exercise(MuscleGroup[] primaryMuscles, MuscleGroup[] secondaryMuscles, StrengthMuscleGroup[] strengthMuscleGroups,
             boolean isCompound) {
        this.primaryMuscles = primaryMuscles;
        this.secondaryMuscles = secondaryMuscles;
        this.strengthMuscleGroups = strengthMuscleGroups;
        this.isCompound = isCompound;
    }

    public MuscleGroup[] getPrimaryMuscles() {
        return primaryMuscles;
    }

    public MuscleGroup[] getSecondaryMuscles() {
        return secondaryMuscles;
    }

    public StrengthMuscleGroup[] getStrengthMuscleGroups() {
        return strengthMuscleGroups;
    }

    public boolean isCompound() {
        return isCompound;
    }
}
