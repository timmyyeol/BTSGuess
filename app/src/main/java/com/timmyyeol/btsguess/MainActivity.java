package com.timmyyeol.btsguess;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2, btn3;

    DatabaseHelper sqlHelper;
    SQLiteDatabase db;
    Cursor userCursor;
    DatabaseHelper databaseHelper;
    long userId=1;
    String hearts = "", our_level = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-4640210318249760~5101414294");

        btn2 = findViewById(R.id.button2);
        btn2.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn3 = findViewById(R.id.button1);
        btn3.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn1 = (Button) findViewById(R.id.button0);
        btn1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
    }

    public void Start(View view) {
      /*  sqlHelper = new DatabaseHelper(this);
        db = sqlHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(DatabaseHelper.COLUMN_YEAR, Integer.toString(97));
        db.update(DatabaseHelper.TABLE, cv, DatabaseHelper.COLUMN_ID + "=" + String.valueOf(userId), null); */
            Intent i = new Intent(getApplicationContext(), LevelsActivity.class);
            startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.addCategory(Intent.CATEGORY_HOME);
        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }



    public void ContClick(View view) {
        Intent i = new Intent(getApplicationContext(), ContactsActivity.class);
        startActivity(i);
    }

    public void ArcadeClick(View view) {
        Intent i = new Intent(getApplicationContext(), ArcadeActivity.class);
        startActivity(i);
    }
}
