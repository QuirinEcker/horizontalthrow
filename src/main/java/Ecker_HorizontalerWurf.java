import processing.core.PApplet;

public class Ecker_HorizontalerWurf extends PApplet {

    private final int v = 2000;
    private final int g = 10000;
    private double t = 0;
    private int x;
    private int y;

    public static void main(String[] args) {
        PApplet.main("Ecker_HorizontalerWurf", args);
    }

    public void settings() {
        size(800, 470);
    }

    public void draw() {
        if (timeIsOver()) {
            reset();
        } else {
            calculateNewPosition();
            drawNewPosition();
        }
    }

    private boolean timeIsOver() {
        return t > 0.3;
    }

    private void reset() {
        t = 0;
        background(209);
    }

    private void calculateNewPosition() {
        x = (int) (v * t + 10);
        y = (int) (0.5 * g * t * t + 10);
        t += 0.01;
    }

    private void drawNewPosition() {
        ellipse(x, y, 20, 20);
        delay(100);
    }
}
