package com.air.dal.adapter;

import com.air.dal.adapter.vo.UserVO;

/**
 * @author lx48475
 * @version Id: ISample.java, v 0.1 2017年08月01 11:23 lx48475 Exp $
 */
public interface ISample {

    public void create(UserVO vo);

    public void delete(UserVO vo);

    public void update(UserVO vo);

    public UserVO get(long id);
}
