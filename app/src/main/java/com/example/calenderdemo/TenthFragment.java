package com.example.calenderdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TenthFragment extends Fragment {


    public TenthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_tenth, container, false);
        return view;
    }
    public static TenthFragment newInstance(String text) {
        TenthFragment tenthFragment=new TenthFragment();
        return tenthFragment;
    }
}
