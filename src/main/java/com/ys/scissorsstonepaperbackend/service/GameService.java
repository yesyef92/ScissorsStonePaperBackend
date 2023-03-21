package com.ys.scissorsstonepaperbackend.service;

import com.ys.scissorsstonepaperbackend.dto.GameResponse;
import com.ys.scissorsstonepaperbackend.entity.Choice;
import com.ys.scissorsstonepaperbackend.entity.Game;
import com.ys.scissorsstonepaperbackend.entity.Result;
import com.ys.scissorsstonepaperbackend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameResponse playGame(Choice userChoice) {
        // Generate a random computer choice
        Choice computerChoice = Choice.values()[new Random().nextInt(Choice.values().length)];

        // Determine the result of the game
        Result result = userChoice.getResultAgainst(computerChoice);

        // Save the game to the database
        Game game = new Game(userChoice, computerChoice, result);
        game = gameRepository.save(game);

        // Create a response containing the game and its result
        GameResponse gameResponse = new GameResponse(game.getUserChoice(), game.getComputerChoice(), game.getResult(), game.getPlayedAt());
        return gameResponse;
    }

    public List<GameResponse> getAllGames() {
        // Retrieve all games from the database
        List<Game> games = gameRepository.findAll();

        // Convert the games to a list of game responses
        List<GameResponse> gameResponses = games.stream()
                .map(game -> new GameResponse(game.getUserChoice(), game.getComputerChoice(), game.getResult(), game.getPlayedAt()))
                .collect(Collectors.toList());
        return gameResponses;
    }
}
