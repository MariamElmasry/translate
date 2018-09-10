package com.example.mariam.translate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the view that shows the number category
        TextView numbers = (TextView)findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // create new intent to open numbers category
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                    Toast.makeText(view.getContext(), "Open the list of Numbers " ,Toast.LENGTH_SHORT).show();


                startActivity(numbersIntent);
            }

        });
        TextView familyMembers =(TextView)findViewById(R.id.family);

        familyMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Family.class);
                Toast.makeText(view.getContext(),"Open the list of Family Members", Toast.LENGTH_SHORT).show();
                startActivity(familyIntent);
            }
        });

        TextView phrases = (TextView)findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Phrases.class);
                Toast.makeText(view.getContext(), "Open the list of Phrases", Toast.LENGTH_SHORT).show();

                startActivity(phrasesIntent);
            }
        });

        TextView colors = (TextView)findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Colors.class);
                Toast.makeText(view.getContext(), "Open the list of Colors", Toast.LENGTH_SHORT).show();

                startActivity(colorsIntent);
            }
        });


    }


}
