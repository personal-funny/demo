package com.air.dal.adapter.transformer;

import com.air.dal.adapter.vo.UserVO;
import com.air.dal.modal.UserDO;
import org.springframework.beans.BeanUtils;

/**
 * @author lx48475
 * @version Id: UserMapper.java, v 0.1 2017年08月01 11:29 lx48475 Exp $
 */
public class UserMapper {

    public static UserVO getUserVO(UserDO userDO) {
        UserVO vo = new UserVO();
        vo.setId(userDO.getId());
        vo.setUserName(userDO.getUserName());
        vo.setPassword(userDO.getPassword());
        vo.setDescription(userDO.getDescription());
        return vo;
    }

    public static UserDO getUserDO(UserVO vo) {
        UserDO userDO = new UserDO();
        userDO.setId(vo.getId());
        userDO.setUserName(vo.getUserName());
        userDO.setPassword(vo.getPassword());
        userDO.setDescription(vo.getDescription());
        return userDO;
    }
}
