package com.air.web.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lx48475
 * @version Id: UserDTO.java, v 0.1 2017年07月31 16:19 lx48475 Exp $
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -2419391914525147978L;

    private long id;
    private String userName;
    private String password;
    private String description;
}
