package com.example.mvvmnerds.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.mvvmnerds.R;
import com.example.mvvmnerds.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MovieViewModel movieViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        movieViewModel = new ViewModelProvider(this).get(MovieViewModel.class);
        binding.setViewModel(movieViewModel);
        binding.setLifecycleOwner(this);

    }

}
