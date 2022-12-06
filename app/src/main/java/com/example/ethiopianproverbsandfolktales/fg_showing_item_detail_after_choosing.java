package com.example.ethiopianproverbsandfolktales;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fg_showing_item_detail_after_choosing  extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fg_showing_item_detail_after_choosing, container, false);

        TextView contetnHolder =  v.findViewById(R.id.mainContentHolder);
        contetnHolder.setMovementMethod(new ScrollingMovementMethod());


        getActivity().findViewById(R.id.backToMainPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.first_main_fragmentContainer, new fg_list_of_items_found_inside_first_option(),"TobackFunc");
                fragmentTransaction.setReorderingAllowed(true);
                fragmentTransaction.addToBackStack("TobackFunc");
                fragmentTransaction.commit();
            }
        });

        return v;

    }
}


