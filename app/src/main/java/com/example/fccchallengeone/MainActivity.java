package com.example.fccchallengeone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        TextView txtFirst = findViewById(R.id.txtFirstName);
        TextView txtLast = findViewById(R.id.txtLastName);
        TextView txtUrEmail = findViewById(R.id.txtEmail);

        EditText edtFirst = findViewById(R.id.edtFirstName);
        EditText edtLast = findViewById(R.id.edtLastName);
        EditText edtEmail = findViewById(R.id.edtEmail);


        txtFirst.setText("First Name: " + edtFirst.getText().toString());
        txtLast.setText( "Last Name: " + edtLast.getText().toString());
        txtUrEmail.setText("Email: "+ edtEmail.getText().toString());

    }

}