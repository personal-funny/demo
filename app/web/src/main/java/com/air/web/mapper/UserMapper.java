package com.air.web.mapper;

import com.air.dal.modal.UserDO;
import com.air.web.dto.UserDTO;

/**
 * @author lx48475
 * @version Id: UserMapper.java, v 0.1 2017年07月31 16:22 lx48475 Exp $
 */
public class UserMapper {

    public static UserDTO getUserDTO(UserDO userDO) {
        UserDTO dto = new UserDTO();
        dto.setId(userDO.getId());
        dto.setUserName(userDO.getUserName());
        dto.setPassword(userDO.getPassword());
        dto.setDescription(userDO.getDescription());
        return dto;
    }

    public static UserDO getUserDO(UserDTO userDTO) {
        UserDO userDO = new UserDO();
        userDO.setId(userDTO.getId());
        userDO.setUserName(userDTO.getUserName());
        userDO.setPassword(userDTO.getPassword());
        userDO.setDescription(userDTO.getDescription());
        return  userDO;
    }
}
