package com.hl.myview.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    Paint paint1 = new Paint();
    Paint paint2 = new Paint();
    Paint paint3 = new Paint();

    private void init() {

        paint2.setStyle(Paint.Style.STROKE);

    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形

        canvas.drawRect(100,50,250,200,paint1);

        canvas.drawRect(300,50,450,200,paint2);
    }
}
