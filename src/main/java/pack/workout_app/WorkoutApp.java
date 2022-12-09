package pack.workout_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(value = "pack.workout_app.repository")
public class WorkoutApp {

    public static void main(String[] args) {
        SpringApplication.run(WorkoutApp.class, args);
    }

}
