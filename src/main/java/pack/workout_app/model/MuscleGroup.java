package pack.workout_app.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "muscle_group")
public class MuscleGroup {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "muscleGroups")
    Set<Exercise> exercises;
}
