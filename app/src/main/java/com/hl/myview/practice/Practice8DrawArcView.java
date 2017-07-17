package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    Paint paint1 = new Paint();
    Paint paint2 = new Paint();
    RectF rectF ;
    private void init() {

        paint1.setAntiAlias(true);
        paint1.setColor(Color.BLUE);

        paint2.setStyle(Paint.Style.STROKE);

        rectF  = new RectF(300,200,700,450);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        // 1： 代表一个矩形 也就代表一个椭圆（圆）
        // 2： 从哪里开始  X正方向表示0度  -10 代表逆时针防线10度开始 15代表顺时针方向开始15度
        // 3： 度数的跨度  负代表逆时针旋转多少  正代表顺时针方向多少
        // 4： 圆心相关 true代表有圆心的扇形  false代表没圆心的扇形
        // 5： paint2.setStyle 决定了是否填充


        canvas.drawArc(rectF,-10,-100,true,paint1);

        canvas.drawArc(rectF,15,160,false,paint1);

        canvas.drawArc(rectF,190,40,false,paint2);

//        canvas.drawArc(100,200,400,400,0,90,true,paint);
    }
}
