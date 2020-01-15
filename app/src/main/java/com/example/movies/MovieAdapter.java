package com.example.movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    private Context mCtx;
    private List<Movie> movietList;

    public MovieAdapter(Context mCtx, List<Movie> movietList) {
        this.mCtx = mCtx;
        this.movietList = movietList;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.activity_home,null);
        MovieViewHolder holder=new MovieViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
       Movie movie=movietList.get(position);
       holder.title.setText(movie.getTitle());
       holder.rating.setText(movie.getRating());

    }

    @Override
    public int getItemCount() {
        return movietList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
       TextView title;
       TextView rating;
       ImageView poster_image;
       public MovieViewHolder(View itemView){
           super(itemView);
           poster_image=itemView.findViewById(R.id.poster_image);
           title=itemView.findViewById(R.id.title);
           rating=itemView.findViewById(R.id.rating);


       }


    }
}
