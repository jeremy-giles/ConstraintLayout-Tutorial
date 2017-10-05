package com.jeremy.giles.constraintlayouttutorial;

import android.content.Intent;
import android.support.constraint.Group;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    Group gp_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gp_login = findViewById(R.id.gp_login);

        ImageView bt_start = findViewById(R.id.bt_start);
        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, LevelActivity.class));
            }
        });

        ImageView bt_select = findViewById(R.id.bt_select);
        bt_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gp_login.setVisibility(
                        View.VISIBLE == gp_login.getVisibility() ? View.GONE : View.VISIBLE );
            }
        });
    }
}
