package com.example.app;

import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AssertionsDemoTest {

    // ---- equality ----
    @Test
    void equals_() {
        assertEquals(5, 2 + 3);                 // equal values (uses .equals for objects)
    }

    @Test
    void equalsWithDelta_() {
        assertEquals(5.1, 2.1 + 3, 0.001);      // decimals: allow a tolerance
    }

    @Test
    void notEquals_() {
        assertNotEquals(4, 2 + 3);              // passes because 4 != 5
    }

    // ---- booleans ----
    @Test
    void true_() {
        assertTrue(5 > 3);                       // condition must be true
    }

    @Test
    void false_() {
        assertFalse(5 < 3);                      // condition must be false
    }

    // ---- null checks ----
    @Test
    void null_() {
        String s = null;
        assertNull(s);                           // must be null
    }

    @Test
    void notNull_() {
        String s = "hi";
        assertNotNull(s);                        // must not be null
    }

    // ---- identity vs equality ----
    @Test
    void same_() {
        String a = "hi", b = "hi";               // both from the string pool
        assertSame(a, b);                        // same object in memory (==)
    }

    @Test
    void notSame_() {
        String a = "hi";
        String c = new String("hi");             // a brand-new object
        assertNotSame(a, c);                      // different objects...
        assertEquals(a, c);                       // ...but still equal by value
    }

    // ---- exceptions (you'll use this constantly) ----
    @Test
    void throws_() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 5 / 0;                        // passes because this throws
        });
    }

    @Test
    void throwsAndInspect_() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> { throw new IllegalArgumentException("bad age"); });
        assertEquals("bad age", ex.getMessage()); // check the message too
    }

    @Test
    void doesNotThrow_() {
        assertDoesNotThrow(() -> Integer.parseInt("42")); // must NOT throw
    }

    // ---- arrays & collections ----
    @Test
    void arrayEquals_() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3}); // element-by-element
    }

    @Test
    void iterableEquals_() {
        assertIterableEquals(List.of(1, 2, 3), List.of(1, 2, 3));  // same order + elements
    }

    @Test
    void linesMatch_() {
        assertLinesMatch(List.of("hello", "world"),
                List.of("hello", "world"));               // list of strings (supports regex)
    }

    // ---- grouping ----
    @Test
    void all_() {
        assertAll("checks",                       // runs ALL of them, reports every failure
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue("java".startsWith("j")),
                () -> assertNotNull("x")
        );
    }

    // ---- timing ----
    @Test
    void timeout_() {
        assertTimeout(Duration.ofSeconds(1), () -> {
            int sum = 0;                          // finishes well under 1s → passes
            for (int i = 0; i < 100; i++) sum += i;
        });
    }

    // ---- forcing a failure on purpose ----
    @Test
    void fail_() {
        boolean somethingWentWrong = false;       // stays false, so fail() never runs
        if (somethingWentWrong) {
            fail("only reached when logic hits a bad state");
        }
    }

    // ---- the optional message (shown only on failure) ----
    @Test
    void withMessage_() {
        assertEquals(5, 2 + 3, "addition of 2 and 3 should be 5");
        // for decimals the message comes AFTER the delta:
        assertEquals(5.1, 2.1 + 3, 0.001, "decimal sum off");
    }
}