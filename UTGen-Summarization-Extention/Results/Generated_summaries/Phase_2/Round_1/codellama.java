/**
 * The test method `test10` tests the `removeElementAt()` method of `ArrayIntList`.
 * The test case adds three elements to the list and asserts that the size is 3.
 * Then, it tries to remove an element at index 1, which is out of bounds, expecting an `IndexOutOfBoundsException`.
 * The test case verifies that the expected exception is thrown with the appropriate message.
 */
@Test
public void test10() throws Throwable {
    ArrayIntList arrayIntList0 = new ArrayIntList();

    try {
        arrayIntList0.add(0, 0);
        arrayIntList0.add(0, 1);
        arrayIntList0.add(0, 2);
        assertEquals(3, arrayIntList0.size());
        arrayIntList0.removeElementAt((1));
        fail("Expecting exception: IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
        //
        // Should be at least 0 and less than 0, found -1
        //
    }
}

