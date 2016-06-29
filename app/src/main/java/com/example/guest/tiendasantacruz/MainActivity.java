package com.example.guest.tiendasantacruz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Typeface;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mAppNameTextView;
    @Bind(R.id.menuButton) Button mMenuButton;
    @Bind(R.id.panButton) Button mPanButton;
    @Bind(R.id.comeButton) Button mComeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mAppNameTextView = (TextView) findViewById(R.id.appNameTextView);
        Typeface Pacifico = Typeface.createFromAsset(getAssets(), "fonts/Pacifico.ttf");
        mAppNameTextView.setTypeface(Pacifico);

        mMenuButton.setOnClickListener(this);
        mPanButton.setOnClickListener(this);
        mComeButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view == mMenuButton) {
            Intent intent = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(intent);
        }
        if(view == mPanButton) {
            Intent intent = new Intent(MainActivity.this, PanActivity.class);
            startActivity(intent);
        }
        if(view == mComeButton) {
            Intent intent = new Intent(MainActivity.this, ComeActivity.class);
            startActivity(intent);
        }
    }
}