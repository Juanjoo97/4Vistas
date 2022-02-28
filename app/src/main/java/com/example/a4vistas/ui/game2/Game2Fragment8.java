package com.example.a4vistas.ui.game2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.a4vistas.R;

public class Game2Fragment8 extends Fragment {
    Button boton1;
    ImageView imageView;
    View vista;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_wrong_answer, container, false);

        imageView=vista.findViewById(R.id.imageView2);
        boton1=vista.findViewById(R.id.button2);
        boton1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_game2Fragment8_to_nav_game2, null));

        return vista;
    }

}