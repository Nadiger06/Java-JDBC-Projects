package org.impelsys.model;

import org.springframework.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component

@PropertySource("classpath:car.properties")
public class Car {
	
@Value("${type1}")	
String type;

@Value("${model1}")
String model;

//@Autowired
//@Qualifier("fordEngine")
Engine mustangEngine;

@Autowired  // constructor injection   
// for autowiring in constructor use qualifier with object declaration
// for autowire in case of the constructor injection, the constructor is preferred first

Car( Engine e)
{
	System.out.println("Inside constructor...");
	mustangEngine=e;
}
//public Engine getEngine() {
//	return mustangEngine;
//}
//@Resource
//public void setEngine(Engine engine) {
//	System.out.println("In setter: setEngine");
//	this.mustangEngine = engine;
//}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getModel() {
	return model;
}

public void setModel(String model) {
	
	this.model = model;
}


public Engine getMustangEngine() {
	return mustangEngine;
}
@Resource
public void setMustangEngine(Engine mustangEngine) {
	this.mustangEngine = mustangEngine;
}
}
