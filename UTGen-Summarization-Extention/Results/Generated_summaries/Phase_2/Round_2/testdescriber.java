/**
 * OVERVIEW: The test case "test3" covers around 6.0% (low percentage) of
 * statements in "Rational"
 **/
@Test
public void test3() throws Throwable {
    // The test case instantiates a "Rational" with numerator equal to 1L,
    // and denominator equal to 3215L.
    // The execution of this constructor implicitly covers the following 1
    // conditions:
    // - the condition " denominator equals to 0L" is FALSE;
    Rational rational0 = new Rational(1L, 3215L);
    // The test case declares an object of the class "Rational" whose value
    // is equal to the absolute value of "rational0"
    Rational rational1 = rational0.abs();
    // Then, it tests:
    // 1) whether the numerator of rational0 is equal to 1L;
    assertEquals(1L, rational0.numerator);
    // 2) whether the denominator of rational0 is equal to 3215L;
    assertEquals(3215L, rational0.denominator);
    // 2) whether the float value of "rational1" is equal to 3.11041E-4F
    // with delta equal to 0.01F;
    assertEquals(3.11041E-4F, rational1.floatValue(), 0.01F);
}

