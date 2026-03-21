package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00andMinus40and0Minus3Then6() {
        Point a = new Point(0, 0);
        Point b = new Point(-4, 0);
        Point c = new Point(0, -3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 6;
        assertThat(result).isCloseTo(expected, offset(0.1));
    }

    @Test
    public void when1Minus1and10and1Minus1ThenMinus1() {
        Point a = new Point(1, -1);
        Point b = new Point(1, 0);
        Point c = new Point(1, -1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}
