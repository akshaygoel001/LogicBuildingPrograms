package NumberRelatedPrograms;

import java.util.Scanner;

public class Movie {

    private String movieName;
    private String movieRating;
    private int movieYear;
    private int movieDuration;

    public Movie(String movieName, String movieRating, int movieYear, int movieDuration) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.movieYear = movieYear;
        this.movieDuration = movieDuration;
    }

    @Override
    public String toString() {
        return "Movie Name='" + movieName + '\'' +
                ", Rating='" + movieRating + '\'' +
                ", Year=" + movieYear +
                ", Duration(in min)=" + movieDuration;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public int getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(int movieYear) {
        this.movieYear = movieYear;
    }

    public double getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String movie, rating;
        int year, runtime;
        Movie favoriteMovie;
        System.out.println("Please enter movie title: ");
        movie = in.nextLine();
        System.out.println("Please enter movie rating: ");
        rating = in.nextLine();
        System.out.println("Please enter year produced: ");
        year = in.nextInt();
        System.out.println("Please enter total runtime: ");
        runtime = in.nextInt();
        favoriteMovie = new Movie(movie, rating, year, runtime);
        System.out.println(favoriteMovie.toString());
    }
}
