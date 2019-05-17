package Movie;

import java.util.List;
import java.util.ArrayList;

public class MovieDB {


   protected List <Movie> movieStorage =  new ArrayList<>();



    public void addMovie(Movie movie) {
          movieStorage.add(movie);
        }


        public Movie findMovie(List <Movie> movieStorage, String title){
        for(Movie movie : movieStorage){
            if(movie.title.contains(title)){
                return movie;
            }
        }
        return null;
        }


    public void printFoundMovie(String title) {
        if(findMovie(movieStorage, title) != null){
            System.out.println(findMovie(movieStorage, title).aboutMovie());
        } else {
            System.out.println("Movie is not found!!!");
        }

       }



       }



