package zhgd.environment.service;

import java.util.List;

import zhgd.environment.pojo.Environment;

public interface EnvironmentService {
	//存入数据库
	public void save(Environment environment);
	//查询
	//查询所有
	public List<Environment> getAllEnvironment();
	//查询最新
	public Environment getRecentEnvironment();
	//根据id查询
	public Environment getEnvironmentById(int id);
	//删除
	public void deleteEnvironmentById(int id);
	//接收数据
	public void receive();
	//数据超标，警告
	public void alert(List<Integer> args);
	//判断是否超标
	public boolean isOutSide(Environment environment);
	//得到超标的参数
	public List<Integer> getOutSideArgs(Environment environment);
}
