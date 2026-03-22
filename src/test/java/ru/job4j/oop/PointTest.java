package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double distance = a.distance(b);
        double expected = 2.0;
        assertThat(distance).isEqualTo(expected);
    }

    @Test
    void when13to57then5Dot66() {
        Point a = new Point(1, 3);
        Point b = new Point(5, 7);
        double distance = a.distance(b);
        double expected = 5.66;
        assertThat(distance).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus4and0to0Minus3then5() {
        Point a = new Point(-4, 0);
        Point b = new Point(0, -3);
        double distance = a.distance(b);
        double expected = 5;
        assertThat(distance).isEqualTo(expected);
    }

    @Test
    void when1Minus3and4to4and1and4then5() {
        Point c = new Point(1, -3, 4);
        Point d = new Point(4, 1, 4);
        double distance3d = c.distance3d(d);
        double expected = 5;
        assertThat(distance3d).isEqualTo(expected);
    }

    @Test
    void when2Minus2and7to6and2and5then6() {
        Point c = new Point(2, -2, 7);
        Point d = new Point(6, 2, 5);
        double distance3d = c.distance3d(d);
        double expected = 6;
        assertThat(distance3d).isEqualTo(expected);
    }

    @Test
    void when2and3and4toMinus6andMinus1and5then9() {
        Point c = new Point(2, 3, 4);
        Point d = new Point(-6, -1, 5);
        double distance3d = c.distance3d(d);
        double expected = 9;
        assertThat(distance3d).isEqualTo(expected);
    }
}
