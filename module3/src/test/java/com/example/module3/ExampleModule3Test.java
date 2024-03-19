package com.example.module3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule3Test {

  ExampleModule3 example = new ExampleModule3();

  @Test
  void testThree(){
    assertThat(example.method3("bob")).isEqualTo("bob");
  }

  @Test
  void testFour(){
    assertThat(example.method4("bob")).isEqualTo("bob");
  }
}
