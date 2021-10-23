package org.impelsys.model.impl;

import org.impelsys.model.Processor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("coreProcessor8")
//@Primary

public class OctaCoreProcessor implements Processor {

	public OctaCoreProcessor(){
		System.out.println("Constructing OctaCoreProcessor ");
	}
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("This is Octocore");

	}

}
