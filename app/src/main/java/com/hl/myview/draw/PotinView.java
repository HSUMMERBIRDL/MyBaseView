package com.hl.myview.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * des:
 * Created by HL
 * on 2017-07-13.
 */

public class PotinView extends View{


    private Paint paint = new Paint();

    public PotinView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    public PotinView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(30);
        paint.setStrokeCap(Paint.Cap.ROUND);
//        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawPoint(30,30,paint);

    }
}
