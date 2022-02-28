package com.example.a4vistas.ui.game2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.a4vistas.R;


public class Game2Fragment extends Fragment {
    Button button;
    TextView textView1;
    ImageView imageView;
    View vista;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_game2, container, false);
        button=vista.findViewById(R.id.botonRespuesta1);
        imageView=vista.findViewById(R.id.imageView2);
        textView1=vista.findViewById(R.id.textView);
        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_nav_game2_to_game2Fragment2, null));
        return vista;
    }


}