package com.jimisun.weixinshop.service;

import com.jimisun.weixinshop.entity.Ad1;

import java.util.List;

/**
 * @Author:jimisun
 * @Description:
 * @Date:Created in 12:40 2018-05-25
 * @Modified By:
 */
public interface Ad1Service {
    List<Ad1> findAd1All();
    Ad1 save(Ad1 ad1);
    Ad1 findById(Integer id);
    void deleteById(Integer id);
}
