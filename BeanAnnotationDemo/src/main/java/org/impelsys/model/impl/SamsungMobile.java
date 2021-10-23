package org.impelsys.model.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.impelsys.model.Mobile;
import org.impelsys.model.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("samsungGalaxy")
public class SamsungMobile implements Mobile {

	@Autowired
	@Qualifier("octaCoreProcessor")
	Processor processor;
	
	public SamsungMobile(){
		System.out.println("IN Constructor");
		
	}
	public void config() {
		System.out.println("Quadra Core,12 Mbps Camera,8 GB RAM");
		processor.config();

	}
	
	@PostConstruct
	public void init(){
		System.out.println("Initializing the SamsungMobile");
		
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Doing cleaning activity SamsungMobile is dstroyed");
	}

}
