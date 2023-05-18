package com.example.pz_10_pr_21_101_zlobinaalina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pz_10_pr_21_101_zlobinaalina.databinding.ActivityBorshBinding;

public class BorshActivity extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityBorshBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityBorshBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ImageButton ibtn = findViewById(R.id.imageButton);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.imageButton){
            Intent intent = new Intent(this, table.class);
            startActivity(intent);
        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(), "Невозможно выполнить!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}