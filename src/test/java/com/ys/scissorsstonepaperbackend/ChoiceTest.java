package com.ys.scissorsstonepaperbackend;

import com.ys.scissorsstonepaperbackend.entity.Choice;
import com.ys.scissorsstonepaperbackend.entity.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChoiceTest {

    @Test
    public void testGetResultAgainst() {
        assertEquals(Result.WIN, Choice.STONE.getResultAgainst(Choice.SCISSORS));
        assertEquals(Result.LOSS, Choice.STONE.getResultAgainst(Choice.PAPER));
        assertEquals(Result.TIE, Choice.STONE.getResultAgainst(Choice.STONE));
        assertEquals(Result.WIN, Choice.PAPER.getResultAgainst(Choice.STONE));
        assertEquals(Result.LOSS, Choice.PAPER.getResultAgainst(Choice.SCISSORS));
        assertEquals(Result.TIE, Choice.PAPER.getResultAgainst(Choice.PAPER));
        assertEquals(Result.WIN, Choice.SCISSORS.getResultAgainst(Choice.PAPER));
        assertEquals(Result.LOSS, Choice.SCISSORS.getResultAgainst(Choice.STONE));
        assertEquals(Result.TIE, Choice.SCISSORS.getResultAgainst(Choice.SCISSORS));
    }
}
