package com.example.module1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class JavaVersionTest {

  @Test
  void testJavaVersionIs17() {
    String expectedVersion = "17";
    Runtime.Version runtimeVersion = Runtime.version();
    String version = String.valueOf(runtimeVersion.version().get(0));
    Assertions.assertThat(version).isEqualTo(expectedVersion);
  }

}
