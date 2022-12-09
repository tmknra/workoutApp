insert into exercises (name, intensity_id)
values ('Triceps Cable Pushdowns', 1),
       ('Bench Press - Close Grip (Barbell)', 2),
       ('Seated Dumbbell Overhead Extension', 2),
       ('Triceps Extensions - Lying (Barbell)', 2),
       ('Hammer Curls', 1),
       ('Hammer Curls (Cable)', 1),
       ('Drag Curl (Barbell)', 2),
       ('Drag Curl (Dumbbell)', 2),
       ('Biceps Curls - Incline (Dumbbells)', 1);

insert into exercise_to_muscle (exercise_id, muscle_id)
VALUES (16, 6),
       (17, 6),
       (18, 6),
       (19, 6),
       (20, 5),
       (21, 5),
       (22, 5),
       (23, 5),
       (24, 5);
