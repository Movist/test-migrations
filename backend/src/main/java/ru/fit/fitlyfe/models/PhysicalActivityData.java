package ru.fit.fitlyfe.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;

@Data
@Entity
public class PhysicalActivityData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataId;

    private int steps;

    private float distance;

    private Time workoutTime;

    private float caloriesBurned;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserProfile userId;

}
