package com.example.testpipeline;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleTest {

  Example example = new Example();

  @Test
  void testThree(){
    assertThat(example.method3("bob")).isEqualTo("bob");
  }

  @Test
  void testFour(){
    assertThat(example.method4("bob")).isEqualTo("bob");
  }
}
