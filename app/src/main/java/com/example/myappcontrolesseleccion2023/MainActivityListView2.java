package com.example.myappcontrolesseleccion2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivityListView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list_view2);

        AdaptadorNoticia adaptadorNoticia = new AdaptadorNoticia(this, noticias);
    }

    public Noticia[] noticias = new Noticia[]{
            new Noticia("Noticia 1","Subnoticia Contenido Contenido Contenido Contenido Contenido 1"),
            new Noticia("Noticia 2","Subnoticia Contenido Contenido Contenido Contenido Contenido 2"),
            new Noticia("Noticia 3","Subnoticia Contenido Contenido Contenido Contenido Contenido 3"),
            new Noticia("Noticia 4","Subnoticia Contenido Contenido Contenido Contenido Contenido 4"),
    };
}