package com.example.yubaraj.lms.librarian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.yubaraj.lms.MainActivity;
import com.example.yubaraj.lms.R;

public class Dashboard extends AppCompatActivity {

    Button books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        books=(Button)findViewById(R.id.btn_books);
        books.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent goToBooks= new Intent(Dashboard.this, MainActivity.class);
                        startActivity(goToBooks);
                    }
                }
        );
    }
}
