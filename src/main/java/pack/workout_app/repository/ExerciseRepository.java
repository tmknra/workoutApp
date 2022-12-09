package pack.workout_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pack.workout_app.model.Exercise;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    // List<String> composeWorkout();
}
