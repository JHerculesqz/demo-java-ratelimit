package com.huawei._1_model.healthdata;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

/**
 * ���˽�������<br>
 * @author zhangxincheng
 *
 */
@Component
public class HeathData {
	
	@Id
	private String id;
	
	// #region Fields
	
	// �û���
	private String userName;
	
	// �ɼ�ʱ��
	private String collectTime;
	
	// ���
	private String height;
	
	// ����
	private String weight;
	
	// ����
	private String heartRate;
	
	// ��֬��
	private String bodyFatRate;
	
	// Ѫѹ
	private String bloodPressure;
	
	// ��������
	private String respiratoryRate;
	
	// ����
	private String Temperature;
	
	// ˯��ʱ��
	private String sleepHours;
	
	// ˯��״̬
	private String sleepState;
	
	// #endregion
	
	// #region
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCollectTime() {
		return collectTime;
	}

	public void setCollectTime(String collectTime) {
		this.collectTime = collectTime;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(String heartRate) {
		this.heartRate = heartRate;
	}

	public String getBodyFatRate() {
		return bodyFatRate;
	}

	public void setBodyFatRate(String bodyFatRate) {
		this.bodyFatRate = bodyFatRate;
	}

	public String getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	public String getRespiratoryRate() {
		return respiratoryRate;
	}

	public void setRespiratoryRate(String respiratoryRate) {
		this.respiratoryRate = respiratoryRate;
	}

	public String getTemperature() {
		return Temperature;
	}

	public void setTemperature(String temperature) {
		Temperature = temperature;
	}

	public String getSleepHours() {
		return sleepHours;
	}

	public void setSleepHours(String sleepHours) {
		this.sleepHours = sleepHours;
	}

	public String getSleepState() {
		return sleepState;
	}

	public void setSleepState(String sleepState) {
		this.sleepState = sleepState;
	}
	
	// #endregion
	
	// #region Constructor
	public HeathData(){
		
	}
	
	public HeathData(String userName, String collectTime){
		this.userName = userName;
		this.collectTime = collectTime;
	}
	
	// #endregion
	
}
