package Lesson8.studentbrowser;

import java.awt.Color;
import java.awt.Graphics;

public class Dice {

    private int num;
    boolean on = true;
    private Graphics g;

    public Dice(Graphics g) {
        this.g = g;
        roll();
    }

    public void disable() {
        on = false;
    }

    public void roll() {
        if (on == true) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println(num);
            draw();
        }
    }

    public int getNum() {
        return num;
    }

    private void dot1() {
        g.fillOval(30, 30, 25, 25);
    }

    private void dot2() {
        g.fillOval(90, 30, 25, 25);
    }

    private void dot3() {
        g.fillOval(30, 60, 25, 25);
    }

    private void dot4() {
        g.fillOval(60, 60, 25, 25);
    }

    private void dot5() {
        g.fillOval(90, 60, 25, 25);
    }

    private void dot6() {
        g.fillOval(30, 90, 25, 25);
    }

    private void dot7() {
        g.fillOval(90, 90, 25, 25);
    }

    private void drawDots() {
        g.setColor(Color.black);
        switch (num) {
            case 1: {
                dot4();
                break;
            }
            case 2: {
                dot1();
                dot7();
                break;
            }
            case 3: {
                dot1();
                dot4();
                dot7();
                break;
            }
            case 4: {
                dot1();
                dot2();
                dot6();
                dot7();
                break;
            }
            case 5: {
                dot1();
                dot2();
                dot4();
                dot6();
                dot7();
                break;
            }
            case 6: {
                dot1();
                dot2();
                dot3();
                dot5();
                dot6();
                dot7();
                break;
            }
        }
    }

    public void draw() {
        g.setColor(Color.white);
        g.fillRoundRect(25, 25, 100, 100, 20, 20);
        drawDots();
    }
}
