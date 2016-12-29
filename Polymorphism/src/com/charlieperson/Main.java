package com.charlieperson;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try and take over the universe.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

//    no plot method
}

public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Movie tempMovie = randomMovie();
            System.out.println("Name of movie is... " + tempMovie.getName());
            System.out.println(tempMovie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return null;
        }
    }
}






















