package com.example.dialog;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity  extends FragmentActivity
        implements DialogFragment.NoticeDialogListener {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv= (TextView) findViewById(R.id.texto);
    }

    public void verDialog(View view) {
        androidx.fragment.app.DialogFragment dialog = new DialogFragment();
        dialog.show(getSupportFragmentManager(), "NoticeDialogFragment");
    }

    @Override
    public void onDialogPositiveClick(androidx.fragment.app.DialogFragment dialog) {
        // User touched the dialog's positive button
        tv.setText("Has pitjat OK");

    }

    @Override
    public void onDialogNegativeClick(androidx.fragment.app.DialogFragment dialog) {
        tv.setText("FAIL!");

    }





}