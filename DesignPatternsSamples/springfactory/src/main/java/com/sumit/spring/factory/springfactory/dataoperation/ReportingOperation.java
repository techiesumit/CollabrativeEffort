package com.sumit.spring.factory.springfactory.dataoperation;

import com.sumit.spring.factory.springfactory.dataoperation.factory.DataFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReportingOperation implements DataOperations {
  static {
    DataFactory.registerInstances("Report", ReportingOperation.class);
  }

  @Override
  public void execute(Object dataObject) {
    log.info("Reporting  the Object" + dataObject.toString());
  }
}
