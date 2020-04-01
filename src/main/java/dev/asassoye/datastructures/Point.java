/*
 * Copyright (C) 2020 Andrew SASSOYE
 *
 * Permission is hereby granted, free of charge,
 * to any person obtaining a copy of this software and associated documentation files (the “Software”),
 * to deal in the Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
 * and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package dev.asassoye.datastructures;

/**
 * Point
 *
 * @author Andrew SASSOYE
 * @version 1.0.0
 * @since 1.0.0
 */
public class Point {
    double x;
    double y;

    /**
     * Point constructor
     *
     * @param x x value
     * @param y y value
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Point constructor
     *
     * @param x x value
     * @param y y value
     */
    public Point(float x, float y) {
        this((double) x, y);
    }

    /**
     * Point constructor
     *
     * @param x x value
     * @param y y value
     */
    public Point(short x, short y) {
        this((double) x, y);
    }

    /**
     * Point constructor
     *
     * @param x x value
     * @param y y value
     */
    public Point(int x, int y) {
        this((double) x, y);
    }

    /**
     * Point constructor
     *
     * @param x x value
     * @param y y value
     */
    public Point(long x, long y) {
        this((double) x, y);
    }


    /**
     * Origin constructor
     */
    public Point() {
        this(0, 0);
    }

    /**
     * this.x getter
     *
     * @return this.x
     */
    public double getX() {
        return x;
    }

    /**
     * this.x setter
     *
     * @param x New x value
     * @return this
     */
    public Point setX(double x) {
        this.x = x;
        return this;
    }

    /**
     * this.y getter
     *
     * @return this.y
     */
    public double getY() {
        return y;
    }

    /**
     * this.y setter
     *
     * @param y New y value
     * @return this
     */
    public Point setY(double y) {
        this.y = y;
        return this;
    }
}
