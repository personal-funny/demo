package com.air.biz.service;

import com.air.dal.adapter.ISample;
import com.air.dal.adapter.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lx48475
 * @version Id: SampleService.java, v 0.1 2017年07月31 16:05 lx48475 Exp $
 */
@Service
public class SampleService {

    @Autowired
    private ISample sample;

    public void create(UserVO user) {
        sample.create(user);
    }

    public void delete(UserVO user) {
        sample.delete(user);
    }

    public void update(UserVO user) {
        sample.update(user);
    }

    public UserVO get(long id) {
        return sample.get(id);
    }

}
