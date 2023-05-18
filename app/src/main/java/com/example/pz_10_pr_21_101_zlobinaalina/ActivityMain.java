package com.example.pz_10_pr_21_101_zlobinaalina;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pz_10_pr_21_101_zlobinaalina.databinding.ActivityMainBinding;

public class ActivityMain extends Activity implements View.OnClickListener {

    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mTextView = binding.text;
        Button btn1 = findViewById(R.id.button);
    }

    @Override
    public void onClick(View vi) {
        if (vi.getId()== R.id.button){
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