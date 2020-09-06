package com.astra.melkovhw141;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final String LOG = "LOG";

    private TextView txtLog;
    private SimpleDateFormat format;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        log("onCreate. Bundle: " + (savedInstanceState == null ? "null" : "not null"));
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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        log("onKeyDown: " + keyCode);

        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        super.onKeyLongPress(keyCode, event);
        log("onKeyLongPress: " + keyCode);

        return true;
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        txtLog.append("---\n");
        txtLog.append(savedInstanceState.getString(LOG));
        txtLog.append("---\n");

        log("onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString(LOG, txtLog.getText().toString());
        super.onSaveInstanceState(bundle);

        log("onSaveInstanceState");
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        log("onBackPressed");
    }

    private void log(String event) {
        String record = String.format("%s: %s\n", format.format(new Date()), event);

        txtLog.append(record);
        Log.i("Lifecycle", record);
    }

    private void init() {
        txtLog = findViewById(R.id.txt_log);

        Button btnNew = findViewById(R.id.btn_start_new_activity);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        format = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss", Locale.getDefault());
    }
}