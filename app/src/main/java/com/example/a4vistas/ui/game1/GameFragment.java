package com.example.a4vistas.ui.game1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.a4vistas.databinding.FragmentGame1Binding;
import com.example.a4vistas.databinding.FragmentGame2Binding;

import com.example.a4vistas.R;


public class GameFragment extends Fragment {
    Button button, boton0,boton1;
    TextView tv1;
    MediaPlayer mp1;
    String numeroRecordar;                //  "xxxxx"
    String numeroJugador;
    View vista;
    private FragmentGame1Binding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        vista= inflater.inflate(R.layout.fragment_game1, container, false);
        button=vista.findViewById(R.id.button);
        boton0=vista.findViewById(R.id.boton0);
        boton1=vista.findViewById(R.id.boton1);
        tv1=vista.findViewById(R.id.tv1);
        desactivarBotones();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desactivarBotones();
                numeroRecordar="";
                agregarUnNumeroAlFinal();
                tv1.setText("Cantidad de cifras a recordar:"+numeroRecordar.length());
                numeroJugador="";
                emitirSonido(0);
            }
        });
        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroJugador=numeroJugador+"0";
                controlarSiEsCorrecto();
            }
        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroJugador=numeroJugador+"1";
                controlarSiEsCorrecto();
            }
        });

        return vista ;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    private void desactivarBotones() {
        boton0.setEnabled(false);
        boton1.setEnabled(false);
    }

    private void activarBotones() {
        boton0.setEnabled(true);
        boton1.setEnabled(true);
    }

    private void emitirSonido(int posicion) {
        if (mp1!=null)
            mp1.release();
        if(numeroRecordar.charAt(posicion)=='0')
            mp1=MediaPlayer.create(getActivity(),R.raw.cero);
        if(numeroRecordar.charAt(posicion)=='1')
            mp1=MediaPlayer.create(getActivity(),R.raw.uno);
        mp1.start();
        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                if (posicion<numeroRecordar.length()-1)
                {
                    emitirSonido(posicion+1);
                }
                else
                    activarBotones();
            }
        });

    }

    private void agregarUnNumeroAlFinal() {
        int ale=(int)(Math.random()*2);
        switch (ale) {
            case 0:
                numeroRecordar = numeroRecordar + "0";
                break;
            case 1:
                numeroRecordar = numeroRecordar + "1";
                break;
        }
    }

    private void controlarSiEsCorrecto() {
        if (numeroJugador.charAt(numeroJugador.length()-1)!=numeroRecordar.charAt(numeroJugador.length()-1))
        {
            Toast.makeText(getActivity(),"Perdiste",Toast.LENGTH_LONG).show();
            desactivarBotones();
        }
        else
        if (numeroJugador.length()==numeroRecordar.length())
        {
            desactivarBotones();
            numeroJugador="";
            agregarUnNumeroAlFinal();
            emitirSonido(0);
            tv1.setText("Cantidad de cifras a recordar:"+numeroRecordar.length());
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mp1!=null)
        {
            mp1.release();
            mp1=null;
        }
    }


}