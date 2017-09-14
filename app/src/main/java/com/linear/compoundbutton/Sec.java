package com.linear.compoundbutton;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Sec extends AppCompatActivity {
    TextView tvResult2;
    RadioGroup radioGroup;
    RadioButton radMan,radWoman;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        tvResult2 = (TextView) findViewById(R.id.result_txt2);
        radioGroup = (RadioGroup) findViewById(R.id.group);
        radMan = (RadioButton) findViewById(R.id.rad_man);
        radWoman = (RadioButton) findViewById(R.id.rad_woman);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.rad_man:
                        tvResult2.setText("You are a Man ?");
                        break;

                    case R.id.rad_woman:
                        tvResult2.setText("You are a Woman ?");
                        break;
                }
            }
        });

        checkBox = (CheckBox) findViewById(R.id.checkbox);
        /*checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    tvResult2.setText("You Checked the Box");
                }else {
                    tvResult2.setText("You Unchecked the Box");
                }
            }
        });*/

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                    tvResult2.setText("You Checked the Box");
                }else{
                    tvResult2.setText("You Unchecked the Box");
                }
            }
        });

    }

}
