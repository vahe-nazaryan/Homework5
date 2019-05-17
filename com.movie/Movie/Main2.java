package Movie;

import java.util.Date;


public class Main2 {


    public static void main(String[] args) {

        DateFormatChange object = new DateFormatChange();
        Date dateMovie1 = object.parseDate("2019-05-03");
        Date dateMovie2 = object.parseDate("1995-01-13");
        Date dateMovie3 = object.parseDate("2016-01-24");

        String [] movie1Actors = {"Lily Collins", "Nicholas Hoult", "Laura Donnelly", "Patrick Gibson"};
        String [] movie2Actors = {"Brad Pitt", "Anthony Hopkins", "Aidan Quinn", "Julia Ormond", "Karina Lombard"};
        String [] movie3Actors = {"Logan Lerman", "Sarah Gadon", "Tijuana Ricks", "Linda Emond"};

        //creating movies
        Movie movie1 = new Movie("Tolkien", "Tolkien is a movie starring Lily Collins, Nicholas Hoult, and Laura Donnelly.",
                4, Genre.DRAMA, dateMovie1, movie1Actors, "Dome Karukoski", "Dome Karukoski");
        Movie movie2 = new Movie("Legends of the Fall", "Legends of the Fall was primarily filmed on location in Alberta and British Columbia, Canada.",
                5, Genre.FAMILY_DRAMA, dateMovie2, movie2Actors, "Edward Zwick", "Susan Shilliday");
        Movie movie3 = new Movie("Indignation", "Indignation is a 2016 American drama film written, produced, and directed by James Schamus.",
                5, Genre.ROMANCE, dateMovie3, movie3Actors, "James Schamus", "Philip Roth");

        MovieDB obj = new MovieDB();

        obj.addMovie(movie1);
        obj.addMovie(movie2);
        obj.addMovie(movie3);

        obj.printFoundMovie("Fall");



        //UserRegister user = new UserRegister();
        //.RegisterUser();

//        AddContentToWebPage object2 = new AddContentToWebPage();
//        object2.createNewMovie();




    }

}
