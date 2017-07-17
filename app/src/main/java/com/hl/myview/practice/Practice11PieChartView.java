package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }



//    Path path = new Path();
//    Paint paint = new Paint();

    Paint paint1 = new Paint();
    Paint paint2 = new Paint();
    Paint paint3 = new Paint();
    Paint paint4 = new Paint();
    Paint paint5 = new Paint();
    Paint paint6 = new Paint();
    Paint paint7 = new Paint();


    RectF rectF1 = new RectF();
    RectF rectF2 = new RectF();
    RectF rectF3 = new RectF();
    RectF rectF4 = new RectF();
    RectF rectF5 = new RectF();
    RectF rectF6 = new RectF();
    RectF rectF7 = new RectF();


    int  diameter = 600; // 直径

    private void init() {
        // 画坐标线

        paint1.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint3.setAntiAlias(true);
        paint4.setAntiAlias(true);
        paint5.setAntiAlias(true);
        paint6.setAntiAlias(true);
        paint7.setAntiAlias(true);

        paint1.setColor(Color.BLUE);
        paint2.setColor(Color.CYAN);
        paint3.setColor(Color.GREEN);
        paint4.setColor(Color.MAGENTA);
        paint5.setColor(Color.WHITE);
        paint6.setColor(Color.YELLOW);
        paint7.setColor(Color.RED);

        rectF1.set(300,100,300+diameter,100 + diameter);
    }


    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图


        canvas.drawArc(rectF1,0,10,true,paint1);
        canvas.drawArc(rectF1,10,20,true,paint2);
        canvas.drawArc(rectF1,30,30,true,paint3);
        canvas.drawArc(rectF1,60,60,true,paint4);
        canvas.drawArc(rectF1,120,75,true,paint5);

        canvas.translate(-10,-10);
        canvas.drawArc(rectF1,195,100,true,paint6);
        canvas.restore();

        canvas.drawArc(rectF1,295,65,true,paint7);


    }
}
