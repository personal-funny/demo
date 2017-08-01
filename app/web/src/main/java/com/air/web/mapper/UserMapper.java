package com.air.web.mapper;

import com.air.dal.adapter.vo.UserVO;
import com.air.web.dto.UserDTO;

/**
 * @author lx48475
 * @version Id: UserMapper.java, v 0.1 2017年07月31 16:22 lx48475 Exp $
 */
public class UserMapper {

    public static UserDTO getUserDTO(UserVO vo) {
        UserDTO dto = new UserDTO();
        dto.setId(vo.getId());
        dto.setUserName(vo.getUserName());
        dto.setPassword(vo.getPassword());
        dto.setDescription(vo.getDescription());
        return dto;
    }

    public static UserVO getUserDO(UserDTO userDTO) {
        UserVO vo = new UserVO();
        vo.setId(userDTO.getId());
        vo.setUserName(userDTO.getUserName());
        vo.setPassword(userDTO.getPassword());
        vo.setDescription(userDTO.getDescription());
        return  vo;
    }
}
