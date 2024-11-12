/**
 * OVERVIEW: The test case "test8" covers around 3.0% (low percentage) of
 * statements in "ArrayIntList"
 **/
@Test
public void test8() throws Throwable {
	// The test case instantiates a "ArrayIntList" with the default
	// configuration (initial capacity is 8)
	ArrayIntList arrayIntList0 = new ArrayIntList();
	// The next method call the ensure capacity in min cap 9 to
	// arrayIntList0
	// The execution of this method call implicitly covers the following 1
	// conditions:
	// - the condition " min capacity greater than _data.length" is TRUE;
	arrayIntList0.ensureCapacity(9);
	// Then, it tests:
	// 1) whether the size of "arrayintlist0" is equal to 0;
	assertEquals(0, arrayIntList0.size());
}

