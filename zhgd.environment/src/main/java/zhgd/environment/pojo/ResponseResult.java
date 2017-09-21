package zhgd.environment.pojo;

/*
 * 
 * 统一返回结果
 */
public class ResponseResult {
	public final  static int STASTUSCODE_SUCCESS=0;
	public final  static int STASTUSCODE_ARGUMENTSERROR=1;
	public final  static int STASTUSCODE_NOAUTHORITY=2;
	public final  static int STASTUSCODE_SYSTEMERROR=3;
	public final  static int STASTUSCODE_OTHERERROR=4;
	
	/*
	 * status表示状态
	 * 0   	正常
	 * 1	参数格式或内容错误
	 * 2	无操作权限
	 * 3	系统异常
	 * 4	其他错误
	 */
	private int statusCode;
	private String errMsg;			//错误信息
	private Object content;			//具体内容
	
	public ResponseResult(int statusCode, String errMsg, Object content) {
		this.statusCode = statusCode;
		this.errMsg = errMsg;
		this.content = content;
	}
	
	public ResponseResult(int statusCode, String errMsg) {
		this.statusCode = statusCode;
		this.errMsg = errMsg;
		this.content = null;
	}
	
	public ResponseResult(Object content) {
		this.statusCode=0;
		this.errMsg="正常";
		this.content=content;
	}
	
	public static ResponseResult ok(){
		return new ResponseResult(0,"正常");
	}
	
	public static ResponseResult ok(Object content){
		return new ResponseResult(content);
	}
	
	public static ResponseResult ok(int statusCode, String errMsg,Object content){
		return new ResponseResult(statusCode,errMsg,content);
	}
	
	public static ResponseResult ok(int statusCode, String errMsg){
		return new ResponseResult(statusCode,errMsg);
	}
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
	
	
}
