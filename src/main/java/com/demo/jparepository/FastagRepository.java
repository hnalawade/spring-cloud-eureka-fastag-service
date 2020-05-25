package com.demo.jparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.FastagCustomer;

@Repository
public interface FastagRepository extends JpaRepository<FastagCustomer, Integer> {

	FastagCustomer findByFastagId(Integer fastagId);

	List<FastagCustomer> findByPhone(String phone);

}
