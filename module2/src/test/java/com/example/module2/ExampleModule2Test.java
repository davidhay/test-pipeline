package com.example.module2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule2Test {

  ExampleModule2 example = new ExampleModule2();

  @Test
  void testThree(){
    assertThat(example.method3("bob")).isEqualTo("bob");
  }

  @Test
  void testFour(){
    assertThat(example.method4("bob")).isEqualTo("bob");
  }
}
