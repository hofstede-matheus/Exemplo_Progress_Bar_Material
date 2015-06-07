package com.matheushofstede.exemploprogressbarmaterial;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    ImageView arrow, progress;
    int pheight = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrow = (ImageView)findViewById(R.id.arrow);
        progress = (ImageView)findViewById(R.id.progress);
        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pheight++;
                progress.requestLayout();
                progress.getLayoutParams().height = pheight;
                Log.i("HEIGHT", pheight + "");

            }
        });
    }


}
