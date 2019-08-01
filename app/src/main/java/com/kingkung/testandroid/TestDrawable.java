package com.kingkung.testandroid;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.ColorInt;

public class TestDrawable extends BitmapDrawable {

    public TestDrawable() {
        super();
    }

//    public TestDrawable(@ColorInt int color) {
//        super(color);
//    }

    public TestDrawable(Bitmap bitmap) {
        super(bitmap);
    }


    @Override
    public void draw(Canvas canvas) {
        ColorMatrix colorMatrix = new ColorMatrix(new float[]{
                0.33F, 0.59F, 0.11F, 0, 0,
                0.33F, 0.59F, 0.11F, 0, 0,
                0.33F, 0.59F, 0.11F, 0, 0,
                0, 0, 0, 1, 0,
        });
//        setColorFilter(Color.RED, PorterDuff.Mode.SRC);
        setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        super.draw(canvas);
    }
}
