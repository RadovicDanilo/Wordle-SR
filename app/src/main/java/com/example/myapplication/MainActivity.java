package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
public class MainActivity extends AppCompatActivity
{
    final String dictionaryPath = "dictionary.txt";
    final int GREEN =Color.parseColor("#00FF00");
    final int YELLOW =Color.parseColor("#B58B00");
    final int RED =Color.parseColor("#953553");
    String[] azbuka = { "Љ","Њ","Е","Р","Т","З","У","И","О","П","А","С","Д","Ф","Г","Х","Ј","К","Л","Ч","Џ","Ц","В", "Б", "Н", "М", "Ћ", "Ђ", "Ш", "Ж"};
    String[][] words = new String[7][5];
    String solution;
    int currentWord = 0;
    int currentLetter = 0;
    List<TextView> wordsTextView = new ArrayList<>();
    List<TextView> wordsTextViewEnd = new ArrayList<>();
    List<Button> keyboard = new ArrayList<>();
    List<Colors> keyboardColors = new ArrayList<>();

    public void initialise(){
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(this.getAssets().open(dictionaryPath), StandardCharsets.UTF_8));
            String line = null;
            int wordIndex = new Random().nextInt(18296) + 1;
            for(int i = 0; i<wordIndex; i++){
                line = bufferedReader.readLine();
            }
            solution=line;
            for(int j = 0; j<5;j++){
                words[6][j]= line.substring(j,j+1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for(int i = 0; i<30; i++){
            keyboardColors.add(Colors.PURPLE);
        }

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);
        Button button13 = findViewById(R.id.button13);
        Button button14 = findViewById(R.id.button14);
        Button button15 = findViewById(R.id.button15);
        Button button16 = findViewById(R.id.button16);
        Button button17 = findViewById(R.id.button17);
        Button button18 = findViewById(R.id.button18);
        Button button19 = findViewById(R.id.button19);
        Button button20 = findViewById(R.id.button20);
        Button button21 = findViewById(R.id.button21);
        Button button22 = findViewById(R.id.button22);
        Button button23 = findViewById(R.id.button23);
        Button button24 = findViewById(R.id.button24);
        Button button25 = findViewById(R.id.button25);
        Button button26 = findViewById(R.id.button26);
        Button button27 = findViewById(R.id.button27);
        Button button28 = findViewById(R.id.button28);
        Button button29 = findViewById(R.id.button29);
        Button button30 = findViewById(R.id.button30);

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

        for(Button b : keyboard){
            b.setOnClickListener(view -> {
                EnterWord(keyboard.indexOf(b));
                refreshUI();
            });
        }

        Button btErase = findViewById(R.id.button32);
        btErase.setOnClickListener(v32 -> {
            if (currentLetter>0)
            {
                currentLetter--;
                words[currentWord][currentLetter] = "";
                refreshUI();
            }
        });

        ImageButton btHelp = findViewById(R.id.button33);
        btHelp.setOnClickListener(v33 -> help());

        Button btEnter = findViewById(R.id.button31);
        btEnter.setOnClickListener(v33 -> {
            if(isInDictionary()){
                CheckWord();
            }
        });

        TextView tvTable1 = findViewById(R.id.textView31);
        TextView tvTable2 = findViewById(R.id.textView32);
        TextView tvTable3 = findViewById(R.id.textView33);
        TextView tvTable4 = findViewById(R.id.textView34);
        TextView tvTable5 = findViewById(R.id.textView35);
        TextView tvTable6 = findViewById(R.id.textView36);
        TextView tvTable7 = findViewById(R.id.textView37);
        TextView tvTable8 = findViewById(R.id.textView38);
        TextView tvTable9 = findViewById(R.id.textView39);
        TextView tvTable10 = findViewById(R.id.textView40);
        TextView tvTable11 = findViewById(R.id.textView41);
        TextView tvTable12 = findViewById(R.id.textView42);
        TextView tvTable13 = findViewById(R.id.textView43);
        TextView tvTable14 = findViewById(R.id.textView44);
        TextView tvTable15 = findViewById(R.id.textView45);
        TextView tvTable16 = findViewById(R.id.textView46);
        TextView tvTable17 = findViewById(R.id.textView47);
        TextView tvTable18 = findViewById(R.id.textView48);
        TextView tvTable19 = findViewById(R.id.textView49);
        TextView tvTable20 = findViewById(R.id.textView50);
        TextView tvTable21 = findViewById(R.id.textView51);
        TextView tvTable22 = findViewById(R.id.textView52);
        TextView tvTable23 = findViewById(R.id.textView53);
        TextView tvTable24 = findViewById(R.id.textView54);
        TextView tvTable25 = findViewById(R.id.textView55);
        TextView tvTable26 = findViewById(R.id.textView56);
        TextView tvTable27 = findViewById(R.id.textView57);
        TextView tvTable28 = findViewById(R.id.textView58);
        TextView tvTable29 = findViewById(R.id.textView59);
        TextView tvTable30 = findViewById(R.id.textView60);

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
        for(int i = 0; i < 6;  i++){
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
    public boolean isInDictionary(){
        String word = words[currentWord][0]+ words[currentWord][1]+ words[currentWord][2]+ words[currentWord][3]+ words[currentWord][4];
        String filename = "dictionary.txt";
        BufferedReader bufferedReader;
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
    public void CheckWord() {

        boolean[] isYellow = {false,false,false,false,false};
        boolean[] isGreen = {false,false,false,false,false};

        for(int i = 0; i<5;i++) {
            if(Objects.equals(words[currentWord][i], words[6][i])){
                isGreen[i] = true;
            }
        }
        for(int i = 0; i<5;i++){
            for(int j = 0; j<5;j++){
                if (Objects.equals(words[currentWord][i], words[6][j]) && !isGreen[j]) {
                    isYellow[i] = true;
                    break;
                }
            }
        }
        for(int i = 0; i<5;i++){
            if(isGreen[i]){
                ChangeWordTableColor(GREEN, i);
                ChangeKeyboardColor(GREEN, words[currentWord][i]);
            } else if (isYellow[i]) {
                ChangeWordTableColor(YELLOW,i);
                ChangeKeyboardColor(YELLOW, words[currentWord][i]);
            }else{
                ChangeWordTableColor(RED,i);
                ChangeKeyboardColor(RED, words[currentWord][i]);
            }
        }
        if(currentWord==5||(isGreen[0]&&isGreen[1]&&isGreen[2]&&isGreen[3]&&isGreen[4])){
            end();
        }
        currentWord++;
        currentLetter=0;
    }
    public void ChangeWordTableColor( int colour,int n) {
        wordsTextView.get(currentWord*5+n).setBackgroundColor(colour);
    }
    public void ChangeKeyboardColor(int color, String letter){
        int wordIndex = 0;
        while (!azbuka[wordIndex].equalsIgnoreCase(letter)) {
            wordIndex++;
        }
        if (keyboardColors.get(wordIndex) != Colors.GREEN && keyboardColors.get(wordIndex) != Colors.RED) {
            
            if(keyboardColors.get(wordIndex)==Colors.YELLOW && color==GREEN){
                keyboard.get(wordIndex).setBackgroundColor(color);
                keyboardColors.set(wordIndex,Colors.GREEN);
            }else if(keyboardColors.get(wordIndex)==Colors.PURPLE){
                keyboard.get(wordIndex).setBackgroundColor(color);
                if(color==GREEN)
                    keyboardColors.set(wordIndex,Colors.GREEN);
                if(color==YELLOW)
                    keyboardColors.set(wordIndex,Colors.YELLOW);
                if(color==RED)
                    keyboardColors.set(wordIndex,Colors.RED);
            }
        }
    }
    public void help(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.help,null);
        ImageButton imageButtonHelp= contactPopupView.findViewById(R.id.imageButtonH);
        dialogBuilder.setView(contactPopupView);
        AlertDialog dialog = dialogBuilder.create();
        dialog.show();
        imageButtonHelp.setOnClickListener(vH -> dialog.dismiss());
    }
    public void end(){

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        final View contactPopupView= getLayoutInflater().inflate(R.layout.popup,null);
        dialogBuilder.setView(contactPopupView);
        AlertDialog alertDialog = dialogBuilder.create();
        alertDialog.show();

        TextView tvSolution = contactPopupView.findViewById(R.id.Resenje);
        tvSolution.setText(String.format("Тачна реч је: %s", solution));

        TextView textView1 = contactPopupView.findViewById(R.id.textView31);
        TextView textView2 = contactPopupView.findViewById(R.id.textView32);
        TextView textView3 = contactPopupView.findViewById(R.id.textView33);
        TextView textView4 = contactPopupView.findViewById(R.id.textView34);
        TextView textView5 = contactPopupView.findViewById(R.id.textView35);
        TextView textView6 = contactPopupView.findViewById(R.id.textView36);
        TextView textView7 =  contactPopupView.findViewById(R.id.textView37);
        TextView textView8 =  contactPopupView.findViewById(R.id.textView38);
        TextView textView9 =  contactPopupView.findViewById(R.id.textView39);
        TextView textView10 = contactPopupView.findViewById(R.id.textView40);
        TextView textView11 = contactPopupView.findViewById(R.id.textView41);
        TextView textView12 = contactPopupView.findViewById(R.id.textView42);
        TextView textView13 = contactPopupView.findViewById(R.id.textView43);
        TextView textView14 = contactPopupView.findViewById(R.id.textView44);
        TextView textView15 = contactPopupView.findViewById(R.id.textView45);
        TextView textView16 = contactPopupView.findViewById(R.id.textView46);
        TextView textView17 = contactPopupView.findViewById(R.id.textView47);
        TextView textView18 = contactPopupView.findViewById(R.id.textView48);
        TextView textView19 = contactPopupView.findViewById(R.id.textView49);
        TextView textView20 = contactPopupView.findViewById(R.id.textView50);
        TextView textView21 = contactPopupView.findViewById(R.id.textView51);
        TextView textView22 = contactPopupView.findViewById(R.id.textView52);
        TextView textView23 = contactPopupView.findViewById(R.id.textView53);
        TextView textView24 = contactPopupView.findViewById(R.id.textView54);
        TextView textView25 = contactPopupView.findViewById(R.id.textView55);
        TextView textView26 = contactPopupView.findViewById(R.id.textView56);
        TextView textView27 = contactPopupView.findViewById(R.id.textView57);
        TextView textView28 = contactPopupView.findViewById(R.id.textView58);
        TextView textView29 = contactPopupView.findViewById(R.id.textView59);
        TextView textView30 = contactPopupView.findViewById(R.id.textView60);

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
            wordsTextViewEnd.get(i).setText(wordsTextView.get(i).getText());
        }
        Button btRestart = contactPopupView.findViewById(R.id.Restart);
        btRestart.setOnClickListener(view -> {
            finish();
            startActivity(getIntent());
        });
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();
    }
}
