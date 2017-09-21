package zhgd.environment.handle;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import zhgd.environment.exception.EnvironmentException;
import zhgd.environment.pojo.ResponseResult;

@ControllerAdvice
public class GlobalExceptionHandle {
	
	@ExceptionHandler(value=EnvironmentException.class)
	@ResponseBody
	public ResponseResult environmentExceptionHandle(EnvironmentException e){
		return ResponseResult.ok(e.getStatusCode(), e.getMessage());
	}
	
	@ExceptionHandler(value=BindException.class)  
	@ResponseBody
    public ResponseResult BindExceptionHandler(BindException exception)  {  
		int i=1;
        //按需重新封装需要返回的错误信息  
        StringBuffer errMsg=new StringBuffer("参数异常:");  
        //解析原错误信息，封装后返回，此处返回非法的字段名称，原始值，错误信息
        for (FieldError error : exception.getBindingResult().getFieldErrors()) {  
        	errMsg.append(i+++" "+error.getField()+":   "+error.getDefaultMessage()+"!!!");
        }
        return ResponseResult.ok(ResponseResult.STASTUSCODE_ARGUMENTSERROR, errMsg.toString());
    }  
}
