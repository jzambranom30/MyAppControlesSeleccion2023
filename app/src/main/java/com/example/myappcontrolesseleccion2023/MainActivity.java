package com.example.myappcontrolesseleccion2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Datos
        final String[] datos = new String[]{"--------","Element 2","Element 3","Element 4"};

        final String[] datos2 = new String[]{"--------","Melanie","Lisset","Wilson","Moises"};

        //Adaptador
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, datos);

        ArrayAdapter<String> adaptador2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, datos2);

        //Asignar el Adaptador a la Vista(Spinner)
        Spinner cmbOpciones = (Spinner) findViewById(R.id.cbListaOp);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        Spinner cmbOpciones2 = (Spinner) findViewById(R.id.cbListaOp);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones2.setAdapter(adaptador);
        cmbOpciones2.setOnItemSelectedListener(this);

        ListView lstOpciones = (ListView) findViewById(R.id.lwItems);
        lstOpciones.setAdapter(adaptador2);
        lstOpciones.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem = (TextView)findViewById(R.id.twMostrarEvento);
        txtItem.setText("Seleccionado: " + parent.getItemAtPosition(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem = (TextView)findViewById(R.id.twMostrarEvento);
        txtItem.setText("Clic en ListView: " + parent.getItemAtPosition(position));
    }
}