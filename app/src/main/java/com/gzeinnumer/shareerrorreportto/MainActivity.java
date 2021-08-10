package com.gzeinnumer.shareerrorreportto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gzeinnumer.sert.ShareErrorDialog;

import java.io.IOException;
import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String error = "error";
        new ShareErrorDialog(getSupportFragmentManager()).setErrorMessage(error).show();
    }
}