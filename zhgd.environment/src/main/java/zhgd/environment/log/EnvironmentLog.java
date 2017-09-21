package zhgd.environment.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EnvironmentLog {
	private static Logger logger=LoggerFactory.getLogger(EnvironmentLog.class);
	@Pointcut("execution(public * zhgd.environment.controller.EnvironmentController.*(..))")
	public void log(){
		
	}
	
	@Before("log()")
	public void doBefore(JoinPoint joinPoint){
		//类方法
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());
		//参数
		logger.info("args={}",joinPoint.getArgs());
	}
	

}
