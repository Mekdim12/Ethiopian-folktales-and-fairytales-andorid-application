package com.example.ethiopianproverbsandfolktales;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ZoomButtonsController;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fg_question_and_answering_solution  extends Fragment {
    Button option_A, option_B, option_C,option_D;
    TextView questionHolder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_question_and_answering_solution, container, false);
        questionHolder = view.findViewById(R.id.main_question_holder);
        questionHolder.setMovementMethod(new ScrollingMovementMethod());
        questionHolder.setLineSpacing(0,1.0f);
        option_A = view.findViewById(R.id.FirstOption_from_choice);
        option_A.setMovementMethod(new ScrollingMovementMethod());
        option_A.setLineSpacing(0,1.0f);
        option_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option_A.startAnimation(AnimationUtils.loadAnimation(getContext(),R.anim.shaking_effect_for_wrong_answers_in_questions));
            }
        });
        option_B = view.findViewById(R.id.Option_B_from_choice);
        option_B.setMovementMethod(new ScrollingMovementMethod());
        option_B.setLineSpacing(0,1.0f);
        option_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "aaaaa", Toast.LENGTH_SHORT).show();
            }
        });
        option_C = view.findViewById(R.id.Option_c_from_choice);
        option_C.setMovementMethod(new ScrollingMovementMethod());
        option_C.setLineSpacing(0,1.0f);
        option_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "aaaaa", Toast.LENGTH_SHORT).show();
            }
        });

        option_D = view.findViewById(R.id.LastOption_from_choice);
        option_D.setMovementMethod(new ScrollingMovementMethod());
        option_D.setLineSpacing(0,1.0f);
        option_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "ddddddddddd", Toast.LENGTH_SHORT).show();
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
        return view;
    }


}
