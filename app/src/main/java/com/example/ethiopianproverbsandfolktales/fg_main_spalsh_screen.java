package com.example.ethiopianproverbsandfolktales;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class fg_main_spalsh_screen extends Fragment {


    public fg_main_spalsh_screen() {
        // Required empty public constructor
    }


    public static fg_main_spalsh_screen newInstance(String param1, String param2) {
        fg_main_spalsh_screen fragment = new fg_main_spalsh_screen();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fg_main_spalsh_screen_layout, container, false);

        view.findViewById(R.id.forleftOones).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), activity_First_option_menu.class));

            }
        });





        return view;
    }
}