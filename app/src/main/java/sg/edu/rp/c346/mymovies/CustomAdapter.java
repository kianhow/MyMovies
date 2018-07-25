package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17001227 on 25/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MovieItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // Inflate a new view hierarchy from the specified xml resource (layout_id)
        // and return the root View of the inflated hierarchy.
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI elements and bind them to their respective Java variable.
        ImageView ivMovie = rowView.findViewById(R.id.imageViewG);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvDateGenre = rowView.findViewById(R.id.textViewDateGenre);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        MovieItem currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvDateGenre.setText(currentItem.getDateGenre());

        if (currentItem.isG()) {
            ivMovie.setImageResource(R.drawable.rating_g);
        }
        else if (currentItem.isPG()) {
            ivMovie.setImageResource(R.drawable.rating_pg);
        }

        else if (currentItem.isPG13()){
            ivMovie.setImageResource(R.drawable.rating_pg13);
        }

        else if (currentItem.isNC16()){
            ivMovie.setImageResource(R.drawable.rating_nc16);
        }

        else if (currentItem.isM18()){
            ivMovie.setImageResource(R.drawable.rating_m18);
        }

        else {
            ivMovie.setImageResource(R.drawable.rating_r21);
        }

        // Return the View corresponding to the data at the specified position.
        return rowView;
    }

}
