package zhgd.environment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import zhgd.environment.exception.EnvironmentException;
import zhgd.environment.pojo.Environment;
import zhgd.environment.pojo.ResponseResult;
import zhgd.environment.service.EnvironmentService;

@RestController
@EnableAutoConfiguration
public class EnvironmentController {
	
	@Autowired
	private EnvironmentService environmentService;
	
	/*
	 * 请求最新数据
	 */
	@GetMapping("/recent")
	public ResponseResult getRecentEnvironment(){
		return ResponseResult.ok(environmentService.getRecentEnvironment());
	}
	
	@GetMapping("/allEnvironment")
	public ResponseResult getAllEnvironment(){
		return ResponseResult.ok(environmentService.getAllEnvironment());
	}
	
	/*
	 * 接收数据并存储
	 */
	@PostMapping("saveEnvironment")
	public ResponseResult saveEnvironment(@Validated  Environment environment){
		
		//补全信息
		//存入数据库
		environmentService.save(environment);
		//返回结果
		return ResponseResult.ok();
	}
}
