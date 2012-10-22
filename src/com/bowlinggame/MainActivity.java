package com.bowlinggame;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	Button buttonCalc; 
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonCalc=(Button)findViewById(R.id.buttonCalc);  
        buttonCalc.setOnClickListener(new ButtonClick()); 
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    //创建一个类，来响应OnClickListener  
    class ButtonClick implements OnClickListener  
    {      	
        public void onClick(View v)  
        {  
        	Spinner spinnerPin1_1, spinnerPin1_2, spinnerPin2_1, spinnerPin2_2, spinnerPin3_1, spinnerPin3_2, spinnerPin4_1, spinnerPin4_2, spinnerPin5_1, spinnerPin5_2, spinnerPin6_1, spinnerPin6_2, spinnerPin7_1, spinnerPin7_2, spinnerPin8_1, spinnerPin8_2, spinnerPin9_1, spinnerPin9_2, spinnerPin10_1, spinnerPin10_2, spinnerPin10_3;
            
        	spinnerPin1_1 = (Spinner)findViewById(R.id.spinnerPin1_1);
            spinnerPin1_2 = (Spinner)findViewById(R.id.spinnerPin1_2);
            spinnerPin2_1 = (Spinner)findViewById(R.id.spinnerPin2_1);
            spinnerPin2_2 = (Spinner)findViewById(R.id.spinnerPin2_2);
            spinnerPin3_1 = (Spinner)findViewById(R.id.spinnerPin3_1);
            spinnerPin3_2 = (Spinner)findViewById(R.id.spinnerPin3_2);
            spinnerPin4_1 = (Spinner)findViewById(R.id.spinnerPin4_1);
            spinnerPin4_2 = (Spinner)findViewById(R.id.spinnerPin4_2);
            spinnerPin5_1 = (Spinner)findViewById(R.id.spinnerPin5_1);
            spinnerPin5_2 = (Spinner)findViewById(R.id.spinnerPin5_2);
            spinnerPin6_1 = (Spinner)findViewById(R.id.spinnerPin6_1);
            spinnerPin6_2 = (Spinner)findViewById(R.id.spinnerPin6_2);
            spinnerPin7_1 = (Spinner)findViewById(R.id.spinnerPin7_1);
            spinnerPin7_2 = (Spinner)findViewById(R.id.spinnerPin7_2);
            spinnerPin8_1 = (Spinner)findViewById(R.id.spinnerPin8_1);
            spinnerPin8_2 = (Spinner)findViewById(R.id.spinnerPin8_2);
            spinnerPin9_1 = (Spinner)findViewById(R.id.spinnerPin9_1);
            spinnerPin9_2 = (Spinner)findViewById(R.id.spinnerPin9_2);   
            spinnerPin10_1 = (Spinner)findViewById(R.id.spinnerPin10_1);
            spinnerPin10_2 = (Spinner)findViewById(R.id.spinnerPin10_2);  
            spinnerPin10_3 = (Spinner)findViewById(R.id.spinnerPin10_3); 
            
            Spinner spinners[] = {spinnerPin1_1, spinnerPin1_2, spinnerPin2_1, spinnerPin2_2, spinnerPin3_1, spinnerPin3_2, spinnerPin4_1, spinnerPin4_2, spinnerPin5_1, spinnerPin5_2, spinnerPin6_1, spinnerPin6_2, spinnerPin7_1, spinnerPin7_2, spinnerPin8_1, spinnerPin8_2, spinnerPin9_1, spinnerPin9_2, spinnerPin10_1, spinnerPin10_2, spinnerPin10_3};            
            
            switch (v.getId()) {  
            case R.id.buttonCalc:                 	
            	Game g = new Game();
            	for (int i=0; i<spinners.length;i++)
            	{
            		if (i%2==1 && i<18 && spinners[i-1].getSelectedItemPosition()==10) continue;
            		g.add(spinners[i].getSelectedItemPosition());
            	}
            	TextView tv = (TextView)findViewById(R.id.valueFinalScore);  
            	tv.setText(Integer.toString(g.score())); 
                break;  
            default:  
                break;
            }  
        }         
    }        
}
