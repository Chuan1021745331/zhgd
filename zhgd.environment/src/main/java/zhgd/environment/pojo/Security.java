package zhgd.environment.pojo;

import java.util.Date;

public class Security {
	private String keyId;		//授权id
	private long ts;			//时间戳
	private String rcode;		//随机字符串
	private String signature;	//密钥签名
	private String keySecret;	//秘钥
	
	private long ts_max=60;		//最大时间差
	
	public boolean isSecurity(){
		//获取现在时间
		Date nowDate=new Date();
		//1.	检查时间戳，如果时间戳小于当前时间60秒（这个值可以根据具体情况设置），则判定请求已过期，丢弃本次请求
		if((nowDate.getTime()-ts)>=ts_max*1000){
			return false;
		}
		return true;
	}
}	
