package com.ula.mybatisdemo.service;

import com.ula.mybatisdemo.bean.GameInfo;
import com.ula.mybatisdemo.mapper.GameInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by liuyalan on 2020/5/7.
 */
@Slf4j
@Service
public class GameInfoService {

    @Autowired
    private GameInfoMapper gameInfoMapper;

    public GameInfo getById(Integer id) {
        return gameInfoMapper.selectById(id);
    }

    public GameInfo insertGame() {
        GameInfo gameInfo = new GameInfo();
        gameInfo.setCreateDate(new Date());
        gameInfo.setGameType(23);
        gameInfo.setGameName("testGame");
        Integer integer = gameInfoMapper.insertGame(gameInfo);
        log.info("insert result:{}", integer);
        return gameInfo;
    }

    public GameInfo updateGame(Integer id, Integer type) {
        Integer integer = gameInfoMapper.updateById(id, type);
        log.info("update result:{}", integer);
        return gameInfoMapper.selectById(id);
    }
}
