package com.example.mvvmnerds.ui;

import com.example.mvvmnerds.modela.MovieModel;

public class MoviePresenter {

    MovieView view;

    public MoviePresenter(MovieView view) {
        this.view = view;
    }

    public MovieModel getMovieFromDatabase(){
        return new MovieModel("Cast Away", "28/5/1993", "Very Sad Movie", 1);
    }

    public void getMovieName(){
        view.onGetMovieName(getMovieFromDatabase().getName());
    }
}
