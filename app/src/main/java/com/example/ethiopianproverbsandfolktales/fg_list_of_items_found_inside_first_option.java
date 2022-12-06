package com.example.ethiopianproverbsandfolktales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fg_list_of_items_found_inside_first_option extends Fragment {


    public fg_list_of_items_found_inside_first_option() {
        // Required empty public constructor
    }


    public static fg_list_of_items_found_inside_first_option newInstance() {
        fg_list_of_items_found_inside_first_option fragment = new fg_list_of_items_found_inside_first_option();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }
//
//
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment first_option_on_item_selected_from_main_page
        View view_ = inflater.inflate(R.layout.fg_showing_list_of_items_found_inside_first_option, container, false);

        view_.findViewById(R.id.the_First_item_for_as_mock).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                fg_showing_item_detail_after_choosing the_next_fragment = new fg_showing_item_detail_after_choosing();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.first_main_fragmentContainer, new fg_showing_item_detail_after_choosing(),"TobackFunc");
                fragmentTransaction.setReorderingAllowed(true);
                fragmentTransaction.addToBackStack("TobackFunc");
                fragmentTransaction.commit();

            }

        });

        getActivity().findViewById(R.id.backToMainPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.first_main_fragmentContainer, new fg_first_option_menu(),"TobackFunc");
                fragmentTransaction.setReorderingAllowed(true);
                fragmentTransaction.addToBackStack("TobackFunc");
                fragmentTransaction.commit();
            }
        });


        return view_;

    }
}
