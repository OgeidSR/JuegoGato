package com.example.equipo.juegogato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int turno,contador;
    EditText ganador;
    Button boton_1,boton_2,boton_3,boton_4,boton_5,boton_6,boton_7,boton_8,boton_9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);

        //Tomo mis referencias
        boton_1=(Button)(findViewById(R.id.boton_1));
        boton_2=(Button)(findViewById(R.id.boton_2));
        boton_3=(Button)(findViewById(R.id.boton_3));
        boton_4=(Button)(findViewById(R.id.boton_4));
        boton_5=(Button)(findViewById(R.id.boton_5));
        boton_6=(Button)(findViewById(R.id.boton_6));
        boton_7=(Button)(findViewById(R.id.boton_7));
        boton_8=(Button)(findViewById(R.id.boton_8));
        boton_9=(Button)(findViewById(R.id.boton_9));
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


    }

    @Override
    public void onClick(View v) {

        //Primer Jugador
        contador++;
        turno=contador%2;
        if(turno==1){
            mostrarXO('x',v);
        }
        //Segundo Jugador
        else{
            mostrarXO('o',v);
        }

    }//Final del OnClick


    //Aqui creamos la funcion con la cual vamos a alternar entre un jugador y otro bloqueando loos botones anteriores

    public void mostrarXO(char letra, View v){

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

        else{
            boton_9.setText(letra + "");
            boton_9.setEnabled(false);
        }


    }
}
