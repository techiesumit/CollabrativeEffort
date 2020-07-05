package com.sumit.spring.factory.springfactory.dataoperation;

import com.sumit.spring.factory.springfactory.dataoperation.factory.DataFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DeleteOperation implements DataOperations {
  static {
    DataFactory.registerInstances("Delete", DeleteOperation.class);
  }

  @Override
  public void execute(Object dataObject) {
    log.info("Deleting  the Object");
  }
}
