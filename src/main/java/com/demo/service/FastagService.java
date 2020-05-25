package com.demo.service;

import java.util.List;
import java.util.function.Predicate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.controller.FastagController;
import com.demo.jparepository.FastagRepository;
import com.demo.model.FastagCustomer;

@Service
public class FastagService {
	private static final Logger LOGGER = LoggerFactory.getLogger(FastagController.class);

	@Autowired
	private FastagRepository fastagRepository;

	public FastagCustomer getFastagById(Integer fastagId) {
		LOGGER.info("getFastagById Method::", FastagService.class);
		return fastagRepository.findByFastagId(fastagId);
	}

	public FastagCustomer getFastagByPhone(String phone) {
		LOGGER.info("getFastagByPhone Method::", FastagService.class);
		List<FastagCustomer> customerList = fastagRepository.findByPhone(phone);
		Predicate<FastagCustomer> p1 = c -> c.getPhone().equals(phone);
		FastagCustomer fastagCustomer = customerList.stream().filter(p1).findFirst().get();
		return fastagCustomer;
	}

}
