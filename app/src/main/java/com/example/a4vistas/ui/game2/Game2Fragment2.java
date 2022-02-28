package com.example.a4vistas.ui.game2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.a4vistas.R;


public class Game2Fragment2 extends Fragment {
    Button boton1, boton2, boton3, boton4;
    String answer = "CPU";
    ImageView imageView;
    View vista;
    TextView textView;
    public static int t ;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_game_pass, container, false);

        imageView=vista.findViewById(R.id.imageView2);
        boton1=vista.findViewById(R.id.option1);
        boton2=vista.findViewById(R.id.option2);
        boton3=vista.findViewById(R.id.option3);
        boton4=vista.findViewById(R.id.option4);
        textView=vista.findViewById(R.id.textView3);
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (boton1.getText().toString().equals(answer)) {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment3);
                } else {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment8);
                }
            }
        });
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (boton2.getText().toString().equals(answer)) {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment3);
                } else {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment8);
                }
            }
        });
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (boton3.getText().toString().equals(answer)) {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment3);
                } else {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment8);
                }
            }
        });
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (boton4.getText().toString().equals(answer)) {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment3);
                } else {
                    Navigation.findNavController(view).navigate(R.id.action_game2Fragment2_to_game2Fragment8);
                }
            }
        });
        return vista;
    }

}