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

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Point Tests
 *
 * @author Andrew SASSOYE
 * @version 1.0.0
 * @since 1.0.0
 */
public class PointTest {
    @Nested
    class Constructor {
        @Nested
        class DoubleConstructor {
            @Test
            public void allOK() {
                double x = 1;
                double y = 2;
                Point point = new Point(x, y);

                assertAll(
                        () -> assertEquals(x, point.getX()),
                        () -> assertEquals(y, point.getY())
                );
            }
        }

        @Nested
        class FloatConstructor {
            @Test
            public void allOK() {
                float x = 1.0F;
                float y = 2.0F;
                Point point = new Point(x, y);

                assertAll(
                        () -> assertEquals(x, point.getX()),
                        () -> assertEquals(y, point.getY())
                );
            }
        }

        @Nested
        class ShortConstructor {
            @Test
            public void allOK() {
                short x = 1;
                short y = 2;
                Point point = new Point(x, y);

                assertAll(
                        () -> assertEquals(x, point.getX()),
                        () -> assertEquals(y, point.getY())
                );
            }
        }

        @Nested
        class IntConstructor {
            @Test
            public void allOK() {
                int x = 1;
                int y = 2;
                Point point = new Point(x, y);

                assertAll(
                        () -> assertEquals(x, point.getX()),
                        () -> assertEquals(y, point.getY())
                );
            }
        }

        @Nested
        class LongConstructor {
            @Test
            public void allOK() {
                long x = 1;
                long y = 2;
                Point point = new Point(x, y);

                assertAll(
                        () -> assertEquals(x, point.getX()),
                        () -> assertEquals(y, point.getY())
                );
            }
        }


    }
}
