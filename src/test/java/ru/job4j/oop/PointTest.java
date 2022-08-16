package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.offset;

class PointTest {

    @Test
    public void when00to20then2() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double expected = 2;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when00to55then7dot07() {
        Point one = new Point(0, 0);
        Point two = new Point(5, 5);
        double result = one.distance(two);
        double expected = 7.07;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when42to07then6dot40() {
        Point one = new Point(4, 2);
        Point two = new Point(0, 7);
        double result = one.distance(two);
        double expected = 6.40;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when12to68then7dot81() {
        Point one = new Point(1, 2);
        Point two = new Point(6, 8);
        double result = one.distance(two);
        double expected = 7.81;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when000To222Then3dot46() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(2, 2, 2);
        double result = one.distance3d(two);
        double expected = 3.46;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }

    @Test
    public void when546To356Then2dot23() {
        Point one = new Point(5, 4, 6);
        Point two = new Point(3, 5, 6);
        double result = one.distance3d(two);
        double expected = 2.23;
        assertThat(result).isCloseTo(expected, offset(0.01));
    }
}