package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovies);

        alMovieList = new ArrayList<>();

        MovieItem item1 = new MovieItem("The Avengers", "2012 - Action | Sci- Fi", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", "15/11/2014","Golden Village - Bishan", "pg13" ,false, false, true, false, false);
        MovieItem item2 = new MovieItem("Planes", "2013 - Animation | Comedy","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.","15/5/2015","Cathay - AMK Hub", "pg", false, true, false, false, false);

        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this, R.layout.movie_items, alMovieList);

        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getBaseContext(), MovieDetailActivity.class);

                MovieItem currentMovie = alMovieList.get(i);

                intent.putExtra("name", currentMovie.getTitle());
                intent.putExtra("dateGenre", currentMovie.getDateGenre());
                intent.putExtra("description", currentMovie.getDesc());
                intent.putExtra("watch", currentMovie.getWatch());
                intent.putExtra("theatre", currentMovie.getTheatre());
                intent.putExtra("rating", currentMovie.getRating());
                startActivity(intent);

            }
        });

    }


}
