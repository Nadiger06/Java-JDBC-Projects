package org.impelsys.config;

import org.impelsys.model.Processor;
import org.impelsys.model.impl.OctaCoreProcessor;
import org.impelsys.model.impl.QuadraCoreProcessor;
import org.impelsys.model.impl.SamsungMobile;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
//@ComponentScan("org.impelsys.model.impl")
public class AppConfig {
	
	@Bean
	public SamsungMobile createSamsungPhone(){
		return new SamsungMobile();
	}
	
	@Bean
	public Processor quadraCoreProcessor(){
		return new QuadraCoreProcessor();
	}
	
	@Bean
	public Processor octoCoreProcessor(){
		return new OctaCoreProcessor();
	}
	

}
