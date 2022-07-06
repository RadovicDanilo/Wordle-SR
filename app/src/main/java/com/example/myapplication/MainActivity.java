package com.example.myapplication;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
import java.util.Random;


@RequiresApi(api = Build.VERSION_CODES.O)
public class MainActivity extends AppCompatActivity
{
    public int brojReci=1;
    public int brojSlova=0;
    public String[] azbuka = { "Љ","Њ","Е","Р","Т","З","У","И","О","П","А","С","Д","Ф","Г","Х","Ј","К","Л","Ч","Џ","Ц","В", "Б", "Н", "М", "Ћ", "Ђ", "Ш", "Ж"};
    public String[] rec1 = {"","","","",""};
    public String[] rec2 = {"","","","",""};
    public String[] rec3 = {"","","","",""};
    public String[] rec4 = {"","","","",""};
    public String[] rec5 = {"","","","",""};
    public String[] rec6 = {"","","","",""};
    public String[] RESENJE = {"К","Њ","И","Г","А"};

    public boolean PROVERA(String Recstr){
        boolean flag= false;
        String filename = "LISTARECI.txt";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader
                    (this.getAssets().open(filename), StandardCharsets.UTF_8));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(Recstr))
                {
                    flag = true;
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public AlertDialog.Builder dialogBuilder;
    public  AlertDialog dialog;
    public Button Restart;
    public TextView Resenje;

    public void KRAJ(){

        dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.popup,null);

        Restart = (Button) contactPopupView.findViewById(R.id.Restart);
        Resenje = (TextView) contactPopupView.findViewById(R.id.Resenje);
        dialogBuilder.setView(contactPopupView);
        dialog = dialogBuilder.create();
        dialog.show();

        Resenje.setText("Тачна реч је: "+RESENJE[0]+RESENJE[1]+RESENJE[2]+RESENJE[3]+RESENJE[4]);

        TextView textView1 = (TextView) contactPopupView.findViewById(R.id.textView31);
        textView1.setText(rec1[0]);
        textView1.setBackground(((TextView) findViewById(R.id.textView31)).getBackground());
        TextView textView2 = (TextView) contactPopupView.findViewById(R.id.textView32);
        textView2.setText(rec1[1]);
        TextView textView3 = (TextView) contactPopupView.findViewById(R.id.textView33);
        textView3.setText(rec1[2]);
        TextView textView4 = (TextView) contactPopupView.findViewById(R.id.textView34);
        textView4.setText(rec1[3]);
        TextView textView5 = (TextView) contactPopupView.findViewById(R.id.textView35);
        textView5.setText(rec1[4]);
        TextView textView6 = (TextView) contactPopupView.findViewById(R.id.textView36);
        textView6.setText(rec2[0]);
        TextView textView7 = (TextView) contactPopupView.findViewById(R.id.textView37);
        textView7.setText(rec2[1]);
        TextView textView8 = (TextView) contactPopupView.findViewById(R.id.textView38);
        textView8.setText(rec2[2]);
        TextView textView9 = (TextView) contactPopupView.findViewById(R.id.textView39);
        textView9.setText(rec2[3]);
        TextView textView10 = (TextView) contactPopupView.findViewById(R.id.textView40);
        textView10.setText(rec2[4]);
        TextView textView11 = (TextView) contactPopupView.findViewById(R.id.textView41);
        textView11.setText(rec3[0]);
        TextView textView12 = (TextView) contactPopupView.findViewById(R.id.textView42);
        textView12.setText(rec3[1]);
        TextView textView13 = (TextView) contactPopupView.findViewById(R.id.textView43);
        textView13.setText(rec3[2]);
        TextView textView14 = (TextView) contactPopupView.findViewById(R.id.textView44);
        textView14.setText(rec3[3]);
        TextView textView15 = (TextView) contactPopupView.findViewById(R.id.textView45);
        textView15.setText(rec3[4]);
        TextView textView16 = (TextView) contactPopupView.findViewById(R.id.textView46);
        textView16.setText(rec4[0]);
        TextView textView17 = (TextView) contactPopupView.findViewById(R.id.textView47);
        textView17.setText(rec4[1]);
        TextView textView18 = (TextView) contactPopupView.findViewById(R.id.textView48);
        textView18.setText(rec4[2]);
        TextView textView19 = (TextView) contactPopupView.findViewById(R.id.textView49);
        textView19.setText(rec4[3]);
        TextView textView20 = (TextView) contactPopupView.findViewById(R.id.textView50);
        textView20.setText(rec4[4]);
        TextView textView21 = (TextView) contactPopupView.findViewById(R.id.textView51);
        textView21.setText(rec5[0]);
        TextView textView22 = (TextView) contactPopupView.findViewById(R.id.textView52);
        textView22.setText(rec5[1]);
        TextView textView23 = (TextView) contactPopupView.findViewById(R.id.textView53);
        textView23.setText(rec5[2]);
        TextView textView24 = (TextView) contactPopupView.findViewById(R.id.textView54);
        textView24.setText(rec5[3]);
        TextView textView25 = (TextView) contactPopupView.findViewById(R.id.textView55);
        textView25.setText(rec5[4]);
        TextView textView26 = (TextView) contactPopupView.findViewById(R.id.textView56);
        textView26.setText(rec6[0]);
        TextView textView27 = (TextView) contactPopupView.findViewById(R.id.textView57);
        textView27.setText(rec6[1]);
        TextView textView28 = (TextView) contactPopupView.findViewById(R.id.textView58);
        textView28.setText(rec6[2]);
        TextView textView29 = (TextView) contactPopupView.findViewById(R.id.textView59);
        textView29.setText(rec6[3]);
        TextView textView30 = (TextView) contactPopupView.findViewById(R.id.textView60);
        textView30.setText(rec6[4]);

        textView1.setBackground(((TextView) findViewById(R.id.textView31)).getBackground());
        textView2.setBackground(((TextView) findViewById(R.id.textView32)).getBackground());
        textView3.setBackground(((TextView) findViewById(R.id.textView33)).getBackground());
        textView4.setBackground(((TextView) findViewById(R.id.textView34)).getBackground());
        textView5.setBackground(((TextView) findViewById(R.id.textView35)).getBackground());
        textView6.setBackground(((TextView) findViewById(R.id.textView36)).getBackground());
        textView7.setBackground(((TextView) findViewById(R.id.textView37)).getBackground());
        textView8.setBackground(((TextView) findViewById(R.id.textView38)).getBackground());
        textView9.setBackground(((TextView) findViewById(R.id.textView39)).getBackground());
        textView10.setBackground(((TextView) findViewById(R.id.textView40)).getBackground());
        textView11.setBackground(((TextView) findViewById(R.id.textView41)).getBackground());
        textView12.setBackground(((TextView) findViewById(R.id.textView42)).getBackground());
        textView13.setBackground(((TextView) findViewById(R.id.textView43)).getBackground());
        textView14.setBackground(((TextView) findViewById(R.id.textView44)).getBackground());
        textView15.setBackground(((TextView) findViewById(R.id.textView45)).getBackground());
        textView16.setBackground(((TextView) findViewById(R.id.textView46)).getBackground());
        textView17.setBackground(((TextView) findViewById(R.id.textView47)).getBackground());
        textView18.setBackground(((TextView) findViewById(R.id.textView48)).getBackground());
        textView19.setBackground(((TextView) findViewById(R.id.textView49)).getBackground());
        textView20.setBackground(((TextView) findViewById(R.id.textView50)).getBackground());
        textView21.setBackground(((TextView) findViewById(R.id.textView51)).getBackground());
        textView22.setBackground(((TextView) findViewById(R.id.textView52)).getBackground());
        textView23.setBackground(((TextView) findViewById(R.id.textView53)).getBackground());
        textView24.setBackground(((TextView) findViewById(R.id.textView54)).getBackground());
        textView25.setBackground(((TextView) findViewById(R.id.textView55)).getBackground());
        textView26.setBackground(((TextView) findViewById(R.id.textView56)).getBackground());
        textView27.setBackground(((TextView) findViewById(R.id.textView57)).getBackground());
        textView28.setBackground(((TextView) findViewById(R.id.textView58)).getBackground());
        textView29.setBackground(((TextView) findViewById(R.id.textView59)).getBackground());
        textView30.setBackground(((TextView) findViewById(R.id.textView60)).getBackground());

        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
                //dialog.dismiss();
            }
        });
    }
    public AlertDialog.Builder dialogBuilder1;
    public  AlertDialog dialog1;
    public void help(){

        dialogBuilder1 = new AlertDialog.Builder(this);
        final View contactPopupView1= getLayoutInflater().inflate(R.layout.help,null);
        ImageButton imageButtonH= (ImageButton) contactPopupView1.findViewById(R.id.imageButtonH);
        ImageView imageView = (ImageView)contactPopupView1.findViewById(R.id.imageViewH);
        dialogBuilder1.setView(contactPopupView1);
        dialog1 = dialogBuilder1.create();
        dialog1.show();

        imageButtonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vH) {
                dialog1.dismiss();
            }
        });
    }

    public void RNDrec(){
        int BrReciURecniku = new Random().nextInt(18296) + 1;
        int brojilac = 1;
        String filename2 = "LISTARECI.txt";
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader2 = new BufferedReader(new InputStreamReader
                    (this.getAssets().open(filename2), StandardCharsets.UTF_8));
            String line2;
            while ((line2 = bufferedReader2.readLine()) != null)
            {

              if(brojilac ==BrReciURecniku)
              {
             RESENJE[0]= line2.substring(0,1);
             RESENJE[1]= line2.substring(1,2);
             RESENJE[2]= line2.substring(2,3);
             RESENJE[3]= line2.substring(3,4);
             RESENJE[4]= line2.substring(4,5);
              }
              brojilac++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void TEKST() {
        TextView textView1 = (TextView) findViewById(R.id.textView31);
        textView1.setText(rec1[0]);
        TextView textView2 = (TextView) findViewById(R.id.textView32);
        textView2.setText(rec1[1]);
        TextView textView3 = (TextView) findViewById(R.id.textView33);
        textView3.setText(rec1[2]);
        TextView textView4 = (TextView) findViewById(R.id.textView34);
        textView4.setText(rec1[3]);
        TextView textView5 = (TextView) findViewById(R.id.textView35);
        textView5.setText(rec1[4]);
        TextView textView6 = (TextView) findViewById(R.id.textView36);
        textView6.setText(rec2[0]);
        TextView textView7 = (TextView) findViewById(R.id.textView37);
        textView7.setText(rec2[1]);
        TextView textView8 = (TextView) findViewById(R.id.textView38);
        textView8.setText(rec2[2]);
        TextView textView9 = (TextView) findViewById(R.id.textView39);
        textView9.setText(rec2[3]);
        TextView textView10 = (TextView) findViewById(R.id.textView40);
        textView10.setText(rec2[4]);
        TextView textView11 = (TextView) findViewById(R.id.textView41);
        textView11.setText(rec3[0]);
        TextView textView12 = (TextView) findViewById(R.id.textView42);
        textView12.setText(rec3[1]);
        TextView textView13 = (TextView) findViewById(R.id.textView43);
        textView13.setText(rec3[2]);
        TextView textView14 = (TextView) findViewById(R.id.textView44);
        textView14.setText(rec3[3]);
        TextView textView15 = (TextView) findViewById(R.id.textView45);
        textView15.setText(rec3[4]);
        TextView textView16 = (TextView) findViewById(R.id.textView46);
        textView16.setText(rec4[0]);
        TextView textView17 = (TextView) findViewById(R.id.textView47);
        textView17.setText(rec4[1]);
        TextView textView18 = (TextView) findViewById(R.id.textView48);
        textView18.setText(rec4[2]);
        TextView textView19 = (TextView) findViewById(R.id.textView49);
        textView19.setText(rec4[3]);
        TextView textView20 = (TextView) findViewById(R.id.textView50);
        textView20.setText(rec4[4]);
        TextView textView21 = (TextView) findViewById(R.id.textView51);
        textView21.setText(rec5[0]);
        TextView textView22 = (TextView) findViewById(R.id.textView52);
        textView22.setText(rec5[1]);
        TextView textView23 = (TextView) findViewById(R.id.textView53);
        textView23.setText(rec5[2]);
        TextView textView24 = (TextView) findViewById(R.id.textView54);
        textView24.setText(rec5[3]);
        TextView textView25 = (TextView) findViewById(R.id.textView55);
        textView25.setText(rec5[4]);
        TextView textView26 = (TextView) findViewById(R.id.textView56);
        textView26.setText(rec6[0]);
        TextView textView27 = (TextView) findViewById(R.id.textView57);
        textView27.setText(rec6[1]);
        TextView textView28 = (TextView) findViewById(R.id.textView58);
        textView28.setText(rec6[2]);
        TextView textView29 = (TextView) findViewById(R.id.textView59);
        textView29.setText(rec6[3]);
        TextView textView30 = (TextView) findViewById(R.id.textView60);
        textView30.setText(rec6[4]);

    }
    public void KUCANJE(int AZ){
        if (brojSlova<5)
        {
            if (brojReci==1){
                rec1[brojSlova] = azbuka[AZ];
            }else
            if (brojReci == 2){
                rec2[brojSlova] = azbuka[AZ];
            }else
            if (brojReci==3){
                rec3[brojSlova] = azbuka[AZ];
            }else
            if (brojReci==4){
                rec4[brojSlova] = azbuka[AZ];
            }else
            if (brojReci==5){
                rec5[brojSlova] = azbuka[AZ];
            }else
            if (brojReci==6){
                rec6[brojSlova] = azbuka[AZ];
            }
            brojSlova++;
        }
    }
    public static int ZELENO=Color.parseColor("#00FF00");
    public static int ZUTO=Color.parseColor("#B58B00");
    public static int CRVENO =Color.parseColor("#953553");
    public void PROMENAboje(int f,int BOJA) {
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
                if (RECx[brojilac[0]].equals(RESENJE[brojilac[0]])) {
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
                    if (RECx[brojilac[1]].equals(RESENJE[0]) && NotYellow[0]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[0] = false;
                    } else if (RECx[brojilac[1]].equals(RESENJE[1]) && NotYellow[1]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[1] = false;
                    } else if (RECx[brojilac[1]].equals(RESENJE[2]) && NotYellow[2]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[2] = false;
                    } else if (RECx[brojilac[1]].equals(RESENJE[3]) && NotYellow[3]) {
                        PROMENAboje(brojilac[1], ZUTO);
                        PromenaBojeTastature1(RECx[brojilac[1]], ZUTO);
                        NotYellow[3] = false;
                    } else if (RECx[brojilac[1]].equals(RESENJE[4]) && NotYellow[4]) {
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

        RNDrec();

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v1)
            {
                KUCANJE(0);
                TEKST();
            }
        });
        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v2)
            {
                KUCANJE(1);
                TEKST();
            }
        });
        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v3)
            {
                KUCANJE(2);
                TEKST();
            }
        });
        Button button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v4)
            {
                KUCANJE(3);
                TEKST();
            }
        });
        Button button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v5)
            {
                KUCANJE(4);
                TEKST();
            }
        });
        Button button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v6)
            {
                KUCANJE(5);
                TEKST();
            }
        });
        Button button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v7)
            {
                KUCANJE(6);
                TEKST();
            }
        });
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v8)
            {
                KUCANJE(7);
                TEKST();
            }
        });
        Button button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v9)
            {
                KUCANJE(8);
                TEKST();
            }
        });
        Button button10 = (Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v10)
            {
                KUCANJE(9);
                TEKST();
            }
        });
        Button button11 = (Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v11)
            {
                KUCANJE(10);
                TEKST();
            }
        });
        Button button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v12)
            {
                KUCANJE(11);
                TEKST();
            }
        });
        Button button13 = (Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v13)
            {
                KUCANJE(12);
                TEKST();
            }
        });
        Button button14 = (Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v14)
            {
                KUCANJE(13);
                TEKST();
            }
        });
        Button button15 = (Button)findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v15)
            {
                KUCANJE(14);
                TEKST();
            }
        });
        Button button16 = (Button)findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v16)
            {
                KUCANJE(15);
                TEKST();
            }
        });
        Button button17 = (Button)findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v17)
            {
                KUCANJE(16);
                TEKST();
            }
        });
        Button button18 = (Button)findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v18)
            {
                KUCANJE(17);
                TEKST();
            }
        });
        Button button19 = (Button)findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v19)
            {
                KUCANJE(18);
                TEKST();
            }
        });
        Button button20 = (Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v20)
            {
                KUCANJE(19);
                TEKST();
            }
        });
        Button button21 = (Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v21)
            {
                KUCANJE(20);
                TEKST();
            }
        });
        Button button22 = (Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v22)
            {
                KUCANJE(21);
                TEKST();
            }
        });
        Button button23 = (Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v23)
            {
                KUCANJE(22);
                TEKST();
            }
        });
        Button button24 = (Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v24)
            {
                KUCANJE(23);
                TEKST();
            }
        });
        Button button25 = (Button)findViewById(R.id.button25);
        button25.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v25)
            {
                KUCANJE(24);
                TEKST();
            }
        });
        Button button26 = (Button)findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v26)
            {
                KUCANJE(25);
                TEKST();
            }
        });
        Button button27 = (Button)findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v27)
            {
                KUCANJE(26);
                TEKST();
            }
        });
        Button button28 = (Button)findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v28)
            {
                KUCANJE(27);
                TEKST();
            }
        });
        Button button29 = (Button)findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v29)
            {
                KUCANJE(28);
                TEKST();
            }
        });
        Button button30 = (Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v30)
            {
                KUCANJE(29);
                TEKST();
            }
        });
        Button button32 = (Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener()
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



        ImageButton button33 = (ImageButton)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v33)
            {
                help();
            }
        });

        Button button31 = (Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener()
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