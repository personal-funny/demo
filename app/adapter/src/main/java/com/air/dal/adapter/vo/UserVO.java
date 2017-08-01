package com.air.dal.adapter.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lx48475
 * @version Id: UserVO.java, v 0.1 2017年08月01 11:24 lx48475 Exp $
 */
@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = -4250188776736301037L;

    private long id;
    private String userName;
    private String password;
    private String description;
}
