package com.hihi.game;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Long on 23/3/2017.
 */

public class Cloud {
    private GamePanel gamePanel;
    private Bitmap bitmap;
    private int x, y;

    public Cloud(GamePanel gamePanel, Bitmap bitmap, int x, int y) {
        this.gamePanel = gamePanel;
        this.bitmap = bitmap;
        this.x = x;
        this.y = y;
    }

    public void update() {
        x -= gamePanel.getSpeed();
    }

    public void draw(Canvas canvas) {
        update();
        canvas.drawBitmap(bitmap, x, y, null);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
