
package ru.dvimer.lesson.Figurs;
/**
 * Created by Алексей on 23.01.2016.
 */
public class Horse extends Figure {

    public Horse(int x, int y) {
        super(x, y);
    }

    @Override
    public void setPosition(int x, int y) {
        if (y - this.y == 2 && x - this.x == 1 ||
                y - this.y == 2 && x - this.x == -1 ||
                y - this.y == -2 && x - this.x == -1 ||
                y - this.y == -2 && x - this.x == 1 ||
                y - this.y == 1 && x - this.x == 2 ||
                y - this.y == 1 && x - this.x == -2 ||
                y - this.y == -1 && x - this.x == 2 ||
                y - this.y == -1 && x - this.x == -2) {
            this.y = y;
            this.x = x;
        }
    }
}
