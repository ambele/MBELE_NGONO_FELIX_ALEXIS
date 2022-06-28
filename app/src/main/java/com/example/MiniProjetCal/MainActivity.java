package com.example.MiniProjetCal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
     EditText saisie;
     Button ac;
     Button zero,un,deux,trois, quatre, cinq, six,sept,huit,neuf,point;
     Button addition, soustraction, multiplication, division,egale;

     float valeur1, valeur2;

    boolean siAddition, siSoustraction, siMultiplication, siDivision;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saisie = (EditText) findViewById(R.id.saisie);
        ac = (Button) findViewById(R.id.ac);
        zero = (Button) findViewById(R.id.zero);
        un = (Button) findViewById(R.id.un);
        deux = (Button) findViewById(R.id.deux);
        trois = (Button) findViewById(R.id.trois);
        quatre = (Button) findViewById(R.id.quatre);
        cinq = (Button) findViewById(R.id.cinq);
        six = (Button) findViewById(R.id.six);
        sept = (Button) findViewById(R.id.sept);
        huit = (Button) findViewById(R.id.huit);
        neuf = (Button) findViewById(R.id.neuf);
        point = (Button) findViewById(R.id.point);
        addition = (Button) findViewById(R.id.addition);
        soustraction = (Button) findViewById(R.id.soustraction);
        multiplication= (Button) findViewById(R.id.multiplication);
        division= (Button) findViewById(R.id.division);
        egale = (Button) findViewById(R.id.egale);
        addition = (Button) findViewById(R.id.addition);
        addition = (Button) findViewById(R.id.addition);

        String regex = "^\\d+(\\.\\d+)*$";
        Pattern p = Pattern.compile(regex);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "0");
            }
        });

        un.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "1");
            }
        });

        deux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "2");
            }
        });

        trois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "3");
            }
        });

        quatre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "4");
            }
        });

        cinq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "6");

            }
        });

        sept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "7");
            }
        });

        huit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "8");
            }
        });

        neuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saisie.setText(saisie.getText() + "9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {saisie.setText(saisie.getText() + ".");}
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matcher m = p.matcher(saisie.getText().toString());
                if(saisie.getText().toString() == "."){
                    saisie.setText("");
                }
                if (saisie == null) {
                    saisie.setText("");
                } else {
                    if(m.matches()) {
                        valeur1 = Float.parseFloat(saisie.getText() + "");
                        siAddition = true;
                        saisie.setText(null);
                    }
                }
            }
        });

        soustraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matcher m = p.matcher(saisie.getText().toString());
                if(saisie.getText().toString() == "."){
                    saisie.setText("");
                }
                if (saisie == null) {
                    saisie.setText("");
                } else {
                     if(m.matches()){
                    valeur1 = Float.parseFloat(saisie.getText() + "");
                    siSoustraction = true;
                    saisie.setText(null);
                     }
                }
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matcher m = p.matcher(saisie.getText().toString());
                if(saisie.getText().toString() == "."){
                    saisie.setText("");
                }
                if (saisie == null) {
                    saisie.setText("");
                } else {
                    if(m.matches()){
                    valeur1 = Float.parseFloat(saisie.getText() + "");
                    siMultiplication = true;
                    saisie.setText(null);
                    }
                }
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Matcher m = p.matcher(saisie.getText().toString());
                if(saisie.getText().toString() == "."){
                    saisie.setText("");
                }
                if (saisie == null) {
                    saisie.setText("");
                } else {
                    if(m.matches()){
                    valeur1 = Float.parseFloat(saisie.getText() + "");
                    siDivision = true;
                    saisie.setText(null);
                    }
                }
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              reInitialiser();
            }
        });

        egale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {valeur2 = Float.parseFloat(saisie.getText() + "");
                if(saisie.getText().toString() == "."){
                    saisie.setText("");
                }
                if (saisie == null) {
                    saisie.setText("");
                }

                if (siAddition) {
                    saisie.setText(valeur1 + valeur2 + "");
                    siAddition = false;
                }

                if (siSoustraction) {
                    saisie.setText(valeur1 - valeur2 + "");
                    siSoustraction = false;
                }

                if (siMultiplication) {
                   saisie.setText(valeur1 * valeur2 + "");
                    siMultiplication = false;
                }

                if (siDivision) {
                    if(valeur2!=0) {
                        saisie.setText(valeur1 / valeur2 + "");
                        siDivision = false;
                    }
                    else{
                        saisie.setText("NaN");

                    }

                }
            }
        });

    }
    private boolean isEmpty(EditText etText) {
        if (etText.getText().toString().trim().length() > 0)
            return false;

        return true;
    }


    public void saisietouche(String touche) {
        saisie.setText(saisie.getText().toString()+touche);
    }

    public void reInitialiser() {
        saisie.setText("");

    }










}