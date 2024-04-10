package com.example.gitops.unit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
public class PersonControllerUnitTests {

  @Test
  public void expectTrue_isTrue() {
    assertTrue(true);
  }

}
