package pack.workout_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pack.workout_app.model.Exercise;
import pack.workout_app.model.Intensity;
import pack.workout_app.model.MuscleGroup;

import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

    // @Query(value =
    //         "select name as exercise from exercises " +
    //         "join exercise_to_muscle on muscle_id = :muscleGroup " +
    //         "where intensity_id = :intensity" , nativeQuery = true)
    @Query(value =
            "select name from exercises " +
            "join exercise_to_muscle " +
            "on exercises.id = exercise_id " +
            "where muscle_id = :muscleGroup and intensity_id = :intensity " +
            "order by random()" +
            "limit 1"
            , nativeQuery = true)
    String findExercise(@Param("intensity") Integer intensity, @Param("muscleGroup") Integer muscleGroup);
}
