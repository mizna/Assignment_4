package com.baabtra.mizna.assignment_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout one,two,three,four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=(RelativeLayout)findViewById(R.id.viewhappy);
        two=(RelativeLayout)findViewById(R.id.viewsad);
        three=(RelativeLayout)findViewById(R.id.viewloved);
        four=(RelativeLayout)findViewById(R.id.viewterrible);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);
    }
    public void onButtonhappyclicked(View v){
        one.setVisibility(View.VISIBLE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);
    }
    public void onButtonsadclicked(View v){
        two.setVisibility(View.VISIBLE);
        one.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);
    }
    public void onButtonterribleclicked(View v){
        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.VISIBLE);
    }
    public void onButtonlovedclicked(View v){
        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.VISIBLE);
        four.setVisibility(View.GONE);
    }
}
