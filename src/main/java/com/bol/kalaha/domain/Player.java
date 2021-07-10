package com.bol.kalaha.domain;

import org.springframework.stereotype.Component;

@Component
public class Player {
    public static int turn;
    private int smallPit[] = new int[6];
    private int bigPit;

    private String name;
    private int noOfSets;
    private int noOfWins;
    private int noOfPots;

    public int[] getSmallPit() {
        return smallPit;
    }

    public void setSmallPit(int[] smallPit) {
        this.smallPit = smallPit;
    }

    public int getBigPit() {
        return bigPit;
    }

    public void setBigPit(int bigPit) {
        this.bigPit = bigPit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfSets() {
        return noOfSets;
    }

    public void setNoOfSets(int noOfSets) {
        this.noOfSets = noOfSets;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfPots() {
        return noOfPots;
    }

    public void setNoOfPots(int noOfPots) {
        this.noOfPots = noOfPots;
    }
}
