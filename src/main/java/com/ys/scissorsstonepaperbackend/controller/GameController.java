package com.ys.scissorsstonepaperbackend.controller;

import com.ys.scissorsstonepaperbackend.dto.GameRequest;
import com.ys.scissorsstonepaperbackend.dto.GameResponse;
import com.ys.scissorsstonepaperbackend.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<GameResponse> playGame(@RequestBody GameRequest gameRequest) {
        GameResponse gameResponse = gameService.playGame(gameRequest.getUserChoice());
        return ResponseEntity.ok(gameResponse);
    }

    @GetMapping
    public ResponseEntity<List<GameResponse>> getAllGames() {
        List<GameResponse> gameResponses = gameService.getAllGames();
        return ResponseEntity.ok(gameResponses);
    }
}