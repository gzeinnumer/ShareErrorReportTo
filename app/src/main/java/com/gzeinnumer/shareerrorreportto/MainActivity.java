package com.gzeinnumer.shareerrorreportto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.gzeinnumer.sert.ShareErrorDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String error = "error";
        new ShareErrorDialog(getSupportFragmentManager()).builder().setErrorMessage(error).show();
    }
}