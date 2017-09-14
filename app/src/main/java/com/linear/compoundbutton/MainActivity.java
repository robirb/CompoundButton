package com.linear.compoundbutton;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioGroup radGroup;
    private RadioButton radMango,radApple;
    private TextView tvResult;
    private Button nextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvResult = (TextView) findViewById(R.id.result_txt);

        radGroup = (RadioGroup) findViewById(R.id.group);
        radGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
               /* Log.d("HHH",i+"");
                Log.d("HHH",R.id.rad_mango+"");*/

               setText(i);
            }
        });

        radMango = (RadioButton) findViewById(R.id.rad_mango);
        radApple = (RadioButton) findViewById(R.id.rad_apple);
        nextPage = (Button) findViewById(R.id.next);
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),Sec.class);
                startActivity(intent);

            }
        });
    }

    private void setText(int i) {
        switch (i){
            case R.id.rad_mango:
                tvResult.setText("You Choose Mango!!!");
                break;

            case R.id.rad_apple:
                tvResult.setText("You Choose Apple!!!");
                break;
        }
    }

}
