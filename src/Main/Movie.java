package Main;

import java.util.ArrayList;

public class Movie {
     private static int movieID=0;
     private String movieName;
     private ArrayList type ;
     private int []showTime=new int[3];

    public Movie() {
        movieName = "Not Available";
        movieID++;
    }

    public Movie(String movieName, ArrayList type, int[] showTime) {
        this.movieName = movieName;
        this.type = type;
        this.showTime = showTime;
    }

    public static int getMovieID() {
        return movieID;
    }


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public ArrayList getType() {
        return type;
    }

    public void setType(ArrayList type) {
        this.type = type;
    }

    public int[] getShowTime() {
        return showTime;
    }

    public void setShowTime(int[] showTime) {
        this.showTime = showTime;
    }
}
