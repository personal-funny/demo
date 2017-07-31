package com.air.dal.modal;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lx48475
 * @version Id: UserDO.java, v 0.1 2017年07月31 15:48 lx48475 Exp $
 */
@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = -3113868872948417025L;

    private long id;
    private String userName;
    private String password;
    private String description;
}
