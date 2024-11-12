/**
* Create a new instance of ArrayIntList
* Ensure the list has enough capacity for 9 elements
* Assert that the size of the list is 0 (empty)
*/
@Test
public void test8() throws Throwable {
    ArrayIntList arrayIntList0 = new ArrayIntList();
    arrayIntList0.ensureCapacity(9);
    assertEquals(0, arrayIntList0.size());
}

