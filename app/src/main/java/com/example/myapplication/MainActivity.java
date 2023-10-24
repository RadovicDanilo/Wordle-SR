package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity
{
    final String dictionaryPath = "dictionary.txt";
    String[] azbuka = { "Љ","Њ","Е","Р","Т","З","У","И","О","П","А","С","Д","Ф","Г","Х","Ј","К","Л","Ч","Џ","Ц","В", "Б", "Н", "М", "Ћ", "Ђ", "Ш", "Ж"};
    String[][] words = new String[6][5];
    String solution;
    int currentWord = 0;
    int currentLetter = 0;
    List<TextView> wordsTextView = new ArrayList<>();
    List<TextView> wordsTextViewEnd = new ArrayList<>();
    List<Button> keyboard = new ArrayList<>();

    public boolean isInDictionary(String word){
        String filename = "dictionary.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.getAssets().open(filename), StandardCharsets.UTF_8));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(word))
                    return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    AlertDialog.Builder dialogBuilder;
    AlertDialog alertDialog;
    Button btRestart;
    TextView tvResenje;

    @SuppressLint("SetTextI18n")
    public void end(){

        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.popup,null);
        dialogBuilder.setView(contactPopupView);
        alertDialog = dialogBuilder.create();
        alertDialog.show();

        tvResenje = contactPopupView.findViewById(R.id.Resenje);
        tvResenje.setText("Тачна реч је: "+ solution);

        TextView textView1 = (TextView) contactPopupView.findViewById(R.id.textView31);
        TextView textView2 = (TextView) contactPopupView.findViewById(R.id.textView32);
        TextView textView3 = (TextView) contactPopupView.findViewById(R.id.textView33);
        TextView textView4 = (TextView) contactPopupView.findViewById(R.id.textView34);
        TextView textView5 = (TextView) contactPopupView.findViewById(R.id.textView35);
        TextView textView6 = (TextView) contactPopupView.findViewById(R.id.textView36);
        TextView textView7 = (TextView) contactPopupView.findViewById(R.id.textView37);
        TextView textView8 = (TextView) contactPopupView.findViewById(R.id.textView38);
        TextView textView9 = (TextView) contactPopupView.findViewById(R.id.textView39);
        TextView textView10 = (TextView) contactPopupView.findViewById(R.id.textView40);
        TextView textView11 = (TextView) contactPopupView.findViewById(R.id.textView41);
        TextView textView12 = (TextView) contactPopupView.findViewById(R.id.textView42);
        TextView textView13 = (TextView) contactPopupView.findViewById(R.id.textView43);
        TextView textView14 = (TextView) contactPopupView.findViewById(R.id.textView44);
        TextView textView15 = (TextView) contactPopupView.findViewById(R.id.textView45);
        TextView textView16 = (TextView) contactPopupView.findViewById(R.id.textView46);
        TextView textView17 = (TextView) contactPopupView.findViewById(R.id.textView47);
        TextView textView18 = (TextView) contactPopupView.findViewById(R.id.textView48);
        TextView textView19 = (TextView) contactPopupView.findViewById(R.id.textView49);
        TextView textView20 = (TextView) contactPopupView.findViewById(R.id.textView50);
        TextView textView21 = (TextView) contactPopupView.findViewById(R.id.textView51);
        TextView textView22 = (TextView) contactPopupView.findViewById(R.id.textView52);
        TextView textView23 = (TextView) contactPopupView.findViewById(R.id.textView53);
        TextView textView24 = (TextView) contactPopupView.findViewById(R.id.textView54);
        TextView textView25 = (TextView) contactPopupView.findViewById(R.id.textView55);
        TextView textView26 = (TextView) contactPopupView.findViewById(R.id.textView56);
        TextView textView27 = (TextView) contactPopupView.findViewById(R.id.textView57);
        TextView textView28 = (TextView) contactPopupView.findViewById(R.id.textView58);
        TextView textView29 = (TextView) contactPopupView.findViewById(R.id.textView59);
        TextView textView30 = (TextView) contactPopupView.findViewById(R.id.textView60);
        wordsTextViewEnd.add(textView1);
        wordsTextViewEnd.add(textView2);
        wordsTextViewEnd.add(textView3);
        wordsTextViewEnd.add(textView4);
        wordsTextViewEnd.add(textView5);
        wordsTextViewEnd.add(textView6);
        wordsTextViewEnd.add(textView7);
        wordsTextViewEnd.add(textView8);
        wordsTextViewEnd.add(textView9);
        wordsTextViewEnd.add(textView10);
        wordsTextViewEnd.add(textView11);
        wordsTextViewEnd.add(textView12);
        wordsTextViewEnd.add(textView13);
        wordsTextViewEnd.add(textView14);
        wordsTextViewEnd.add(textView15);
        wordsTextViewEnd.add(textView16);
        wordsTextViewEnd.add(textView17);
        wordsTextViewEnd.add(textView18);
        wordsTextViewEnd.add(textView19);
        wordsTextViewEnd.add(textView20);
        wordsTextViewEnd.add(textView21);
        wordsTextViewEnd.add(textView22);
        wordsTextViewEnd.add(textView23);
        wordsTextViewEnd.add(textView24);
        wordsTextViewEnd.add(textView25);
        wordsTextViewEnd.add(textView26);
        wordsTextViewEnd.add(textView27);
        wordsTextViewEnd.add(textView28);
        wordsTextViewEnd.add(textView29);
        wordsTextViewEnd.add(textView30);
        for(int i = 0; i < 30; i++){
            wordsTextViewEnd.get(i).setBackground(wordsTextView.get(i).getBackground());
        }
        btRestart = (Button) contactPopupView.findViewById(R.id.Restart);
        btRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
            }
        });
    }
    public AlertDialog.Builder dialogBuilder1;
    public  AlertDialog dialog1;
    public void help(){
        dialogBuilder1 = new AlertDialog.Builder(this);
        final View contactPopupView1= getLayoutInflater().inflate(R.layout.help,null);
        ImageButton imageButtonHelp= contactPopupView1.findViewById(R.id.imageButtonH);
        dialogBuilder1.setView(contactPopupView1);
        dialog1 = dialogBuilder1.create();
        dialog1.show();
        imageButtonHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vH) {
                dialog1.dismiss();
            }
        });
    }
    public void initialise(){
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader2 = new BufferedReader(new InputStreamReader(this.getAssets().open(dictionaryPath), StandardCharsets.UTF_8));
            String line = null;
            int wordIndex = new Random().nextInt(18296) + 1;
            for(int i = 0; i<wordIndex; i++){
                line = bufferedReader2.readLine();
            }
            solution=line;
            for(int j = 0; j<5;j++){
                words[6][j]= line.substring(j,j+1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Button button1 = (Button)findViewById(R.id.button1);

        Button button2 = (Button)findViewById(R.id.button2);

        Button button3 = (Button)findViewById(R.id.button3);

        Button button4 = (Button)findViewById(R.id.button4);

        Button button5 = (Button)findViewById(R.id.button5);

        Button button6 = (Button)findViewById(R.id.button6);

        Button button7 = (Button)findViewById(R.id.button7);

        Button button8 = (Button)findViewById(R.id.button8);

        Button button9 = (Button)findViewById(R.id.button9);

        Button button10 = (Button)findViewById(R.id.button10);

        Button button11 = (Button)findViewById(R.id.button11);

        Button button12 = (Button)findViewById(R.id.button12);

        Button button13 = (Button)findViewById(R.id.button13);

        Button button14 = (Button)findViewById(R.id.button14);

        Button button15 = (Button)findViewById(R.id.button15);

        Button button16 = (Button)findViewById(R.id.button16);

        Button button17 = (Button)findViewById(R.id.button17);

        Button button18 = (Button)findViewById(R.id.button18);

        Button button19 = (Button)findViewById(R.id.button19);

        Button button20 = (Button)findViewById(R.id.button20);

        Button button21 = (Button)findViewById(R.id.button21);

        Button button22 = (Button)findViewById(R.id.button22);

        Button button23 = (Button)findViewById(R.id.button23);

        Button button24 = (Button)findViewById(R.id.button24);

        Button button25 = (Button)findViewById(R.id.button25);

        Button button26 = (Button)findViewById(R.id.button26);

        Button button27 = (Button)findViewById(R.id.button27);

        Button button28 = (Button)findViewById(R.id.button28);

        Button button29 = (Button)findViewById(R.id.button29);

        Button button30 = (Button)findViewById(R.id.button30);

        keyboard.add(button1);
        keyboard.add(button2);
        keyboard.add(button3);
        keyboard.add(button4);
        keyboard.add(button5);
        keyboard.add(button6);
        keyboard.add(button7);
        keyboard.add(button8);
        keyboard.add(button9);
        keyboard.add(button10);
        keyboard.add(button11);
        keyboard.add(button12);
        keyboard.add(button13);
        keyboard.add(button14);
        keyboard.add(button15);
        keyboard.add(button16);
        keyboard.add(button17);
        keyboard.add(button18);
        keyboard.add(button19);
        keyboard.add(button20);
        keyboard.add(button21);
        keyboard.add(button22);
        keyboard.add(button23);
        keyboard.add(button24);
        keyboard.add(button25);
        keyboard.add(button26);
        keyboard.add(button27);
        keyboard.add(button28);
        keyboard.add(button29);
        keyboard.add(button30);

        for(Button bt: keyboard){
            bt.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v30)
                {
                    EnterWord(29);
                    refreshUI();
                }
            });
        }

        TextView tvTable1 = (TextView) findViewById(R.id.textView31);
        TextView tvTable2 = (TextView) findViewById(R.id.textView32);
        TextView tvTable3 = (TextView) findViewById(R.id.textView33);
        TextView tvTable4 = (TextView) findViewById(R.id.textView34);
        TextView tvTable5 = (TextView) findViewById(R.id.textView35);
        TextView tvTable6 = (TextView) findViewById(R.id.textView36);
        TextView tvTable7 = (TextView) findViewById(R.id.textView37);
        TextView tvTable8 = (TextView) findViewById(R.id.textView38);
        TextView tvTable9 = (TextView) findViewById(R.id.textView39);
        TextView tvTable10 = (TextView) findViewById(R.id.textView40);
        TextView tvTable11 = (TextView) findViewById(R.id.textView41);
        TextView tvTable12 = (TextView) findViewById(R.id.textView42);
        TextView tvTable13= (TextView) findViewById(R.id.textView43);
        TextView tvTable14 = (TextView) findViewById(R.id.textView44);
        TextView tvTable15 = (TextView) findViewById(R.id.textView45);
        TextView tvTable16 = (TextView) findViewById(R.id.textView46);
        TextView tvTable17 = (TextView) findViewById(R.id.textView47);
        TextView tvTable18 = (TextView) findViewById(R.id.textView48);
        TextView tvTable19 = (TextView) findViewById(R.id.textView49);
        TextView tvTable20 = (TextView) findViewById(R.id.textView50);
        TextView tvTable21 = (TextView) findViewById(R.id.textView51);
        TextView tvTable22 = (TextView) findViewById(R.id.textView52);
        TextView tvTable23 = (TextView) findViewById(R.id.textView53);
        TextView tvTable24 = (TextView) findViewById(R.id.textView54);
        TextView tvTable25 = (TextView) findViewById(R.id.textView55);
        TextView tvTable26 = (TextView) findViewById(R.id.textView56);
        TextView tvTable27 = (TextView) findViewById(R.id.textView57);
        TextView tvTable28 = (TextView) findViewById(R.id.textView58);
        TextView tvTable29 = (TextView) findViewById(R.id.textView59);
        TextView tvTable30 = (TextView) findViewById(R.id.textView60);

        wordsTextView.add(tvTable1);
        wordsTextView.add(tvTable2);
        wordsTextView.add(tvTable3);
        wordsTextView.add(tvTable4);
        wordsTextView.add(tvTable5);
        wordsTextView.add(tvTable6);
        wordsTextView.add(tvTable7);
        wordsTextView.add(tvTable8);
        wordsTextView.add(tvTable9);
        wordsTextView.add(tvTable10);
        wordsTextView.add(tvTable11);
        wordsTextView.add(tvTable12);
        wordsTextView.add(tvTable13);
        wordsTextView.add(tvTable14);
        wordsTextView.add(tvTable15);
        wordsTextView.add(tvTable16);
        wordsTextView.add(tvTable17);
        wordsTextView.add(tvTable18);
        wordsTextView.add(tvTable19);
        wordsTextView.add(tvTable20);
        wordsTextView.add(tvTable21);
        wordsTextView.add(tvTable22);
        wordsTextView.add(tvTable23);
        wordsTextView.add(tvTable24);
        wordsTextView.add(tvTable25);
        wordsTextView.add(tvTable26);
        wordsTextView.add(tvTable27);
        wordsTextView.add(tvTable28);
        wordsTextView.add(tvTable29);
        wordsTextView.add(tvTable30);
    }
    public void refreshUI() {
        for(int i = 0; i < 5;  i++){
            for(int j = 0; j < 5;  j++){
                wordsTextView.get(5*i+j).setText(words[i][j]);
            }
        }
    }
    public void EnterWord(int n){
        if (currentLetter<5){
            words[currentWord][currentLetter] = azbuka[n];
            currentLetter++;
        }
    }
    public static int ZELENO=Color.parseColor("#00FF00");
    public static int ZUTO=Color.parseColor("#B58B00");
    public static int CRVENO =Color.parseColor("#953553");
    public void PROMENAboje(int f,int BOJA) {//daje boju poljima na osnovu ukacenog slova
        if (brojReci == 1) {
            if (f == 0) {
                TextView textView1 = (TextView) findViewById(R.id.textView31);
                textView1.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView2 = (TextView) findViewById(R.id.textView32);
                textView2.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView3 = (TextView) findViewById(R.id.textView33);
                textView3.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView4 = (TextView) findViewById(R.id.textView34);
                textView4.setBackgroundColor(BOJA);
            } else if (f == 4) {
                TextView textView5 = (TextView) findViewById(R.id.textView35);
                textView5.setBackgroundColor(BOJA);
            }
        } else if (brojReci == 2) {
            if (f == 0) {
                TextView textView6 = (TextView) findViewById(R.id.textView36);
                textView6.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView7 = (TextView) findViewById(R.id.textView37);
                textView7.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView8 = (TextView) findViewById(R.id.textView38);
                textView8.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView9 = (TextView) findViewById(R.id.textView39);
                textView9.setBackgroundColor(BOJA);
            } else {
                TextView textView10 = (TextView) findViewById(R.id.textView40);
                textView10.setBackgroundColor(BOJA);
            }
        } else if (brojReci == 3) {
            if (f == 0) {
                TextView textView11 = (TextView) findViewById(R.id.textView41);
                textView11.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView12 = (TextView) findViewById(R.id.textView42);
                textView12.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView13 = (TextView) findViewById(R.id.textView43);
                textView13.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView14 = (TextView) findViewById(R.id.textView44);
                textView14.setBackgroundColor(BOJA);
            } else {
                TextView textView15 = (TextView) findViewById(R.id.textView45);
                textView15.setBackgroundColor(BOJA);
            }
        } else if (brojReci == 4) {
            if (f == 0) {
                TextView textView16 = (TextView) findViewById(R.id.textView46);
                textView16.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView17 = (TextView) findViewById(R.id.textView47);
                textView17.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView18 = (TextView) findViewById(R.id.textView48);
                textView18.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView19 = (TextView) findViewById(R.id.textView49);
                textView19.setBackgroundColor(BOJA);
            } else {
                TextView textView20 = (TextView) findViewById(R.id.textView50);
                textView20.setBackgroundColor(BOJA);
            }
        } else if (brojReci == 5) {
            if (f == 0) {
                TextView textView21 = (TextView) findViewById(R.id.textView51);
                textView21.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView22 = (TextView) findViewById(R.id.textView52);
                textView22.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView23 = (TextView) findViewById(R.id.textView53);
                textView23.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView24 = (TextView) findViewById(R.id.textView54);
                textView24.setBackgroundColor(BOJA);
            } else {
                TextView textView25 = (TextView) findViewById(R.id.textView55);
                textView25.setBackgroundColor(BOJA);
            }
        } else if (brojReci == 6) {
            if (f == 0) {
                TextView textView26 = (TextView) findViewById(R.id.textView56);
                textView26.setBackgroundColor(BOJA);
            } else if (f == 1) {
                TextView textView27 = (TextView) findViewById(R.id.textView57);
                textView27.setBackgroundColor(BOJA);
            } else if (f == 2) {
                TextView textView28 = (TextView) findViewById(R.id.textView58);
                textView28.setBackgroundColor(BOJA);
            } else if (f == 3) {
                TextView textView29 = (TextView) findViewById(R.id.textView59);
                textView29.setBackgroundColor(BOJA);
            } else {
                TextView textView30 = (TextView) findViewById(R.id.textView60);
                textView30.setBackgroundColor(BOJA);
            }
        }
    }
    //0    CRVENO ILI NE OBOJENO
    //1    ZUTO
    //2    ZELENO
    public int[] nizBoja = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

    public void promenaBojeTastature(int BOJA, int brojSlova){
        if(brojSlova==1)
        {
            Button button1 = (Button) findViewById(R.id.button1);
            button1.setBackgroundColor(BOJA);
        }
        if(brojSlova==2)
        {
            Button button2 = (Button) findViewById(R.id.button2);
            button2.setBackgroundColor(BOJA);
        }
        if(brojSlova==3)
        {
            Button button3 = (Button) findViewById(R.id.button3);
            button3.setBackgroundColor(BOJA);
        }
        if(brojSlova==4)
        {
            Button button4 = (Button) findViewById(R.id.button4);
            button4.setBackgroundColor(BOJA);
        }
        if(brojSlova==5)
        {
            Button button5 = (Button) findViewById(R.id.button5);
            button5.setBackgroundColor(BOJA);
        }
        if(brojSlova==6)
        {
            Button button6 = (Button) findViewById(R.id.button6);
            button6.setBackgroundColor(BOJA);
        }
        if(brojSlova==7)
        {
            Button button7 = (Button) findViewById(R.id.button7);
            button7.setBackgroundColor(BOJA);
        }
        if(brojSlova==8)
        {
            Button button8 = (Button) findViewById(R.id.button8);
            button8.setBackgroundColor(BOJA);
        }
        if(brojSlova==9)
        {
            Button button9 = (Button) findViewById(R.id.button9);
            button9.setBackgroundColor(BOJA);
        }
        if(brojSlova==10)
        {
            Button button10 = (Button) findViewById(R.id.button10);
            button10.setBackgroundColor(BOJA);
        }
        if(brojSlova==11)
        {
            Button button11 = (Button) findViewById(R.id.button11);
            button11.setBackgroundColor(BOJA);
        }
        if(brojSlova==12)
        {
            Button button12 = (Button) findViewById(R.id.button12);
            button12.setBackgroundColor(BOJA);
        }
        if(brojSlova==13)
        {
            Button button13 = (Button) findViewById(R.id.button13);
            button13.setBackgroundColor(BOJA);
        }
        if(brojSlova==14)
        {
            Button button14 = (Button) findViewById(R.id.button14);
            button14.setBackgroundColor(BOJA);
        }
        if(brojSlova==15)
        {
            Button button15 = (Button) findViewById(R.id.button15);
            button15.setBackgroundColor(BOJA);
        }
        if(brojSlova==16)
        {
            Button button16 = (Button) findViewById(R.id.button16);
            button16.setBackgroundColor(BOJA);
        }
        if(brojSlova==17)
        {
            Button button17 = (Button) findViewById(R.id.button17);
            button17.setBackgroundColor(BOJA);
        }
        if(brojSlova==18)
        {
            Button button18 = (Button) findViewById(R.id.button18);
            button18.setBackgroundColor(BOJA);
        }
        if(brojSlova==19)
        {
            Button button19 = (Button) findViewById(R.id.button19);
            button19.setBackgroundColor(BOJA);
        }
        if(brojSlova==20)
        {
            Button button20 = (Button) findViewById(R.id.button20);
            button20.setBackgroundColor(BOJA);
        }
        if(brojSlova==21)
        {
            Button button21 = (Button) findViewById(R.id.button21);
            button21.setBackgroundColor(BOJA);
        }
        if(brojSlova==22)
        {
            Button button22 = (Button) findViewById(R.id.button22);
            button22.setBackgroundColor(BOJA);
        }
        if(brojSlova==23)
        {
            Button button23 = (Button) findViewById(R.id.button23);
            button23.setBackgroundColor(BOJA);
        }
        if(brojSlova==24)
        {
            Button button24 = (Button) findViewById(R.id.button24);
            button24.setBackgroundColor(BOJA);
        }
        if(brojSlova==25)
        {
            Button button25 = (Button) findViewById(R.id.button25);
            button25.setBackgroundColor(BOJA);
        }
        if(brojSlova==26)
        {
            Button button26 = (Button) findViewById(R.id.button26);
            button26.setBackgroundColor(BOJA);
        }
        if(brojSlova==27)
        {
            Button button27 = (Button) findViewById(R.id.button27);
            button27.setBackgroundColor(BOJA);
        }
        if(brojSlova==28)
        {
            Button button28 = (Button) findViewById(R.id.button28);
            button28.setBackgroundColor(BOJA);
        }
        if(brojSlova==29)
        {
            Button button29 = (Button) findViewById(R.id.button29);
            button29.setBackgroundColor(BOJA);
        }
        if(brojSlova==30)
        {
            Button button30 = (Button) findViewById(R.id.button30);
            button30.setBackgroundColor(BOJA);
        }

    }
    public void PromenaBojeTastature1(String SLOVO, int BOJA) {
        for (int i = 1; i < 31; i++) {
            if (SLOVO.equals(azbuka[i-1])) {
                if (nizBoja[i] != 2) {
                    if (nizBoja[i] == 0) {
                        if(Color.parseColor("#00FF00") == BOJA) {
                            promenaBojeTastature(BOJA, i);
                            nizBoja[i] = 2;
                        }
                        if(Color.parseColor("#B58B00") == BOJA){
                            promenaBojeTastature(BOJA,i);
                            nizBoja[i] = 1;
                        }
                        if(Color.parseColor("#953553") == BOJA){
                            promenaBojeTastature(BOJA,i);
                        }
                    }else{
                        if(Color.parseColor("#00FF00") == BOJA) {
                            promenaBojeTastature(BOJA, i);
                            nizBoja[i] = 2;
                        }
                    }
                }
            }
        }

    }
    public void PROVERA(String[] RECx) {

        int[] brojilac = {0,0};
        boolean[] NotYellow = {true,true,true,true,true};
        boolean[] NotGreen = {true,true,true,true,true};

        while (brojilac[1] < 5) {
            if (brojilac[0] < 5) {
                if (RECx[brojilac[0]].equals(tvResenje[brojilac[0]])) {
                    PROMENAboje(brojilac[0], ZELENO);
                    PromenaBojeTastature1(RECx[brojilac[0]], ZELENO);
                    if (brojilac[0] == 0) {
                        NotYellow[0] = false;
                        NotGreen[0] = false;
                    } else if (brojilac[0] == 1) {
                        NotYellow[1] = false;
                        NotGreen[1]= false;
                    } else if (brojilac[0] == 2) {
                        NotYellow[2] = false;
                        NotGreen[2]= false;
                    } else if (brojilac[0] == 3) {
                        NotYellow[3] = false;
                        NotGreen[3]= false;
                    } else {
                        NotYellow[4] = false;
                        NotGreen[4]= false;
                    }
                    if ((!NotGreen[0]&&!NotGreen[1]&&!NotGreen[2]&&!NotGreen[3]&&!NotGreen[4])){
                        KRAJ();
                    }
                }
                brojilac[0]++;
            } else {
                if (brojilac[1] == 0 && NotGreen[0] || brojilac[1] == 1 && NotGreen[1] || brojilac[1] == 2 && NotGreen[2] || brojilac[1] == 3 && NotGreen[3] || brojilac[1] == 4 && NotGreen[4]) {
                    if (RECx[brojilac[1]].equals(tvResenje[0]) && NotYellow[0]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[0] = false;
                    } else if (RECx[brojilac[1]].equals(tvResenje[1]) && NotYellow[1]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[1] = false;
                    } else if (RECx[brojilac[1]].equals(tvResenje[2]) && NotYellow[2]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[2] = false;
                    } else if (RECx[brojilac[1]].equals(tvResenje[3]) && NotYellow[3]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[3] = false;
                    } else if (RECx[brojilac[1]].equals(tvResenje[4]) && NotYellow[4]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[4] = false;
                    } else {
                        PROMENAboje(brojilac[1], CRVENO);
                        PromenaBojeTastature1(RECx[brojilac[1]], CRVENO);
                    }
                }
                brojilac[1]++;
            }
        }
    }
    public String SPAJANJEreci(String[] recBROJ){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            sb.append(recBROJ[i]);
        }
        return sb.toString();
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();





        Button btErase = (Button)findViewById(R.id.button32);
        btErase.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v32)
            {
                if (brojSlova>0)
                {
                    brojSlova--;
                    if (brojReci==1){
                        rec1[brojSlova] = "";
                    }else
                    if (brojReci == 2){
                        rec2[brojSlova] = "";
                    }else
                    if (brojReci==3){
                        rec3[brojSlova] = "";
                    }else
                    if (brojReci==4){
                        rec4[brojSlova] = "";
                    }else
                    if (brojReci==5){
                        rec5[brojSlova] = "";
                    }else
                    if (brojReci==6){
                        rec6[brojSlova] = "";
                    }

                }
                TEKST();
            }
        });



        ImageButton btHelp = (ImageButton)findViewById(R.id.button33);
        btHelp.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v33)
            {
                help();
            }
        });

        Button btEnter = (Button)findViewById(R.id.button31);
        btEnter.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v31)
            {
                if(brojSlova==5)
                {
                    String RECstr = null;
                    if (brojReci == 1) {
                        RECstr = SPAJANJEreci(rec1);
                    } else if (brojReci == 2) {
                        RECstr = SPAJANJEreci(rec2);
                    } else if (brojReci == 3) {
                        RECstr = SPAJANJEreci(rec3);
                    } else if (brojReci == 4) {
                        RECstr = SPAJANJEreci(rec4);
                    } else if (brojReci == 5) {
                        RECstr = SPAJANJEreci(rec5);
                    } else if (brojReci == 6) {
                        RECstr = SPAJANJEreci(rec6);
                    }
                    if (PROVERA(RECstr))
                    {
                            if (brojReci == 1) {
                                PROVERA(rec1);
                            } else if (brojReci == 2) {
                                PROVERA(rec2);
                            } else if (brojReci == 3) {
                                PROVERA(rec3);
                            } else if (brojReci == 4) {
                                PROVERA(rec4);
                            } else if (brojReci == 5) {
                                PROVERA(rec5);
                            } else if (brojReci == 6) {
                                PROVERA(rec6);
                                KRAJ();
                            }
                            brojReci++;
                            brojSlova = 0;
                    }
                    else
                    {
                            Context context = getApplicationContext();
                            CharSequence text = "Реч коју сте унели није у речнику!";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                    }
                }
            }

        });


}
}
