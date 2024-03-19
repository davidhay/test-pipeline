package com.example.module3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule3IT {

  ExampleModule3 example = new ExampleModule3();

  @Test
  void testOne(){
    assertThat(example.method1("bob")).isEqualTo("bob");
  }

  @Test
  void testTwo(){
    assertThat(example.method2("bob")).isEqualTo("bob");
  }
}
