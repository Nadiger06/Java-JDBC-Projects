package org.impelsys.SpringAnnotationDemo;

import org.impelsys.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String args[])
{
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Car myCar = (Car)context.getBean("mustang");
	System.out.println("Car: "+myCar.getModel()+" which is of type :  "+ myCar.getType()+ "  has engine of type: "+myCar.getMustangEngine().getEngineType());
	Car myCar1 = (Car)context.getBean("audi");
	System.out.println("Car: "+myCar1.getModel()+" which is of type :  "+ myCar1.getType()+ "  has engine of type: "+myCar1.getMustangEngine().getEngineType());	
}
}
