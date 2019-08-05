package com.example.a1795515.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   CheckBox ok_Mango,ok_Apple;
    Button btn_sub;
    RadioGroup rg_gen;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok_Mango= findViewById(R.id.ok_Mango);
        ok_Apple= findViewById(R.id.ok_Apple);
        btn_sub = findViewById(R.id.btn_sub);
        rg_gen = findViewById(R.id.rg_gen);


        ((View) btn_sub).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ok_Mango.isChecked() && !ok_Mango.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Only Mango Checked!", Toast.LENGTH_LONG).show();
                } else if (ok_Apple.isChecked()){
                    Toast.makeText(getApplicationContext(), "Only Apple Checked!", Toast.LENGTH_LONG).show();
                } else if (ok_Mango.isChecked())  {
                    Toast.makeText(getApplicationContext(), "apple and grapes checked!", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Nothing is checked!", Toast.LENGTH_LONG).show();
                }
                rg_gen.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int i) {
                        radioButton = findViewById(i);

                        Toast.makeText(getApplicationContext(), radioButton.getText(),Toast.LENGTH_LONG).show();



                    }
                });
            }

    });
    }
}