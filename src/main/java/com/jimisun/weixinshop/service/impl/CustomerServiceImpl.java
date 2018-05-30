package com.jimisun.weixinshop.service.impl;

import com.jimisun.weixinshop.dao.CustomerDao;
import com.jimisun.weixinshop.entity.Customer;
import com.jimisun.weixinshop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 13:15 2018-05-29
 * @Modified By:
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void register(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public Customer findByUsername(Customer customer) {
        return customerDao.findByUsername(customer.getUsername());
    }
}
