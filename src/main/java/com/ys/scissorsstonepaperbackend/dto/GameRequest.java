package com.ys.scissorsstonepaperbackend.dto;

import com.ys.scissorsstonepaperbackend.entity.Choice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameRequest {

    private Choice userChoice;
    private Choice computerChoice;

}
