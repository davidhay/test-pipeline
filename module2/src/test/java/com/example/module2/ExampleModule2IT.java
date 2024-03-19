package com.example.module2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule2IT {

  ExampleModule2 example = new ExampleModule2();

  @Test
  void testOne(){
    assertThat(example.method1("bob")).isEqualTo("bob");
  }

  @Test
  void testTwo(){
    assertThat(example.method2("bob")).isEqualTo("bob");
  }
}
