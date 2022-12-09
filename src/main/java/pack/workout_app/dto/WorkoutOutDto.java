package pack.workout_app.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class WorkoutOutDto {
    private List<String> workout;
}
