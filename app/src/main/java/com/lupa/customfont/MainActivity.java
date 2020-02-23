package com.lupa.customfont;

import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView label_02;
    Button btn_02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label_02 = findViewById(R.id.label_02);
        btn_02 = findViewById(R.id.btn_02);

        Typeface typeface;

        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.O){
            //Nový způsob nastavení fontu pomocí Support Library
            //typeface = ResourcesCompat.getFont(this, R.font.font_02);

            //Starý způsob nastavení fontu
            typeface = Typeface.createFromAsset(getAssets(), "fonts/Flatform_Light.otf");
        } else{
            typeface = getResources().getFont(R.font.font_02);
        }

        label_02.setTypeface(typeface);
        btn_02.setTypeface(typeface);

    }
}
