package com.timmyyeol.btsguess;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArcadeActivity extends AppCompatActivity {

    TextView txt1;
    String lvl = "";
    int j = 0;
    private final int IDD_true = 1, IDD_false = 2;
    int lifes = 5;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7, btn8;
    PublisherInterstitialAd mInterstitialAd;
    ImageView imageView;
    Integer [] mas = new Integer [100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_arcade);

        mInterstitialAd = new PublisherInterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-4640210318249760/8688881415");
        //mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        requestNewInterstitial();

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);

        txt1 = (TextView) findViewById(R.id.textView);
        txt1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn8.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));

        for (int i = 0; i < 100; i++){
            mas[i] = i+1;
        }

        List<Integer> lst = Arrays.asList(mas);
        Collections.shuffle(lst);
        mas = lst.toArray(mas);

        imageView = (ImageView) findViewById(R.id.imageView);
        int id = getResources().getIdentifier("f" + mas[j], "drawable", getPackageName());
        imageView.setImageResource(id);

        btn8.setText(String.valueOf(lifes));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                //wrong();
            }
        });
    }
    private void requestNewInterstitial() {
        PublisherAdRequest adRequest = new PublisherAdRequest.Builder()
                .build();
        mInterstitialAd.loadAd(adRequest);
    }

    private void levels() {
        imageView.setTag("f" + mas[j]);
        lvl = (String)imageView.getTag();
        lvl = lvl.replace("f", "");
    }


    public void rmClick(View view) {
        levels();
        if(lvl.equals("56") ||lvl.equals("64") || lvl.equals("82") || lvl.equals("75") || lvl.equals("87") || lvl.equals("95") || lvl.equals("100") || lvl.equals("1") ||lvl.equals("4") || lvl.equals("8") || lvl.equals("18") || lvl.equals("34") || lvl.equals("36") || lvl.equals("45")) {
            yes();
        } else {
            no();
        }

    }

    public void jinClick(View view) {
        levels();
        if(lvl.equals("59") ||lvl.equals("66") || lvl.equals("68") || lvl.equals("73") || lvl.equals("85") || lvl.equals("91") || lvl.equals("6") ||lvl.equals("46") || lvl.equals("12") || lvl.equals("20") || lvl.equals("22") || lvl.equals("48")) {
            yes();
        } else {
            no();
        }

    }

    public void sugaClick(View view) {
        levels();
        if(lvl.equals("55") || lvl.equals("61") || lvl.equals("69") || lvl.equals("74") || lvl.equals("76") || lvl.equals("83") || lvl.equals("88") || lvl.equals("94") || lvl.equals("7") || lvl.equals("3") ||lvl.equals("25") || lvl.equals("26") || lvl.equals("30") || lvl.equals("33") || lvl.equals("35") || lvl.equals("40") || lvl.equals("44")) {
            yes();
        } else {
            no();
        }

    }

    public void hopeClick(View view) {
        levels();
        if(lvl.equals("52") ||lvl.equals("54") || lvl.equals("63") || lvl.equals("70") || lvl.equals("80") || lvl.equals("89") || lvl.equals("13") || lvl.equals("2") ||lvl.equals("5") || lvl.equals("9") || lvl.equals("17") || lvl.equals("19") || lvl.equals("47")) {
            yes();
        } else {
            no();
        }
    }

    public void jiminClick(View view) {
        levels();
        if(lvl.equals("57") || lvl.equals("65") || lvl.equals("78") || lvl.equals("67") || lvl.equals("92") || lvl.equals("99") || lvl.equals("15") ||lvl.equals("21") || lvl.equals("24") || lvl.equals("29") || lvl.equals("31") || lvl.equals("37") || lvl.equals("42")) {
            yes();
        } else {
            no();
        }
    }

    public void vClick(View view) {
        levels();
        if(lvl.equals("96") || lvl.equals("53") ||lvl.equals("58") || lvl.equals("60") ||lvl.equals("71") || lvl.equals("77") || lvl.equals("79") || lvl.equals("84") || lvl.equals("90") || lvl.equals("97") || lvl.equals("23") || lvl.equals("27") || lvl.equals("38") || lvl.equals("39") || lvl.equals("41") || lvl.equals("49")) {
            yes();
        } else {
            no();
        }

    }

    public void jkClick (View view){
        levels();
        if(lvl.equals("51") || lvl.equals("62") ||lvl.equals("72") || lvl.equals("81") ||lvl.equals("86") || lvl.equals("93") ||lvl.equals("98") || lvl.equals("10") || lvl.equals("11") || lvl.equals("14") || lvl.equals("16") || lvl.equals("28") || lvl.equals("32") || lvl.equals("43") || lvl.equals("50")) {
            yes();
        } else {
            no();
        }

    }

    private void yes() {
        if(j == 99) {
            real_end();
        } else {
            j++;
            right();
        }

    }

    private  void  no() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
            if(lifes>1){
                lifes--;
                btn8.setText(String.valueOf(lifes));
                wrong();
            } else end();
        }


    @Override
    public void onBackPressed() {

        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }


    private  void right(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        final View relativeLayout = getLayoutInflater().inflate(R.layout.idd_true, null);
        TextView textView = (TextView) relativeLayout.findViewById(R.id.textVol);
        textView.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));

        builder.setView(relativeLayout);
        builder.setCancelable(false);
        builder.setPositiveButton("Next",

                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        int idd = getResources().getIdentifier("f" + mas[j], "drawable", getPackageName());
                        imageView.setImageResource(idd);
                        btn1.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.VISIBLE);
                        btn3.setVisibility(View.VISIBLE);
                        btn4.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.VISIBLE);
                        btn6.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.VISIBLE);
                        txt1.setVisibility(View.VISIBLE);
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Stop",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                                dialog.cancel();

                            }
                        });

        AlertDialog alert = builder.create();
        alert.getWindow().setDimAmount(0);
        alert.getWindow().setGravity(Gravity.BOTTOM);
        alert.show();
        Button btnnext = alert.getButton(DialogInterface.BUTTON_POSITIVE);
        Button btnlevels = alert.getButton(DialogInterface.BUTTON_NEUTRAL);
        btnlevels.setTextSize(30);
        btnnext.setTextSize(30);
        btnlevels.setTextColor(Color.parseColor("#444573"));
        btnnext.setTextColor(Color.parseColor("#444573"));
        btnlevels.setBackgroundColor(Color.parseColor("#96ffffff"));
        btnnext.setBackgroundColor(Color.parseColor("#96ffffff"));
        btnnext.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btnlevels.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        txt1.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        int id = getResources().getIdentifier("o" + lvl, "drawable", getPackageName());
        imageView.setImageResource(id);

    }

    private  void  wrong(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View relativeLayout1 = getLayoutInflater().inflate(R.layout.idd_false, null);
        TextView textView1 = (TextView) relativeLayout1.findViewById(R.id.textVol);
        textView1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        builder.setView(relativeLayout1);
        builder.setCancelable(false);

        builder.setPositiveButton("Continue",

                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert1 = builder.create();
        alert1.show();
        Button cont = alert1.getButton(DialogInterface.BUTTON_POSITIVE);
        cont.setTextSize(30);
        cont.setTextColor(Color.parseColor("#444573"));
        cont.setBackgroundColor(Color.parseColor("#96ffffff"));
        cont.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
    }

    private  void  end(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View relativeLayout1 = getLayoutInflater().inflate(R.layout.idd_end, null);
        TextView textView1 = (TextView) relativeLayout1.findViewById(R.id.textVol);
        textView1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        textView1.setText("LIFE IS OVER. SCORE: " + String.valueOf(j));

        builder.setView(relativeLayout1);
        builder.setCancelable(false);

        builder.setPositiveButton("Try again",

                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent i = new Intent(getApplicationContext(), ArcadeActivity.class);
                        startActivity(i);
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Exit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(i);
                                dialog.cancel();

                            }
                        });

        AlertDialog alert1 = builder.create();
        alert1.show();
        Button cont = alert1.getButton(DialogInterface.BUTTON_POSITIVE);
        Button btnlevels = alert1.getButton(DialogInterface.BUTTON_NEUTRAL);
        btnlevels.setTextSize(30);
        btnlevels.setTextColor(Color.parseColor("#444573"));
        btnlevels.setBackgroundColor(Color.parseColor("#96ffffff"));
        btnlevels.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        cont.setTextSize(30);
        cont.setTextColor(Color.parseColor("#444573"));
        cont.setBackgroundColor(Color.parseColor("#96ffffff"));
        cont.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
    }

    private  void  real_end(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        final View relativeLayout1 = getLayoutInflater().inflate(R.layout.idd_end, null);
        TextView textView1 = (TextView) relativeLayout1.findViewById(R.id.textVol);
        textView1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        builder.setView(relativeLayout1);
        builder.setCancelable(false);

        builder.setPositiveButton("Menu",

                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                        dialog.cancel();
                    }
                });
        AlertDialog alert1 = builder.create();
        alert1.show();
        Button cont = alert1.getButton(DialogInterface.BUTTON_POSITIVE);
        cont.setTextSize(30);
        cont.setTextColor(Color.parseColor("#444573"));
        cont.setBackgroundColor(Color.parseColor("#96ffffff"));
        cont.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
    }


}
