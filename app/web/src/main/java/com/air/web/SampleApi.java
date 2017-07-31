package com.air.web;

import com.air.biz.service.SampleService;
import com.air.dal.modal.UserDO;
import com.air.web.dto.UserDTO;
import com.air.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx48475
 * @version Id: SampleApi.java, v 0.1 2017年07月31 16:17 lx48475 Exp $
 */
@RestController
public class SampleApi {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void saveUser(UserDTO dto) {
        UserDO userDO = UserMapper.getUserDO(dto);
        sampleService.create(userDO);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteUser(UserDTO dto) {
        UserDO userDO = UserMapper.getUserDO(dto);
        sampleService.delete(userDO);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void updateUser(UserDTO dto) {
        UserDO userDO = UserMapper.getUserDO(dto);
        sampleService.update(userDO);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserDTO getUser(long id) {
        UserDO user = sampleService.get(id);
        return UserMapper.getUserDTO(user);
    }

}
