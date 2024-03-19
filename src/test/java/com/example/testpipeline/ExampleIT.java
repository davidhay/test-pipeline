package com.example.testpipeline;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleIT {

  Example example = new Example();

  @Test
  void testOne(){
    assertThat(example.method1("bob")).isEqualTo("bob");
  }

  @Test
  void testTwo(){
    assertThat(example.method2("bob")).isEqualTo("bob");
  }
}
