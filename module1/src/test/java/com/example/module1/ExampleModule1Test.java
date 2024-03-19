package com.example.module1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule1Test {

  ExampleModule1 example = new ExampleModule1();

  @Test
  void testThree(){
    assertThat(example.method3("bob")).isEqualTo("bob");
  }

  @Test
  void testFour(){
    assertThat(example.method4("bob")).isEqualTo("bob");
  }
}
