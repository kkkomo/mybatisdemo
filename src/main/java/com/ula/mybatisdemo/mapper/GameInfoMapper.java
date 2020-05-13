package com.ula.mybatisdemo.mapper;

import com.ula.mybatisdemo.bean.GameInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liuyalan on 2020/5/7.
 */
@Mapper
public interface GameInfoMapper {

    GameInfo selectById(Integer id);

    Integer insertGame(GameInfo gameInfo);

    Integer updateById(@Param("id") Integer id, @Param("gameType") Integer gameType);
}