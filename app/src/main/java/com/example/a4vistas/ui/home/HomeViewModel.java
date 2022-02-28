package com.example.a4vistas.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Bienvenido usuario/a, para poder acceder a los juegos tienes que ir al icono" );
    }

    public LiveData<String> getText() {
        return mText;
    }
}