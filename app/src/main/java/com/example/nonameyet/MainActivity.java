package com.example.nonameyet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.nonameyet.R.layout.activity_login;
import static com.example.nonameyet.R.layout.activity_main;
import static com.example.nonameyet.R.layout.activity_register;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        boolean registered = true;
        boolean auto_login = false;
        // Check if user registered...

        super.onCreate(savedInstanceState);
        if (!auto_login) {
            if (registered)
                setContentView(activity_login);
            else
                setContentView(activity_register);
        } else
            setContentView(activity_main);
    }

    public boolean doRegister(View view) {
        EditText edt_name = (EditText) findViewById(R.id.reg_edt_name);
        Spinner sed_gender = (Spinner) findViewById(R.id.reg_sed_gender);
        EditText edt_uname = (EditText) findViewById(R.id.reg_edt_uname);
        EditText edt_password = (EditText) findViewById(R.id.reg_edt_password);
        EditText edt_repassword = (EditText) findViewById(R.id.reg_edt_repassword);

        if (edt_name.getText().toString().equals(""))
            edt_name.setError("This field is required.");
        if (edt_uname.getText().toString().equals(""))
            edt_uname.setError("This field is required.");
        if (edt_password.getText().toString().equals(""))
            edt_password.setError("This field is required.");
        if (edt_repassword.getText().toString().equals(""))
            edt_repassword.setError("This field is required.");
        if (!edt_repassword.getText().toString().equals(edt_password.getText().toString()))
            edt_repassword.setError("Passwords do not match.");

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        return (true);
    }

    public void doLogin(View view) {
        EditText edt_name = (EditText) findViewById(R.id.log_edt_uname);
        EditText edt_password = (EditText) findViewById(R.id.log_edt_password);


    }
}
