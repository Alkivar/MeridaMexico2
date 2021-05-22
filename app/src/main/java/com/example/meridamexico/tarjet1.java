package com.example.meridamexico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class tarjet1 extends AppCompatActivity {

    ArrayList<Informacion> listadeDatos1= new ArrayList<>();
    RecyclerView listadoGrafico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarjet1);

        listadoGrafico=findViewById(R.id.listado);
        listadoGrafico.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        crearlista();
        ListaAdaptador adaptador=new ListaAdaptador(listadeDatos1);
        listadoGrafico.setAdapter(adaptador);
    }

    private void crearlista(){

        listadeDatos1.add(new Informacion("Merida Mexico",R.drawable.avatar1, getString(R.string.descripcion1)));
        listadeDatos1.add(new Informacion("Hotel Doralba",R.drawable.avatar2, getString(R.string.descripcion2)));
        listadeDatos1.add(new Informacion("Playa",R.drawable.avatar3, getString(R.string.descripcion3)));
        listadeDatos1.add(new Informacion("Comida",R.drawable.avatar4, getString(R.string.descripcion4)));

    }



}