package com.astra.melkovhw141;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private TextView txtLog;
    private SimpleDateFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        log("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        log("onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        log("onPostResume");
    }

    private void log(String event) {
        txtLog.append(String.format("%s: %s\n", format.format(new Date()), event));
    }

    private void init() {
        txtLog = findViewById(R.id.log);

        format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss", Locale.getDefault());
    }
}