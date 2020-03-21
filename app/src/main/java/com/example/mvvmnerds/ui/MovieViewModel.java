package com.example.mvvmnerds.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmnerds.modela.MovieModel;

public class MovieViewModel extends ViewModel {

    public MutableLiveData<String> movieNameMutableLiveData = new MutableLiveData<>();

    public void getMovieName(){
        String movieName = getMovieFromDatabase().getName();
        movieNameMutableLiveData.setValue(movieName);
    }

    private MovieModel getMovieFromDatabase(){
        return new MovieModel("Cast Away", "28/5/1993", "Very Sad Movie", 1);
    }

}
