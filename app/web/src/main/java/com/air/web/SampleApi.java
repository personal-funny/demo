package com.air.web;

import com.air.biz.service.SampleService;
import com.air.dal.adapter.vo.UserVO;
import com.air.web.dto.UserDTO;
import com.air.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lx48475
 * @version Id: SampleApi.java, v 0.1 2017年07月31 16:17 lx48475 Exp $
 */
@RestController
public class SampleApi {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDTO dto) {
        UserVO vo = UserMapper.getUserDO(dto);
        sampleService.create(vo);
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public void deleteUser(@RequestParam UserDTO dto) {
        UserVO vo = UserMapper.getUserDO(dto);
        sampleService.delete(vo);
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public void updateUser(@RequestBody UserDTO dto) {
        UserVO vo = UserMapper.getUserDO(dto);
        sampleService.update(vo);
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserDTO getUser(@PathVariable("id") long id) {
        UserVO user = sampleService.get(id);
        return UserMapper.getUserDTO(user);
    }

}
