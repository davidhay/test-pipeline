package com.example.module1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ExampleModule1IT {

  ExampleModule1 example = new ExampleModule1();

  @Test
  void testOne(){
    assertThat(example.method1("bob")).isEqualTo("bob");
  }

  @Test
  void testTwo(){
    assertThat(example.method2("bob")).isEqualTo("bob");
  }
}
