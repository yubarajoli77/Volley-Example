package com.example.yubaraj.lms.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yubaraj.lms.R;
import com.example.yubaraj.lms.librarian.Dashboard;

public class LoginActivity extends AppCompatActivity {
    Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signIn=(Button)findViewById(R.id.btn_signIn);
        signIn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent goDash = new Intent(LoginActivity.this, Dashboard.class);
                        startActivity(goDash);
                    }
                }
        );
    }

}
