package zhgd.environment.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/*
 * 
 * 环境类,环境数据
 */
@Entity
public class Environment {
	private int id;
	private float pm25;					//pm2.5量程 0--500  单位 ug/m^3
	private float pm10;					//pm10量程 0--500    单位ug/m^3
	private float noise;				//噪音强度 量程30-130  单位dB
	private float windSpeed;			//风速0-70         单位m/s
	private int  windDirection;			//风向 0-360     单位 °
	private float temperatrue;			//温度-40-80   单位 °
	private float humidity;				//湿度0-100      单位 RH
	private float beam;					//光照强度             单位LX
	private Date time;					//监测时间
	private String address;				//监测目标地址
	private String machineId;			//监测机器的标志
	
	public static float PM25_MAX=500;
	public static float PM25_MIN=0;
	public static float PM10_MAX=500;
	public static float PM10_MIN=0;
	public static float NOISE_MAX=130;
	public static float NOISE_MIN=30;
	public static float WINDDIRECTION_MAX=360;
	public static float WINDDIRECTION_MIN=0;
	public static float WINDSPEED_MAX=70;
	public static float WINDSPEED_MIN=0;
	public static float TEMPERATRUE_MAX=80;
	public static float TEMPERATRUE_MIN=-40;
	public static float HUMIDITY_MAX=0;
	public static float HUMIDITY_MIN=100;
	public static float BEAM_MAX=800;
	public static float BEAM_MIN=300;
	
	
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPm25() {
		return pm25;
	}
	public void setPm25(float pm25) {
		this.pm25 = pm25;
	}
	public float getPm10() {
		return pm10;
	}
	public void setPm10(float pm10) {
		this.pm10 = pm10;
	}
	public float getNoise() {
		return noise;
	}
	public void setNoise(float noise) {
		this.noise = noise;
	}
	public float getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	public int getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(int windDirection) {
		this.windDirection = windDirection;
	}
	public float getTemperatrue() {
		return temperatrue;
	}
	public void setTemperatrue(float temperatrue) {
		this.temperatrue = temperatrue;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getBeam() {
		return beam;
	}
	public void setBeam(float beam) {
		this.beam = beam;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	
	
	
}
