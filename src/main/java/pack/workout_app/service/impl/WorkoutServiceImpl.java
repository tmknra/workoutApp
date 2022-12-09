package pack.workout_app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pack.workout_app.dto.WorkoutOutDto;
import pack.workout_app.repository.ExerciseRepository;
import pack.workout_app.service.WorkoutService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    private final ExerciseRepository exerciseRepository;

    @Autowired
    public WorkoutServiceImpl(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @Override
    public WorkoutOutDto getSingleWorkout() {
        Random intencity = new Random();
        // System.out.println(intencity.nextInt());
        String exercise1 = exerciseRepository.findExercise(2, 1);
        String exercise2 = exerciseRepository.findExercise(intencity.nextInt(2)+1, 5);
        String exercise3 = exerciseRepository.findExercise(2, 2);
        String exercise4 = exerciseRepository.findExercise(intencity.nextInt(2)+1, 6);
        String exercise5 = exerciseRepository.findExercise(1, 3);
        String exercise6 = exerciseRepository.findExercise(1, 4);

        List<String> result = new ArrayList<>(Arrays.asList(exercise1, exercise2, exercise3, exercise4, exercise5, exercise6));

        return WorkoutOutDto.builder().workout(result).build();
    }
}
