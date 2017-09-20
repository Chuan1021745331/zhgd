package zhgd.environment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import zhgd.environment.pojo.Environment;

public interface EnvironmentRepository extends JpaRepository<Environment, Integer>{
	@Query("from Environment where id=(select max(id) from Environment)")
	public Environment findRecentEnvironment();
}
