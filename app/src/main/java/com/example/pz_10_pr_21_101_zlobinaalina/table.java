package com.example.pz_10_pr_21_101_zlobinaalina;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pz_10_pr_21_101_zlobinaalina.databinding.ActivityTableBinding;

public class table extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityTableBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTableBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       // View vi = findViewById(R.id.view2);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.view2){
            //Intent intent = new Intent(this, BorshActivity.class);
            setContentView(R.layout.activity_borsh);
        }
        if (v.getId()== R.id.view3){
            //Intent intent = new Intent(this, ActivityMain.class);
            setContentView(R.layout.activity_blinchiki);
        }
        if (v.getId()== R.id.view4){
           // Intent intent = new Intent(this, ActivityMain.class);
            setContentView(R.layout.activity_spagetti);
        }
        if (v.getId()== R.id.view5){
          //  Intent intent = new Intent(this, ActivityMain.class);
            setContentView(R.layout.activity_cesar);
        }
        if (v.getId()== R.id.view6){
          //  Intent intent = new Intent(this, ActivityMain.class);
            setContentView(R.layout.activity_milkshakei);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

}