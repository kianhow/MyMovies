package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MovieDetailActivity extends AppCompatActivity {

    TextView tvTitle, tvDateGenre, tvDesc, tvWatch, tvTheatre;
    ImageView ivRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        tvTitle = findViewById(R.id.textViewTitle);
        tvDateGenre = findViewById(R.id.textViewDateGenre);
        tvDesc = findViewById(R.id.textViewDescription);
        tvWatch = findViewById(R.id.textViewWatch);
        tvTheatre = findViewById(R.id.textViewTheatre);
        ivRating = findViewById(R.id.imageViewRating);


        Intent intentReceived = getIntent();
        String movieName = intentReceived.getStringExtra("name");
        String movieDateGenre = intentReceived.getStringExtra("dateGenre");
        String movieDesc = intentReceived.getStringExtra("description");
        String movieWatch = intentReceived.getStringExtra("watch");
        String movieTheatre = intentReceived.getStringExtra("theatre");
        String movieRating = intentReceived.getStringExtra("rating");

        if(movieRating.equalsIgnoreCase("g")) {
            ivRating.setImageResource(R.drawable.rating_g);
        }

        else if (movieRating.equalsIgnoreCase("pg")) {
            ivRating.setImageResource(R.drawable.rating_pg);
        }

        else if (movieRating.equalsIgnoreCase("pg13")) {
            ivRating.setImageResource(R.drawable.rating_pg13);
        }

        else if (movieRating.equalsIgnoreCase("nc16")) {
            ivRating.setImageResource(R.drawable.rating_nc16);
        }

        else if (movieRating.equalsIgnoreCase("m18")) {
            ivRating.setImageResource(R.drawable.rating_m18);
        }

        else if (movieRating.equalsIgnoreCase("r21")) {
            ivRating.setImageResource(R.drawable.rating_r21);
        }

        tvTitle.setText(movieName);
        tvDateGenre.setText(movieDateGenre);
        tvDesc.setText(movieDesc);
        tvWatch.setText("Watch on: " + movieWatch);
        tvTheatre.setText("In Theatre: " + movieTheatre);

    }
}
