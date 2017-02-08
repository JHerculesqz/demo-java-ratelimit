package com.huawei.doctor._6_rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.huawei._1_model.user.User;

@Controller
@EnableAutoConfiguration
public class RuleController {
	// #region Fields

	@Autowired
	public RuleService ruleService;

	// #endregion

	// #region updateSickness

	/**
	 * ���¼����б�,��ʼ����ʱ����<br>
	 * 
	 * @param user
	 */
	@RequestMapping("doctor/rules/updateSickness")
	@ResponseBody
	public void updateSickness(@RequestBody User oUser) {
		ruleService.updateSickness(oUser);
	}

	// #endregion

	// #region startXXX

	/**
	 * �������ѹ���<br>
	 * 
	 * @param problem
	 * @return
	 */
	@RequestMapping("doctor/rules/startwarn")
	@ResponseBody
	public String startWarn(@RequestBody String strUsername) {
		return ruleService.startWarn(strUsername);
	}

	/**
	 * ����Ӧ������<br>
	 * 
	 * @param problem
	 * @return
	 */
	@RequestMapping("doctor/rules/startemergency")
	@ResponseBody
	public String startEmergency(@RequestBody String strUsername) {
		return ruleService.startEmergency(strUsername);
	}

	// #endregion
}
