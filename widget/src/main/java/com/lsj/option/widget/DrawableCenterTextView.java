package com.lsj.option.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/**
 * 与文本一起居中显示
 */
public class DrawableCenterTextView extends android.support.v7.widget.AppCompatTextView {

    public DrawableCenterTextView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public DrawableCenterTextView(Context context, AttributeSet attrs,
                                  int defStyle) {
        super(context, attrs, defStyle);
    }

    public DrawableCenterTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        Drawable[] drawables = getCompoundDrawables();
        if (drawables != null) {
            Drawable drawableLeft = drawables[0];
            if (drawableLeft != null) {

                float textWidth = getPaint().measureText(getText().toString());
                int drawablePadding = getCompoundDrawablePadding();
                int drawableWidth = 0;
                drawableWidth = drawableLeft.getIntrinsicWidth();
                float bodyWidth = textWidth + drawableWidth + drawablePadding;
                setPadding(0, 0, (int) (getWidth() - bodyWidth), 0);
                canvas.translate((getWidth() - bodyWidth) / 2, 0);
            }
        }

        super.onDraw(canvas);
    }
}
