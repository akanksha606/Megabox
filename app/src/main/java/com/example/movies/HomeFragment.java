package com.example.movies;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.RequestQueue;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {
    List<Movie> movieList;
    RecyclerView recyclerView;
    RequestQueue movieQueue;
    private Context mContext;


     private String url=null;

    @Override
    public view onCreate(LayoutInflater inflater, ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        super.onCreate(savedInstanceState);

        recyclerView=view.findViewById(R.id.recycler_view_home);
        movieList=new ArrayList<>();




    }




}

