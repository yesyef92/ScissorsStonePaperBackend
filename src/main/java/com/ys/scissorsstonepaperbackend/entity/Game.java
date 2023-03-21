package com.ys.scissorsstonepaperbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_choice")
    private Choice userChoice;

    @Enumerated(EnumType.STRING)
    @Column(name = "computer_choice")
    private Choice computerChoice;

    @Enumerated(EnumType.STRING)
    @Column(name = "result")
    private Result result;

    @Column(name = "played_at")
    private LocalDateTime playedAt;

    public Game(Choice userChoice, Choice computerChoice, Result result) {
        this.userChoice = userChoice;
        this.computerChoice = computerChoice;
        this.result = result;
        this.playedAt = LocalDateTime.now();
    }

}
