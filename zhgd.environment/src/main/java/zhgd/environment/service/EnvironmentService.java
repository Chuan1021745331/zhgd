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
}
