package com.ula.mybatisdemo.rest;

import com.ula.mybatisdemo.bean.GameInfo;
import com.ula.mybatisdemo.service.GameInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by liuyalan on 2020/5/7.
 */
@RequestMapping("/game")
@RestController
public class GameController {

    @Autowired
    private GameInfoService gameInfoService;

    @GetMapping("/{id}")
    public GameInfo getGame(@PathVariable("id") Integer id) {
        return gameInfoService.getById(id);
    }

    @GetMapping
    public GameInfo insertGame() {
        return gameInfoService.insertGame();
    }

    @PutMapping("/{id}/{type}")
    public GameInfo updateGame(@PathVariable("id") Integer id, @PathVariable("type") Integer type) {
        return gameInfoService.updateGame(id, type);
    }
}
