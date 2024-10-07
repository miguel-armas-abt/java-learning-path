package com.java.buddies.dao;

import java.util.List;
import com.java.buddies.entity.CustomerEntity;

public interface CustomerDAO {

  List<CustomerEntity> findAll();

  CustomerEntity findByDni(String dni);
}
