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
	
	@PostMapping("saveEnvironment")
	public ResponseResult saveEnvironment(@Validated  Environment environment){
		
		//补全信息
		//存入数据库
		//environmentService.save(environment);
		throw new EnvironmentException(ResponseResult.STASTUSCODE_ARGUMENTSERROR,"参数格式错误");
		//返回结果
		//return ResponseResult.ok();
	}
}
