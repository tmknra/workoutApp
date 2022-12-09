package pack.workout_app.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "exercises")
@Data
public class Exercise {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "intensity_id", referencedColumnName = "id")
    private Intensity intensity;

    @ManyToMany
    @JoinTable(
            name = "muscle_groups",
            joinColumns = @JoinColumn(name = "exercise_id"),
            inverseJoinColumns = @JoinColumn(name = "muscle_id"))
    Set<MuscleGroup> muscleGroups;
}
