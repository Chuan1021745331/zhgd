package zhgd.environment.exception;

public class EnvironmentException extends RuntimeException{
	private int statusCode;

	
	public EnvironmentException(int statusCode,String errMsg) {
		super(errMsg);
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
