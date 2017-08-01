package com.air.dal.impl;

import com.air.dal.adapter.ISample;
import com.air.dal.adapter.vo.UserVO;
import com.air.dal.dao.SampleDAO;
import com.air.dal.mapper.UserMapper;
import com.air.dal.modal.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lx48475
 * @version Id: SampleImpl.java, v 0.1 2017年08月01 11:32 lx48475 Exp $
 */
@Service
public class SampleImpl implements ISample {

    @Autowired
    private SampleDAO sampleDAO;

    @Override
    public void create(UserVO vo) {
        sampleDAO.create(UserMapper.getUserDO(vo));
    }

    @Override
    public void delete(UserVO vo) {
        sampleDAO.delete(UserMapper.getUserDO(vo));
    }

    @Override
    public void update(UserVO vo) {
        sampleDAO.update(UserMapper.getUserDO(vo));
    }

    @Override
    public UserVO get(long id) {
        UserDO userDO = sampleDAO.get(id);
        return UserMapper.getUserVO(userDO);
    }
}
