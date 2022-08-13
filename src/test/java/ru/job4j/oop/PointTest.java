package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void when00to20then2() {
        Point one = new Point(0, 0);
        Point two = new Point(2, 0);
        double result = one.distance(two);
        double expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when00to55then7dot07() {
        Point one = new Point(0, 0);
        Point two = new Point(5, 5);
        double result = one.distance(two);
        double expected = 7.0710678118654755;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when42to07then6dot40() {
        Point one = new Point(4, 2);
        Point two = new Point(0, 7);
        double result = one.distance(two);
        double expected = 6.4031242374328485;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when12to68then7dot81() {
        Point one = new Point(1, 2);
        Point two = new Point(6, 8);
        double result = one.distance(two);
        double expected = 7.810249675906654;
        assertThat(result).isEqualTo(expected);
    }
}