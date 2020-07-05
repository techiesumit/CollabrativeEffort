package com.sumit.spring.factory.springfactory.dataoperation.factory;

import com.sumit.spring.factory.springfactory.dataoperation.DataOperations;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@Slf4j
public class DataFactory {
    private static final Map<String, Class<? extends DataOperations>> dataOperationInstance = new HashMap<>();

    public static void registerInstances(String operationName, Class<? extends DataOperations> classInstance){
        if( Objects.nonNull( operationName )&& Objects.nonNull(classInstance)){
            dataOperationInstance.put(operationName,classInstance);
        }
    }
    public static DataOperations getDataOperationInstance(ApplicationContext applicationContext, String operationInstanceName){
        if(dataOperationInstance.containsKey(operationInstanceName)){
           return applicationContext.getBean(dataOperationInstance.get(operationInstanceName));
        }
      log.info("Invalid Operation Name");
        return null;
    }
}
