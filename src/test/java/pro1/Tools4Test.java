package pro1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tools4Test
{
    @Test
    void test01()  {
        Number[] numbers = {200, 68f, 5.6, 400, new Fraction(1000,2)};
        assertEquals(
                500d,
                Tools4.maximumValue(numbers)
        );
    }

    private class Fraction extends Number {
        private long n;
        private long d;

        public Fraction(long n, long d) {
            this.n = n;
            this.d = d;
        }

        @Override
        public int intValue() {
            return (int) (n /d);
        }

        @Override
        public long longValue() {
            return n / d;
        }

        @Override
        public float floatValue() {
            return (float)n / (float)d;
        }

        @Override
        public double doubleValue() {
            return (double)n / (double)d;
        }
    }
}
