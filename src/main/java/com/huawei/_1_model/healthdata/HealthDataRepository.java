package com.huawei._1_model.healthdata;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HealthDataRepository extends MongoRepository<HeathData, String>{
	// TODO:Ϊʲô���������ϲ�ѯ��
	//	public HeathData findByNameAndTime(String userName, String collectTime);
}
