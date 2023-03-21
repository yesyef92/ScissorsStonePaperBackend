package com.ys.scissorsstonepaperbackend.entity;

public enum Choice {
    SCISSORS("SCISSORS"),
    STONE("STONE"),
    PAPER("PAPER");

    private String value;

    private Choice(String value) {
        this.value = value;
    }


    public static Choice fromValue(String value) {
        for (Choice choice : values()) {
            if (choice.value.equalsIgnoreCase(value)) {
                return choice;
            }
        }
        throw new IllegalArgumentException("Invalid choice value: " + value);
    }

    public Result getResultAgainst(Choice otherChoice) {
        switch (otherChoice) {
            case SCISSORS:
                return (this == Choice.PAPER) ? Result.LOSS : (this == Choice.SCISSORS) ? Result.TIE : Result.WIN;
            case STONE:
                return (this == Choice.SCISSORS) ? Result.LOSS : (this == Choice.STONE) ? Result.TIE : Result.WIN;
            case PAPER:
                return (this == Choice.STONE) ? Result.LOSS : (this == Choice.PAPER) ? Result.TIE : Result.WIN;
            default:
                throw new IllegalArgumentException("Invalid choice: " + otherChoice);
        }
    }

}
