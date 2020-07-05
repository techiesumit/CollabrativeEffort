package com.sumit.spring.factory.springfactory.dataoperation;

import com.sumit.spring.factory.springfactory.dataoperation.factory.DataFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SaveOperation implements DataOperations{
    static {
        DataFactory.registerInstances("Save", SaveOperation.class);
    }
    @Override
    public void execute(Object dataObject) {
    log.info("Saving the Object");

    }
}
