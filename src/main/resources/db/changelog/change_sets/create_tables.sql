create table muscle_groups (
    id serial primary key,
    name varchar(45)
);

create table intensity (
    id  serial primary key,
    value int
);

create table exercises (
    id serial primary key,
    name varchar(45),
    intensity_id int references intensity (id)
);

create table exercise_to_muscle (
    id serial primary key,
    exercise_id int references exercises (id),
    muscle_id int references muscle_groups (id)
)