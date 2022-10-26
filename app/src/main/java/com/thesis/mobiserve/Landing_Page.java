package com.thesis.mobiserve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Landing_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);

        findViewById(R.id.getstarted).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent packageContext;
                Intent loginIntent = new Intent(Landing_Page.this, loginpage.class );
                startActivity(loginIntent);
                finish();
            }
        });
    }
}