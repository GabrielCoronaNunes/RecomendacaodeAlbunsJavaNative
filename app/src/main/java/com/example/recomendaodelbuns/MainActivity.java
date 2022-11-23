package com.example.recomendaodelbuns;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.recomendaodelbuns.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView imageView;
    public Button buttonRock;
    public Button buttonRap;
    public Button buttonMpb;
    public TextView texto;

    //IMAGENS

    Integer[] imagensRock = {
            R.drawable.imagem1,
            R.drawable.imagem2,
            R.drawable.imagem3,
            R.drawable.imagem4,
            R.drawable.imagem5,
            R.drawable.imagem6,
            R.drawable.imagem7,
            R.drawable.imagem8,
            R.drawable.imagem9,
            R.drawable.imagem10

    };

    Integer[] imagensRap = {
            R.drawable.imagem11,
            R.drawable.imagem12,
            R.drawable.imagem13,
            R.drawable.imagem14,
            R.drawable.imagem15,
            R.drawable.imagem16,
            R.drawable.imagem17,
            R.drawable.imagem18,
            R.drawable.imagem19,
            R.drawable.imagem20
    };

    Integer[] imagensMpb = {
            R.drawable.imagem21,
            R.drawable.imagem22,
            R.drawable.imagem23,
            R.drawable.imagem24,
            R.drawable.imagem25,
            R.drawable.imagem26,
            R.drawable.imagem27,
            R.drawable.imagem28,
            R.drawable.imagem29,
            R.drawable.imagem30,

    };

    //NOMES

    String[] textosRock = {
            "Yes - Close to The Edge, 1972",
            "America - Homecoming, 1972",
            "The Who - Live At The Isle of Wight Festival, 1970",
            "Dust - Hard Attack, 1972",
            "Frank Zappa - Hot Rats, 1969",
            "Aphrodite Child's - 666, 1972",
            "Jesus Christ Superstar, 1970 ",
            "Beatles - The Beatles, 1968",
            "Colour Haze - Tempel, 2006",
            "Erasmo Carlos - Carlos, ERASMO..., 1972, 1971"
    };

    String[] textosRap = {
            "Public Enemy - It Takes a Nation of Millions to Hold Us Back, 1988",
            "A Tribe Called Quest - We Got It from Here... Thank You 4 Your Service, 2016",
            "Mano Brown - Boogie Naipe, 2016",
            "Racionais Mc's - Sobrevivendo no Inferno, 1997",
            "Gangasta Pat - Deadly Verses, 1995",
            "Czarface Meets Metal Face, 2018",
            "King Geedorah - Take Me to Your Leader, 2003",
            "Kanye West - Jesus is King, 2019",
            "Instituto - Violar, 2015",
            "N.E.R.D - No_One Ever Really Dies, 2017"
    };

    String[] textosMpb = {
            "Jorge Ben Jor - Solta o Pavão, 1975",
            "Marcos Valle - Previsão do Tempo, 1973",
            "Luiz Henrique - Mestiço, 1976",
            "Fernanda Abreu - Sla Radical Dance Disco Club, 1990",
            "Jorge Mautner - Árvore da Vida, 1988",
            "Emílio Santiago - Emílio Santiago, 1975",
            "Paulinho Pedra Azul - Uma Janela Dentro dos Meus Olhos, 1986",
            "Itamar Assumpção - Vol III, 1993",
            "Arrigo Barnabé - Clara Crocodilo, 1980",
            "Zeca do Trambone e Roberto Sax -  Zeca Do Trombone & Roberto Sax, 1976"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView4);
        buttonRock = findViewById(R.id.button2);
        buttonRap = findViewById(R.id.button3);
        buttonMpb = findViewById(R.id.button);
        texto = findViewById(R.id.textView4);
        int min = 0;
        int max = 9;


        buttonRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random r = new Random();
                int i1 = r.nextInt(max - min + 1) + min;
                imageView.setImageResource(imagensRock[i1]);
                texto.setText(textosRock[i1]);

            }
        });

        buttonRap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Random r = new Random();
                int i1 = r.nextInt(max - min + 1) + min;
                imageView.setImageResource(imagensRap[i1]);
                texto.setText(textosRap[i1]);

            }
        });

        buttonMpb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                int i1 = r.nextInt(max - min + 1) + min;
                imageView.setImageResource(imagensMpb[i1]);
                texto.setText(textosMpb[i1]);

            }
        });


    }


}