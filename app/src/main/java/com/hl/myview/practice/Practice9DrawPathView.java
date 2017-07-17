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

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init();
    }

    Paint paint = new Paint();
    Path path = new Path(); // 初始化 Path 对象

    RectF rectF1 = new RectF(200, 200, 400, 400);
    RectF rectF2 = new RectF(400, 200, 600, 400);

    RectF rectF3 = new RectF(100, 100, 300, 300);

    private void init() {


//        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        path.addArc(rectF1, -225, 225); // 心的左半部分的上边
////        path.arcTo(rectF1, -225, 225);  // 与上面的效果是一样的
//
        path.arcTo(rectF2,-180, 225, false);  // 心的右半部分的上边
//
        path.lineTo(400, 542);  // 从右边的点连到心下面的那个点  只所有不要执行close 是应为 paint的style为fill的  里面就全部都会填充起来
                                // 如果是stroke的 那么就不会是一个空的心形 右边的直线没有连接 这时候应该执行一次close 方法
        //                      当然也可以lineTo到起始的点  但是起点的那个扇形的左边点找到有点难 所以还不如直接close
//        path.close();


//        paint.setStyle(Paint.Style.STROKE);
//        path.lineTo(100, 100);
//        path.arcTo(rectF3, -90, 90, false); // 强制移动到弧形起点（无痕迹）
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        canvas.drawPath(path, paint);
    }
}
