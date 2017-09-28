package zhgd.environment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import zhgd.environment.pojo.Device;

public interface DeviceRepository extends JpaRepository<Device, String>{
	
}
