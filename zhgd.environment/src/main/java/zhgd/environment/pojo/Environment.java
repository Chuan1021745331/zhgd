package zhgd.environment.pojo;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Cascade;

/*
 * 
 * 环境类,环境数据
 */
@Entity
public class Environment {
	private int id;
	private double pm2p5;				//pm2.5量程 0--500  单位 ug/m^3
	private double pm10;				//pm10量程 0--500    单位ug/m^3
	private double noise;				//噪音强度 量程30-130  单位dB
	private double windSpeed;			//风速0-70         单位m/s
	private double  windDirection;		//风向 0-360     单位 °
	private double temperature;			//温度-40-80   单位 °
	private double humidity;			//湿度0-100      单位 RH
	private String recordTime;			//采集时间
	private String sourceId;			//数据来源id
	private String serialNo;			//序列号
	private Device device;				//设备
	
	public static double PM2P5_MAX=500;
	public static double PM2P5_MIN=0;
	public final static int    PM2P5_OUTSIDE=1;	//表示PM2.5超标
	
	public static double PM10_MAX=500;
	public static double PM10_MIN=0;
	public final static int    PM10_OUTSIDE=2;	//表示PM10超标
	
	public static double NOISE_MAX=130;
	public static double NOISE_MIN=30;
	public final static int    NOSIE_OUTSIDE=3;	//表示噪音超标
	
	public static double WINDDIRECTION_MAX=360;
	public static double WINDDIRECTION_MIN=0;
	public static double WINDSPEED_MAX=70;
	public static double WINDSPEED_MIN=0;
	public final static int    WINDSPEED_OUTSIDE=4;	//表示风速超标
	
	public static double TEMPRATURE_MAX=80;
	public static double TEMPRATURE_MIN=-40;
	public final static int    TEMPRATURE_OUTSIDE=5;//表示温度超标
	
	public static double HUMIDITY_MAX=100;
	public static double HUMIDITY_MIN=0;
	public final static int  	 HUMIDITY_OUTSIDE=6;	//表示湿度超标

	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPm2p5() {
		return pm2p5;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="device_id")
	public Device getDevice() {
		return device;
	}
	public void setDevice(Device device) {
		this.device = device;
	}
	public void setPm2p5(double pm2p5) {
		this.pm2p5 = pm2p5;
	}
	public double getPm10() {
		return pm10;
	}
	public void setPm10(double pm10) {
		this.pm10 = pm10;
	}
	public double getNoise() {
		return noise;
	}
	public void setNoise(double noise) {
		this.noise = noise;
	}
	public double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public double getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(double windDirection) {
		this.windDirection = windDirection;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public String getRecordTime() {
		return recordTime;
	}
	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
	}

	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "Environment [id=" + id + ", pm2p5=" + pm2p5 + ", pm10=" + pm10
				+ ", noise=" + noise + ", windSpeed=" + windSpeed
				+ ", windDirection=" + windDirection + ", temperature="
				+ temperature + ", humidity=" + humidity + ", recordTime="
				+ recordTime + ", sourceId=" + sourceId + ", serialNo="
				+ serialNo + ", device=" + device + "]";
	}
	
	
}
