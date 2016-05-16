package com.example.bijay.myapp_showhide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn= (Button) findViewById(R.id.button);
        iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.download);
        btn.setText("Hide");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (iv.getVisibility()==View.VISIBLE){
                    iv.setVisibility(View.INVISIBLE);
                    btn.setText("Show");
                }
                else{
                    iv.setVisibility(View.VISIBLE);
                    btn.setText("Hide");
                }

            }
        });
    }
}
