package zhgd.environment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import zhgd.environment.pojo.Environment;
import zhgd.environment.service.EnvironmentService;

@RestController
@EnableAutoConfiguration
public class EnvironmentController {
	
	@Autowired
	private EnvironmentService environmentService;
	/*
	 * 
	 * 请求最新数据
	 */
	@GetMapping("/recent")
	public Environment getRecentEnvironment(){
		return environmentService.getRecentEnvironment();
	}
}
