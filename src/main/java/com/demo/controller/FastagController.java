package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.FastagCustomer;
import com.demo.service.FastagService;

@RestController
public class FastagController {

	private static final Logger LOGGER = LoggerFactory.getLogger(FastagController.class);

	@Autowired
	private FastagService fastagService;

	public FastagController() {

	}

	@RequestMapping(path = "/fastag", params = { "fastagId" })
	public FastagCustomer getFastagById(@RequestParam Integer fastagId) {
		LOGGER.info("getFastagById Method::", FastagController.class);
		return fastagService.getFastagById(fastagId);
	}

	@RequestMapping(path = "/fastag", params = { "phone" })
	public FastagCustomer getFastagByPhone(@RequestParam String phone) {
		LOGGER.info("getFastagByPhone Method::", FastagController.class);
		return fastagService.getFastagByPhone(phone);

	}

}
