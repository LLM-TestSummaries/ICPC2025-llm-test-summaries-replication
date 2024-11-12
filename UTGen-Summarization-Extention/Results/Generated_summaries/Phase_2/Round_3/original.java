@Test(timeout = 4000)
public void testEncodedPath()  throws Throwable  {
    KeycloakUriBuilder uri = KeycloakUriBuilder.fromPath("x");
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    URI result = uri.buildFromEncodedMap(map);
    assertEquals("x", result.getRawPath());
}

