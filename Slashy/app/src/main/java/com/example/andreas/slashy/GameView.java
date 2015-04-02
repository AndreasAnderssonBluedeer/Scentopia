package com.example.andreas.slashy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by Andreas on 2015-04-02.
 */
     public class GameView extends SurfaceView {
        private Canvas c;
        private Bitmap bm;
        private SurfaceHolder holder;
    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);

            holder = getHolder();
            holder.addCallback(new SurfaceHolder.Callback() {

                @Override
                public void surfaceDestroyed(SurfaceHolder holder) {
                }

                @Override
                public void surfaceCreated(SurfaceHolder holder) {
                    c = holder.lockCanvas(null);
                    onDraw(c);             //Draw()?
                    holder.unlockCanvasAndPost(c);
                }

                @Override
                public void surfaceChanged(SurfaceHolder holder, int format,
                                           int width, int height) {
                }
            });
            bm = BitmapFactory.decodeResource(getResources(), R.drawable.kn_n);
        }



    @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.BLACK);
            canvas.drawBitmap(bm, 100, 100, null);
        }
        protected void onDraw(Bitmap bmp){
            holder.lockCanvas(null);
            c.drawColor(Color.CYAN);
            c.drawBitmap(bmp,200,200,null);
            holder.unlockCanvasAndPost(c);
        }
    }

