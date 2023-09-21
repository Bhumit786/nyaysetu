package com.example.nyaysetu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView logoimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontscreen);
        logoimage = findViewById(R.id.logoimage);
        logoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // TODO: Your application init goes here.
                Intent mInHome = new Intent(MainActivity.this, admin_login.class);
                MainActivity.this.startActivity(mInHome);
                MainActivity.this.finish();
            }
        }, 3000);
    }
    public void openNewActivity(){
        Intent intent = new Intent(this,admin_login.class);
        startActivity(intent);
    }
}
