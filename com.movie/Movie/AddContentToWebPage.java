package Movie;

import javax.swing.plaf.ActionMapUIResource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AddContentToWebPage {

    Scanner scan;
    List<Movie> movieStorage2 = new ArrayList<>();
    DateFormatChange object = new DateFormatChange();


        public void createNewMovie (){
        Movie movie;
        String[] actor;
        scan = new Scanner(System.in);
        System.out.println("Enter title of the movie");
        String title = scan.nextLine();
        System.out.println("Enter description of the movie");
        String description = scan.nextLine();
        System.out.println("Enter premier date");
        String date = scan.nextLine();
        Date dateMovie = object.parseDate(date);
        System.out.println("Enter actors names");
        String actorName = scan.nextLine();
        actor = new String[]{actorName};
        System.out.println("Enter director name");
        String director = scan.nextLine();
        System.out.println("Enter writer name");
        String writer = scan.nextLine();
        movie = new Movie(title, description, Genre.ROMANCE, dateMovie, actor, director, writer );
        movieStorage2.add(movie);
        System.out.println("Movie is created");
        System.out.println(movie.aboutMovie());
      }

}
