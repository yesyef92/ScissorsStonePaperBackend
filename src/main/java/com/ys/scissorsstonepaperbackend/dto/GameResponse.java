package com.ys.scissorsstonepaperbackend.dto;

import com.ys.scissorsstonepaperbackend.entity.Choice;
import com.ys.scissorsstonepaperbackend.entity.Result;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GameResponse {

    private Choice userChoice;
    private Choice computerChoice;
    private Result result;
    private LocalDateTime playedAt;
}
