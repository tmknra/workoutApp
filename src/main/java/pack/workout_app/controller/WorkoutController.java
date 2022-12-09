package pack.workout_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.workout_app.dto.WorkoutOutDto;
import pack.workout_app.service.WorkoutService;

@RestController
@RequestMapping("api/v1/workout")
public class WorkoutController {

    private final WorkoutService workoutService;

    @Autowired
    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping("/split")
    WorkoutOutDto getSingleSplitWorkout(){
        return workoutService.getSingleWorkout();
    }
}
