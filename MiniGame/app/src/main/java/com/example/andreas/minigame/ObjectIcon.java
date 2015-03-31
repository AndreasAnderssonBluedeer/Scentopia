package com.example.andreas.minigame;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.io.IOException;

/**
 * Created by Andreas on 2015-03-24.
 */
public class ObjectIcon extends ImageButton{



    private GameController controller;
    private Drawable drawable;

    public ObjectIcon(Context context,GameController controller,Drawable drawable) {
        super(context);        //TestKonstruktor


        this.controller = controller;
        this.drawable = drawable;

        setBackground(drawable);       //Sätt bakgrunden/bilden

        setOnClickListener(new ButtonListener());
    }


    public void remove(){

        controller.removeObject(this);
        controller.addPoints();
    }

   private class ButtonListener implements View.OnClickListener {   //KlickLyssnare

        @Override
        public void onClick(View v) {
        remove();    //Ta bort från skärmen.
        }
    };
}
