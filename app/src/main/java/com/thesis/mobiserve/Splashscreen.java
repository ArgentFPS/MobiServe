package com.thesis.mobiserve;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splashscreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      new Handler().postDelayed(new Runnable() {
          @Override
          public void run() {
              startActivity(new Intent(Splashscreen.this, Landing_Page.class));
              finish();
          }
      },2000);
    }


}
