/**
 * 1. Creates a new ArrayIntList
 * 2. Adds to "arrayIntList0" 3 times and checks if its size is 3
 * 3. Expects an IndexOutOfBoundsException when calling
 *    removeElementAt on "arrayIntList0" with argument 1
 **/
@Test
public void test10() throws Throwable {
    ArrayIntList arrayIntList0 = new ArrayIntList();

    try {
      arrayIntList0.add(0, 0);
      arrayIntList0.add(0, 1);
      arrayIntList0.add(0, 2);
      assertEquals(3, arrayIntList0.size());
      arrayIntList0.removeElementAt(1);
      fail("Expecting exception: IndexOutOfBoundsException");
    } catch (IndexOutOfBoundsException e) {
      //
      // Should be at least 0 and less than 0, found -1
      //
    }
}

