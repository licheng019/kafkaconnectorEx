package com.kafkaconnector.kafkaconnectorEx;

import org.junit.Test;

public class MySourceConnectorConfigTest {
  @Test
  public void doc() {
    System.out.println(MySourceConnectorConfig.conf().toRst());
  }
}