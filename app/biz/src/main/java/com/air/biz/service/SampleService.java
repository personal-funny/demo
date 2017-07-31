package com.air.biz.service;

import com.air.dal.dao.SampleDAO;
import com.air.dal.modal.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lx48475
 * @version Id: SampleService.java, v 0.1 2017年07月31 16:05 lx48475 Exp $
 */
@Service
public class SampleService {

    @Autowired
    private SampleDAO sampleDAO;

    public void create(UserDO user) {
        sampleDAO.create(user);
    }

    public void delete(UserDO user) {
        sampleDAO.delete(user);
    }

    public void update(UserDO user) {
        sampleDAO.update(user);
    }

    public UserDO get(long id) {
        return sampleDAO.get(id);
    }

}
