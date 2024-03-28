package com.example.module1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class JavaVersionTest {

  @Test
  void testJavaVersionIs22() {
    int expectedVersion = 22;
    Runtime.Version runtimeVersion = Runtime.version();
    int version = runtimeVersion.version().getFirst();
    Assertions.assertThat(version).isEqualTo(expectedVersion);
  }

}
