package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    Paint paint1 = new Paint();
    Paint paint2 = new Paint();

    private void init() {

        paint1.setStrokeWidth(80);
        paint1.setAntiAlias(true);
        paint1.setStrokeCap(Paint.Cap.ROUND);

        paint2.setStrokeWidth(60);
        paint2.setStrokeCap(Paint.Cap.SQUARE);


    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        canvas.drawPoint(300,300,paint1);

        canvas.drawPoint(600,300,paint2);
    }
}
