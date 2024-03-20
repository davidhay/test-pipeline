package com.example.module1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
public class JavaVersionTest {

  @Test
  void testJavaVersionIs21() {
    int expectedVersion = 21;
    Runtime.Version runtimeVersion = Runtime.version();
    int version = runtimeVersion.version().getFirst();
    Assertions.assertThat(version).isEqualTo(expectedVersion);
  }

}
