package com.example.andreas.slashy;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    private GameView gv;
    private Button btn1;
    private Button btn2;
    private Bitmap bmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GameView)findViewById(R.id.gv);
        btn1=(Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        btn1.setOnClickListener(new ButtonLeft());
        btn2.setOnClickListener(new ButtonRight());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private class ButtonRight implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            gv.onDraw(bmp= BitmapFactory.decodeResource(getResources(), R.drawable.kn_right));
        }
    }

    private class ButtonLeft implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            gv.onDraw(bmp= BitmapFactory.decodeResource(getResources(), R.drawable.kn_left));
        }
    }
}
