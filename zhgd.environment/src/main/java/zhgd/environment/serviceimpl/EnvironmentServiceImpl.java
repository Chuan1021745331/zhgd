package zhgd.environment.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import zhgd.environment.dao.EnvironmentRepository;
import zhgd.environment.pojo.Environment;
import zhgd.environment.service.EnvironmentService;

@Component
public class EnvironmentServiceImpl implements EnvironmentService{

	@Autowired
	private EnvironmentRepository environmentRepository;
	
	
	@Override
	public void save(Environment environment) {
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

}
