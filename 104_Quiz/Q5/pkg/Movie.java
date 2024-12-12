package pkg;

public class Movie{
    String movieName;
    double rating;
    int numberRatings;
    int revenue;

public Movie(){
    movieName = "Avengers";
    rating = 8.0;
    numberRatings = 33;
    revenue = 623357910;
}

public Movie(String m, double ra, int n, int re){
    movieName = m;
    rating = ra;
    numberRatings  = n;
    revenue = re;
}

public String getMovieName(){
    return movieName;
}

public double getRating(){
    return rating;
}

public int getnumberOfRatings(){
    return numberRatings;
}

public int getRevenue(){
    return revenue;
}

public double addRating(double x){
    numberRatings = numberRatings + 1;
    double newRating = 0.0;
    newRating = rating*numberRatings;
    newRating += x;
    rating = newRating/numberRatings;
    return rating;
}

public boolean compareRatings(String a){
    if(rating>5.0){
        return true;
    }
}

public void movieToString(){
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings:" + numberRatings);
    System.out.println("Revenue: " + revenue);
}
}
