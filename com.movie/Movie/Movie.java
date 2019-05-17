package Movie;

import java.util.Arrays;
import java.util.Date;

public class Movie {


        String title;
        String description;
        int rating;
        Genre genre;
        Date premierDate;
        String [] actor;
        String director;
        String writer;

    public Movie(String title,
            String description,
        int rating,
        Genre genre,
        Date premierDate,
        String[] actor,
        String director,
        String writer) {
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.genre = genre;
        this.premierDate = premierDate;
        this.actor = actor;
        this.director = director;
        this.writer = writer;
    }
    public Movie(String title,
            String description,
            Genre genre,
            Date premierDate,
            String[] actor,
            String director,
            String writer) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.premierDate = premierDate;
        this.actor = actor;
        this.director = director;
        this.writer = writer;
    }




    public Movie(String title, String description, int i, Genre romance, String date, String[] actor) {
    }


        public String aboutMovie(){

        return "Title: " +this.title + "\n"+
                "Description: " + this.description + "\n"+
                "Rating: " + this.rating + "\n"+
                "Genre: " + this.genre + "\n" +
                "Premier Date: " + this.premierDate + "\n" +
                "Actors: " + Arrays.toString(this.actor) + "\n" +
                "Director: " + this.director + "\n" +
                "Writer: " + this.writer;

    }
}
