/**
 * The test method tests the `buildFromEncodedMap` method of the `KeycloakUriBuilder` class.
 * The test creates a `KeycloakUriBuilder` instance with the path "x" and adds an empty HashMap to it.
 * The `buildFromEncodedMap` method is called on the `KeycloakUriBuilder` instance, 
 *  and the resulting URI is asserted to have the raw path "x".
 */
@Test(timeout = 4000)
public void testEncodedPath()  throws Throwable  {
    KeycloakUriBuilder uri = KeycloakUriBuilder.fromPath("x");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    URI result = uri.buildFromEncodedMap(map);
    assertEquals("x", result.getRawPath());
}

