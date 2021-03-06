package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
    }


    private Paint paint1 = new Paint();
    private Paint paint2 = new Paint();
    private Paint paint3 = new Paint();
    private Paint paint4 = new Paint();

    private void init() {

        paint1.setStyle(Paint.Style.FILL);
        paint1.setAntiAlias(true);

        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);

        paint3.setAntiAlias(true);
        paint3.setColor(Color.BLUE);

        paint4.setAntiAlias(true);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(20);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        canvas.drawCircle(200,200,150,paint1);

        canvas.drawCircle(620,200,150,paint2);

        canvas.drawCircle(200,600,150,paint3);

        canvas.drawCircle(600,600,150,paint4);


    }
}
