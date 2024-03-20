package com.example.module1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class JavaVersionTest {

  @Test
  void testJavaVersionIs8() {
    int expectedVersion = 8;
    int version = getVersion();
    Assertions.assertThat(version).isEqualTo(expectedVersion);
  }

  private static int getVersion() {
    String version = System.getProperty("java.version");
    if(version.startsWith("1.")) {
      version = version.substring(2, 3);
    } else {
      int dot = version.indexOf(".");
      if(dot != -1) { version = version.substring(0, dot); }
    } return Integer.parseInt(version);
  }}
