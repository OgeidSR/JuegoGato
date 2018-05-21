package com.example.equipo.juegogato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,cont,conta=0;
    String letra;
    EditText ganador;
    Button boton_1,boton_2,boton_3,boton_4,boton_5,boton_6,boton_7,boton_8,boton_9,volver_jugar,salir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        //Tomo mis referencias
        ganador=(EditText)findViewById(R.id.ganador);
        boton_1=(Button)(findViewById(R.id.boton_1));
        boton_2=(Button)(findViewById(R.id.boton_2));
        boton_3=(Button)(findViewById(R.id.boton_3));
        boton_4=(Button)(findViewById(R.id.boton_4));
        boton_5=(Button)(findViewById(R.id.boton_5));
        boton_6=(Button)(findViewById(R.id.boton_6));
        boton_7=(Button)(findViewById(R.id.boton_7));
        boton_8=(Button)(findViewById(R.id.boton_8));
        boton_9=(Button)(findViewById(R.id.boton_9));
        volver_jugar=(Button)(findViewById(R.id.volver_jugar));
        salir=(Button)(findViewById(R.id.salir));
        //Asignamos el OnClick en cada Boton
        boton_1.setOnClickListener(this);
        boton_2.setOnClickListener(this);
        boton_3.setOnClickListener(this);
        boton_4.setOnClickListener(this);
        boton_5.setOnClickListener(this);
        boton_6.setOnClickListener(this);
        boton_7.setOnClickListener(this);
        boton_8.setOnClickListener(this);
        boton_9.setOnClickListener(this);
        volver_jugar.setOnClickListener(this);
        salir.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        //Primer Jugador
        cont++;
        turno=cont%2;
        if(turno==1){
            mostrarXO('X',v);
        }
        //Segundo Jugador
        else{
            mostrarXO('O',v);
        }

    }//Final del OnClick




    public void mostrarXO(char letra, View v){
//Aqui hacemos que el boton de volver   a jugar active y limpie los 9 botones del juego
        if(v.getId()==R.id.volver_jugar){
            ganador.setEnabled(true);
            ganador.setText(" ");

            boton_1.setEnabled(true);
            boton_1.setText(" ");

            boton_2.setEnabled(true);
            boton_2.setText(" ");

            boton_3.setEnabled(true);
            boton_3.setText(" ");

            boton_4.setEnabled(true);
            boton_4.setText(" ");

            boton_5.setEnabled(true);
            boton_5.setText(" ");

            boton_6.setEnabled(true);
            boton_6.setText(" ");

            boton_7.setEnabled(true);
            boton_7.setText(" ");

            boton_8.setEnabled(true);
            boton_8.setText(" ");

            boton_9.setEnabled(true);
            boton_9.setText(" ");

        }
//Hacemos que el Btoton de salir nos sque de la aplicacion
        if(v.getId()==R.id.salir){
            System.exit(0);
        }

//Aqui creamos la funcion con la cual vamos a alternar entre un jugador y otro, bloqueando loos botones anteriores
        if(v.getId()==R.id.boton_1){
            boton_1.setText(letra+"");//El "" Es para que lo lea como toda una cadena de caracteres
            boton_1.setEnabled(false);//Esto es para que ese boton no pueda volver a imprimirse
        }
        else if (v.getId()==R.id.boton_2) {
            boton_2.setText(letra + "");
            boton_2.setEnabled(false);
        }
        else if (v.getId()==R.id.boton_3) {
            boton_3.setText(letra + "");
            boton_3.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_4) {
            boton_4.setText(letra + "");
            boton_4.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_5) {
            boton_5.setText(letra + "");
            boton_5.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_6) {
            boton_6.setText(letra + "");
            boton_6.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_7) {
            boton_7.setText(letra + "");
            boton_7.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_8) {
            boton_8.setText(letra + "");
            boton_8.setEnabled(false);
        }

        else if (v.getId()==R.id.boton_9) {
            boton_9.setText(letra + "");
            boton_9.setEnabled(false);
        }

        Ganador(letra);


    }//Final del mostrar XO

    //Comparamos todos los botones de forma horizontal, vertical y diagonal para corroborar quien es el ganador si la letra es la misma
    public void Ganador(char letra){
        //Horizontal
        if(boton_1.getText().toString().equals(letra+"") && (boton_2.getText().toString().equals(letra+"")) && (boton_3.getText().toString().equals(letra+""))){
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);//Se desactiva el Edit Text cuando nos dice el ganador
            boton_4.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_5.setEnabled(false);
            boton_6.setEnabled(false);
            boton_7.setEnabled(false);
            boton_8.setEnabled(false);
            boton_9.setEnabled(false);
        }
        else if(boton_4.getText().toString().equals(letra+"") && (boton_5.getText().toString().equals(letra+"")) && (boton_6.getText().toString().equals(letra+""))){
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_1.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_3.setEnabled(false);
            boton_7.setEnabled(false);
            boton_8.setEnabled(false);
            boton_9.setEnabled(false);
        }
        else if(boton_7.getText().toString().equals(letra+"") && (boton_8.getText().toString().equals(letra+"")) && (boton_9.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_1.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_3.setEnabled(false);
            boton_4.setEnabled(false);
            boton_5.setEnabled(false);
            boton_6.setEnabled(false);
        }
        //Vertical
        else if(boton_1.getText().toString().equals(letra+"") && (boton_4.getText().toString().equals(letra+"")) && (boton_7.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_8.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_3.setEnabled(false);
            boton_9.setEnabled(false);
            boton_5.setEnabled(false);
            boton_6.setEnabled(false);
        }
        else if(boton_2.getText().toString().equals(letra+"") && (boton_5.getText().toString().equals(letra+"")) && (boton_8.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_1.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_9.setEnabled(false);
            boton_3.setEnabled(false);
            boton_4.setEnabled(false);
            boton_7.setEnabled(false);
            boton_6.setEnabled(false);
        }
        else if(boton_3.getText().toString().equals(letra+"") && (boton_6.getText().toString().equals(letra+"")) && (boton_9.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_1.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_7.setEnabled(false);
            boton_4.setEnabled(false);
            boton_5.setEnabled(false);
            boton_8.setEnabled(false);
        }
        //Diagonal
        else if(boton_1.getText().toString().equals(letra+"") && (boton_5.getText().toString().equals(letra+"")) && (boton_9.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_6.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_7.setEnabled(false);
            boton_4.setEnabled(false);
            boton_3.setEnabled(false);
            boton_8.setEnabled(false);
        }
        else if(boton_3.getText().toString().equals(letra+"") && (boton_5.getText().toString().equals(letra+"")) && (boton_7.getText().toString().equals(letra+""))) {
            ganador.setText("Ganador: "+letra);
            ganador.setEnabled(false);
            boton_1.setEnabled(false);//Desactivamos los botones por que solo estamos comparando los 3 primeros y no se pueda seguir jugando
            boton_2.setEnabled(false);
            boton_9.setEnabled(false);
            boton_4.setEnabled(false);
            boton_6.setEnabled(false);
            boton_8.setEnabled(false);
        }
        else if(conta<9) {
            conta++;
        }
        else {
            ganador.setText("EMPATE");
        }

    }//Fin del metodo Ganador

}//Fin del clase Activity
