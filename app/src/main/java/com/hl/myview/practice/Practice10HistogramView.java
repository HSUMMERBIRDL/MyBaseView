package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }



    Paint paint = new Paint();
    Path path = new Path();

    Paint paint1 = new Paint();
    Paint paintText = new Paint();

    RectF rectF1 = new RectF();
    RectF rectF2 = new RectF();
    RectF rectF3 = new RectF();
    RectF rectF4 = new RectF();
    RectF rectF5 = new RectF();
    RectF rectF6 = new RectF();
    RectF rectF7 = new RectF();

    private void init() {

        paint.setStyle(Paint.Style.STROKE);


        // 画坐标线
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
        paint.setColor(Color.WHITE);
        path.moveTo(50,40);
        path.lineTo(50,500);
        path.lineTo(1050,500);


        paint1.setColor(Color.GREEN);
        paint1.setARGB(88,152,167,85);
        rectF1.set(35+50,        500-40, 35+50 + 100,      500);
        rectF2.set(50+35 + 135,  500-80, 50+35 + 135+100,  500);
        rectF3.set(35+50 + 135*2,500-100,35+50 + 135*2+100,500);
        rectF4.set(35+50 + 135*3,500-300,35+50 + 135*3+100,500);
        rectF5.set(35+50 + 135*4,500-400,35+50 + 135*4+100,500);
        rectF6.set(35+50 + 135*5,500-450,35+50 + 135*5+100,500);
        rectF7.set(35+50 + 135*6,500-180,35+50 + 135*6+100,500);


        paintText.setColor(Color.WHITE);
        paintText.setTextSize(20);
        paintText.setStrokeWidth(10);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        canvas.drawPath(path, paint);
        canvas.drawRect(rectF1,paint1);
        canvas.drawRect(rectF2,paint1);
        canvas.drawRect(rectF3,paint1);
        canvas.drawRect(rectF4,paint1);
        canvas.drawRect(rectF5,paint1);
        canvas.drawRect(rectF6,paint1);
        canvas.drawRect(rectF7,paint1);

        canvas.drawText("Froyo",35+50+30,530,paintText);
        canvas.drawText("GB",50+35 + 135+30,530,paintText);
        canvas.drawText("ICS",35+50 + 135*2+30,530,paintText);
        canvas.drawText("JB",35+50 + 135*3+30,530,paintText);
        canvas.drawText("KitKat",35+50 + 135*4+30,530,paintText);
        canvas.drawText("L",35+50 + 135*5+30,530,paintText);
        canvas.drawText("M",35+50 + 135*6+30,530,paintText);
    }
}
