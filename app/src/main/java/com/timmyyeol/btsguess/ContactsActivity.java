package com.timmyyeol.btsguess;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class ContactsActivity extends AppCompatActivity {
    Button btn0, btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_contacts);

        btn0 = (Button) findViewById(R.id.button0);
        btn0.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setTypeface(Typeface.createFromAsset(
                getAssets(), "OzHandicraftWin.ttf"));
    }

    public void gmailClick(View view) {
        ClipboardManager clipboard = (ClipboardManager) getApplicationContext().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("", btn1.getText().toString());
        clipboard.setPrimaryClip(clip);
        Toast toast = Toast.makeText(getApplicationContext(), "COPIED", Toast.LENGTH_LONG);
        toast.show();
    }

    public void vkClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/timmyyeol"));
        startActivity(browserIntent);
    }

    public void playmarketClick(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=5729200263163973710"));
        startActivity(browserIntent);
    }
}
