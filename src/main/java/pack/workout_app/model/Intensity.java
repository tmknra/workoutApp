package pack.workout_app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "intensity")
public class Intensity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long value;

    @OneToOne(mappedBy = "intensity")
    private Exercise exercise;

}
