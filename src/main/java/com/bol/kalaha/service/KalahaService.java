package com.bol.kalaha.service;

import com.bol.kalaha.domain.Board;
import com.bol.kalaha.domain.Game;

public interface KalahaService {

    Board start();

    Game initialize(String player1, String player2, Board board);
}
