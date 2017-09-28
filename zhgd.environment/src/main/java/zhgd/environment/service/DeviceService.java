package zhgd.environment.service;

import org.springframework.beans.factory.annotation.Autowired;

import zhgd.environment.dao.DeviceRepository;
import zhgd.environment.pojo.Device;


public interface DeviceService {
	//入库或更新
	public void merge(Device device);
	//删除
	public void delete(String id);
}
