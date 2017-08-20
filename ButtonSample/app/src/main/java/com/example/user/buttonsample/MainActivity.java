package com.example.user.buttonsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mToastButton = null;
    private EditText mUserNameEditText = null;
    private EditText mPasswordEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToastButton = (Button) findViewById(R.id.login);
        mUserNameEditText = (EditText) findViewById(R.id.name);
        mPasswordEditText = (EditText) findViewById(R.id.pass);

        mToastButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Welcome " + mUserNameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
