package com.bol.kalaha.domain;

import org.springframework.stereotype.Component;

@Component
public class Game {

    private Long id;
    private Board board;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", board=" + board +
                '}';
    }
}
