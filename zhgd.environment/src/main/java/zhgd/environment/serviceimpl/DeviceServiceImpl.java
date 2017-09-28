package zhgd.environment.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import zhgd.environment.dao.DeviceRepository;
import zhgd.environment.pojo.Device;
import zhgd.environment.service.DeviceService;

@Component
public class DeviceServiceImpl implements DeviceService{
	
	@Autowired
	private DeviceRepository deviceRepository;
	

	@Override
	public void delete(String id) {
		deviceRepository.delete(id);
	}

	@Override
	public void merge(Device device) {
		deviceRepository.saveAndFlush(device);
	}
	
}
