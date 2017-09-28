package zhgd.environment.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.fabric.xmlrpc.base.Array;

import zhgd.environment.dao.EnvironmentRepository;
import zhgd.environment.pojo.Environment;
import zhgd.environment.service.EnvironmentService;

@Component
public class EnvironmentServiceImpl implements EnvironmentService{

	@Autowired
	private EnvironmentRepository environmentRepository;
	
	/*
	 * 存储数据
	 * (non-Javadoc)
	 * @see zhgd.environment.service.EnvironmentService#save(zhgd.environment.pojo.Environment)
	 */
	@Override
	public void save(Environment environment) {
		//报警
		alert(getOutSideArgs(environment));
		//存储
		environmentRepository.save(environment);
	}

	@Override
	public List<Environment> getAllEnvironment() {
		return environmentRepository.findAll();
	}

	@Override
	public Environment getRecentEnvironment() {
		return environmentRepository.findRecentEnvironment();
	}

	@Override
	public Environment getEnvironmentById(int id) {
		return environmentRepository.findOne(id);
	}

	@Override
	public void deleteEnvironmentById(int id) {
		environmentRepository.delete(id);
	}

	@Override
	public void receive() {
		
	}
	
	/*
	 * 根据超标参数报警
	 * (non-Javadoc)
	 * @see zhgd.environment.service.EnvironmentService#alert(java.util.List)
	 */
	@Override
	public void alert(List<Integer> args) {
		//遍历超标参数,依次报警
		for (Integer argu : args) {
			switch (argu) {
			case Environment.PM2P5_OUTSIDE:
				System.out.println("pm2.5报警动作");
				//pm2.5报警动作
				break;
			case Environment.PM10_OUTSIDE:
				//pm10报警动作
				System.out.println("pm10报警动作");
				break;
			case Environment.NOSIE_OUTSIDE:
				//噪声报警
				System.out.println("噪声报警动作");
				break;
			case Environment.TEMPRATURE_OUTSIDE:
				//温度报警
				System.out.println("温度报警动作");
				break;
			case Environment.WINDSPEED_OUTSIDE:
				//风速报警
				System.out.println("风速报警动作");
				break;
			case Environment.HUMIDITY_OUTSIDE:
				//湿度报警
				System.out.println("湿度报警动作");
				break;
			default:
				break;
			}
		}
		
	}
	//是否超标
	@Override
	public boolean isOutSide(Environment environment) {
		//如果超标参数大于0
		return getOutSideArgs(environment).size()>0;
	}

	//取得超标参数
	@Override
	public List<Integer> getOutSideArgs(Environment environment) {
		
		List<Integer> args=new ArrayList<>();
		//判断pm2.5超标
		if(environment.getPm2p5()>Environment.PM2P5_MAX)
			args.add(Environment.PM2P5_OUTSIDE);
		//判断pm10超标
		if(environment.getPm10()>Environment.PM10_MAX)
			args.add(Environment.PM10_OUTSIDE);
		//判断噪声超标
		if(environment.getNoise()>Environment.NOISE_MAX)
			args.add(Environment.NOSIE_OUTSIDE);
		//判断风速超标
		if(environment.getWindSpeed()>Environment.WINDSPEED_MAX)
			args.add(Environment.WINDSPEED_OUTSIDE);
		//判断温度超标
		if(environment.getTemperature()>Environment.TEMPRATURE_MAX)
			args.add(Environment.TEMPRATURE_OUTSIDE);
		//判断湿度超标
		if(environment.getHumidity()>Environment.HUMIDITY_MAX)
			args.add(Environment.HUMIDITY_OUTSIDE);
		return args;
	}
	
	

}
