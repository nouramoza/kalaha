package com.bol.kalaha.domain;

import com.bol.kalaha.enums.BoardConstant;
import org.springframework.stereotype.Component;

@Component
public class Board {
    private Long id;
    int[] pitPlayer1 = {6,6,6,6,6,6};
    int[] pitPlayer2 = {6,6,6,6,6,6};
    int bigPitPlayer1 = 0;
    int bigPitPlayer2 = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int[] getPitPlayer1() {
        return pitPlayer1;
    }

    public void setPitPlayer1(int[] pitPlayer1) {
        this.pitPlayer1 = pitPlayer1;
    }

    public int[] getPitPlayer2() {
        return pitPlayer2;
    }

    public void setPitPlayer2(int[] pitPlayer2) {
        this.pitPlayer2 = pitPlayer2;
    }

    public int getBigPitPlayer1() {
        return bigPitPlayer1;
    }

    public void setBigPitPlayer1(int bigPitPlayer1) {
        this.bigPitPlayer1 = bigPitPlayer1;
    }

    public int getBigPitPlayer2() {
        return bigPitPlayer2;
    }

    public void setBigPitPlayer2(int bigPitPlayer2) {
        this.bigPitPlayer2 = bigPitPlayer2;
    }
}
