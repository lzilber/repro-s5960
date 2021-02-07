package org.zebre;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestion {

  @Test
  public void testAnswer() {
    Question objUnderTest = new Question();
    assertEquals(12, objUnderTest.answer());
  }

}
