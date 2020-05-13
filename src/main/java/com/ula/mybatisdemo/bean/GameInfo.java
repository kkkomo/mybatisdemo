package com.ula.mybatisdemo.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by liuyalan on 2019/2/18.
 */
@Data
//@TableName("game_info")
public class GameInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;
    private Date createDate;
    private Integer deleted = 0;
    private Date modifiedDate;
    private Integer gameType;
    private String gameName;
}
