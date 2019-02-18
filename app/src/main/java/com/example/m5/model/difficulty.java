package com.example.m5.model;

public enum difficulty {
    BEGINER ("Beginer"),
    EASY ("Easy"),
    NORMAL("Normal"),
    HARD("Hard"),
    IMPOSSIBLE("Impossible");

    private final String difficulty;

    difficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty(){
        return difficulty;
    }

}
