/**
 * OVERVIEW: The test case "test10" covers around 2.0% (low percentage) of
 * statements in "ArrayIntList"
 */
@Test
public void test10() throws Throwable {
		// The test case instantiates a "ArrayIntList"  with the default
		// configuration (initial capacity is 8)
		ArrayIntList arrayIntList0 = new ArrayIntList();
		
		try {
			// The next method call removes the element at index -1 of
			// "arrayIntList0"
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

