package com.example.ethiopianproverbsandfolktales;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fg_first_option_menu  extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.first_option_on_item_selected_from_main_page, container, false);

        v.findViewById(R.id.forReading_Item).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fg_list_of_items_found_inside_first_option the_next_fragment = new fg_list_of_items_found_inside_first_option();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.first_main_fragmentContainer, new fg_list_of_items_found_inside_first_option(),"traverse");
                fragmentTransaction.setReorderingAllowed(true);
                fragmentTransaction.addToBackStack("traverse");
                fragmentTransaction.commit();

            }
        });


        getActivity().findViewById(R.id.backToMainPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MainLandingPage.class));

            }
        });


        v.findViewById(R.id.forQuestionandAnswer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fg_question_and_answering_solution the_next_fragment = new fg_question_and_answering_solution();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.first_main_fragmentContainer, the_next_fragment,"backToMainOption");
                fragmentTransaction.setReorderingAllowed(true);
                fragmentTransaction.addToBackStack("backToMainOption");
                fragmentTransaction.commit();
            }
        });


        return v;

    }
}


