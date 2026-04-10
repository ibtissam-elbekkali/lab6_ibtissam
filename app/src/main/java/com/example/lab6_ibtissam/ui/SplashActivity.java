package com.example.lab6_ibtissam.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lab6_ibtissam.R;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main); // Utilisation de activity_main comme splash screen

        ImageView logo = findViewById(R.id.logo);
        if (logo != null) {
            AlphaAnimation animation = new AlphaAnimation(0.0f, 1.0f);
            animation.setDuration(1500);
            logo.startAnimation(animation);
        }

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ignored) {}
            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            finish();
        });
        t.start();
    }
}