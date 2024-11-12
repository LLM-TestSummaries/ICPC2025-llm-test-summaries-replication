/**
* Ensures that the capacity of an ArrayIntList can be increased to a specified value without affecting its size. 
*/ 
@Test
public void test8() throws Throwable {
    ArrayIntList arrayIntList0 = new ArrayIntList();
    arrayIntList0.ensureCapacity(9);
    assertEquals(0, arrayIntList0.size());
}

