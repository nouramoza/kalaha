package com.bol.kalaha.service.impl;

import com.bol.kalaha.domain.Board;
import com.bol.kalaha.domain.Game;
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
}
