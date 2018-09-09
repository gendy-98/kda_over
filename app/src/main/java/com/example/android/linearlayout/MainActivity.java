package com.example.android.simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.linearlayout.R;

public class MainActivity extends AppCompatActivity {
    public float mNum1=0;
    public float mNum2=0;
    public float mAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v)
    {
        mAns= mNum1+mNum2;
        display_ans(mAns,"Addition ");
    }
    public void subtract(View v)
    {
        mAns= mNum1-mNum2;
        display_ans(mAns,"Subtraction ");
    }
    public void multi(View v)
    {
        mAns= mNum1*mNum2;
        display_ans(mAns,"multiplication ");
    }
    public void divid(View v)
    {
        mAns= mNum1/mNum2;
        display_ans(mAns,"division ");
    }




    public void incNum1(View v)
    {
        mNum1+=1;
        display_num1((int)mNum1);
    }
    public void decNum1(View v)
    {
        mNum1-=1;
        display_num1((int)mNum1);
    }
    public void incNum2(View v)
    {
        mNum2+=1;
        display_num2((int)mNum2);
    }
    public void decNum2(View v)
    {
        mNum2-=1;
        display_num2((int)mNum2);
    }

    private void display_ans(float result,String operation)
    {
        TextView resultTextView =findViewById(R.id.result_id);
        resultTextView.setText(operation+result);
    }
    private void display_num1(int number)
    {
        TextView firstNumber = findViewById(R.id.first_num);
        firstNumber.setText(""+number);

    }
    private void display_num2(int number)
    {
        TextView secondNumber = findViewById(R.id.sec_num);
        secondNumber.setText(""+number);

    }
}
