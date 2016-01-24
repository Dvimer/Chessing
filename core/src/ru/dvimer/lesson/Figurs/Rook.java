package ru.dvimer.lesson.Figurs;

/**
 * Created by Алексей on 23.01.2016.
 */
public class Rook extends Figure {



    public Rook(int x, int y) {
        super(x, y);

    }

    @Override
    public void setPosition(int x, int y) {
        if (y - this.y == x - this.x || -(y - this.y) == (x - this.x)) {
            this.y = y;
            this.x = x;
        }
    }
}
