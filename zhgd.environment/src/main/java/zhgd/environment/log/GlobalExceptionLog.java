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
public class GlobalExceptionLog {
	private static Logger logger=LoggerFactory.getLogger(GlobalExceptionLog.class);
	
	@Pointcut("execution(public * zhgd.environment.handle.GlobalExceptionHandle.*(..))")
	public void log(){	
		
	}
	@After("log()")
	public void doAfter(JoinPoint joinPoint){
		logger.error("",joinPoint.getArgs());
	}
}
