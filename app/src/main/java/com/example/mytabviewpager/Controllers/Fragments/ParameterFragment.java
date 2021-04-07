package com.example.mytabviewpager.Controllers.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.mytabviewpager.R;

public class ParameterFragment extends Fragment {


    public ParameterFragment() {
        // Required empty public constructor
    }

    public static ParameterFragment newInstance() {

        return (new ParameterFragment());
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_parameter_fragmet, container, false);
    }
}