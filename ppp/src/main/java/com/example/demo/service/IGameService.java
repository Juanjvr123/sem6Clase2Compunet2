package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Game;

public interface IGameService {

    List<Game> removeDefaultGames();
    List<Game> getAllGames();
}
