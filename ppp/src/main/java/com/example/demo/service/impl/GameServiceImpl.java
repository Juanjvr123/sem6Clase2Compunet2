package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Game;
import com.example.demo.repository.IGameRepository;
import com.example.demo.service.IGameService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements IGameService {
    
    private final IGameRepository gameRepository;

    @Override
    @Transactional( rollbackOn = Exception.class)
    public List<Game> removeDefaultGames() {
        System.out.println("Removing default games...");

        List<Game> games = gameRepository.findAll();

        games.forEach(game -> {
            gameRepository.deleteById(game.getId());
            System.out.println("Deleted game: " + game.getName());
            if (game.getName().equals("Catan") || game.getName().equals("Checkers")) {
                throw new RuntimeException("Default games cannot be removed!");
            }
        });

        return games;
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
