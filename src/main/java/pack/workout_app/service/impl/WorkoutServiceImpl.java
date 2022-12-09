package pack.workout_app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.workout_app.dto.WorkoutOutDto;
import pack.workout_app.repository.ExerciseRepository;
import pack.workout_app.service.WorkoutService;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    private final ExerciseRepository exerciseRepository;

    @Autowired
    public WorkoutServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public WorkoutOutDto getSingleWorkout() {
        return null;
    }
}
