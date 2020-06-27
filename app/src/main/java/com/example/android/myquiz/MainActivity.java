package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void quiz(View view) {
        RadioButton FACEbook;
        FACEbook = findViewById(R.id.facebook);
        Boolean facebook = FACEbook.isChecked();
        RadioButton WHATSapp;
        WHATSapp = findViewById(R.id.whatsapp);
        Boolean whatsapp = WHATSapp.isChecked();
        RadioButton REd;
        REd =findViewById(R.id.red);
        Boolean red = REd.isChecked();
        RadioButton BLUe;
        BLUe =findViewById(R.id.blue);
        Boolean blue = BLUe.isChecked();
        RadioButton PhAv;
        PhAv =findViewById(R.id.phav);
        Boolean phav = PhAv.isChecked();
        RadioButton ChOle;
        ChOle =findViewById(R.id.chole);
        Boolean chole= ChOle.isChecked();
        RadioButton Dora;
        Dora =findViewById(R.id.doraemon);
        Boolean dora = Dora.isChecked();
        RadioButton Shin;
        Shin =findViewById(R.id.shinchan);
        Boolean shin= Shin.isChecked();
        RadioButton IPhone;
        IPhone =findViewById(R.id.iphone);
        Boolean iphone = IPhone.isChecked();
        RadioButton ONeplus;
        ONeplus =findViewById(R.id.oneplus);
        Boolean oneplus= ONeplus.isChecked();
        EditText text_box = (EditText) findViewById(R.id.edit_text);
        Editable name_box = text_box.getText();

        int points = calculate(score, facebook, whatsapp,red,blue,phav,chole,dora,shin,iphone,oneplus);
        display(points);
        Toast.makeText(this, name_box+" scored "+ points+" out of 5", Toast.LENGTH_SHORT).show();

    }

    public int calculate(int score, boolean facebook, boolean whatsapp,boolean red, boolean blue, boolean phav, boolean chole,boolean dora, boolean shin,boolean iphone, boolean oneplus)
    {
        { if (whatsapp){
            score=score+ 1;
        }
        else if (facebook){
            score=score;
        }
        }{
        if (blue){
            score=score+1;
        }
        else if (red){
            score=score;

        }}
        {
            if (phav){
                score=score+1;
            }
            else if (chole){
                score=score;
                }
        }
        { if (shin){
            score=score+ 1;
        }
        else if (dora){
            score=score;
        }
        }
        { if (iphone){
            score=score+ 1;
        }
        else if (oneplus){
            score=score;
        }
        }
        return score;
    }
    private void display ( int score){
        TextView My_score = findViewById(R.id.My_score);
        My_score.setText("Final score: " + score);

    }

}