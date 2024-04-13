package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvInfo = (TextView)findViewById(R.id.textView);
        etInput = (EditText)findViewById(R.id.editTextNumber);
        bControl = (Button)findViewById(R.id.button);

        number = generator.nextInt(99) + 1;
        status = 0;
    }
    TextView tvInfo;
    EditText etInput;
    Button bControl;
    int number;
    int status;
    Random generator = new Random(0);
    public void onClick(View v) {
        int input = 0;
        if(status == 0){
            try {
                input = Integer.parseInt(etInput.getText().toString());
            } catch (NumberFormatException e) {
                tvInfo.setText(getResources().getString(R.string.error));
            }
            if ((input < 1) || (input > 100)) {
                tvInfo.setText(getResources().getString(R.string.error));
            } else {
                if (input == number) {
                    tvInfo.setText(getResources().getString(R.string.hit));
                    status = 1;
                    bControl.setText(getResources().getString(R.string.play_more));
                } else {
                    if (input < number) {
                        tvInfo.setText(getResources().getString(R.string.behind));
                        etInput.setText("");
                    } else {
                        tvInfo.setText(getResources().getString(R.string.ahead));
                        etInput.setText("");
                    }
                }
            }
        }
        else{
            status = 0;
            number = generator.nextInt(99) + 1;
            bControl.setText(getResources().getString(R.string.input_value));
            etInput.setText("");
            tvInfo.setText(getResources().getString(R.string.try_to_guess));
        }
    }
}