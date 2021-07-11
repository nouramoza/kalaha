package com.bol.kalaha.service.impl;

import com.bol.kalaha.domain.Board;
import com.bol.kalaha.domain.Game;
import com.bol.kalaha.domain.Player;
import com.bol.kalaha.service.KalahaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KalahaServiceImpl implements KalahaService {
    @Override
    public Board start() {
        return new Board();
    }

    @Override
    public Game initialize(String player1, String player2, Board board) {
        Game game = new Game();
        game.setBoard(board);
        Player.turn = 1;
        Player p1 = new Player();
        p1.setName(player1);
        Player p2 = new Player();
        p2.setName(player1);
        game.setPlayer1(p1);
        game.setPlayer2(p2);

        return game;
    }
}
