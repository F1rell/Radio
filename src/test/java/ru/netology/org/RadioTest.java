package ru.netology.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void numberRadioChannel() {
        Radio cond = new Radio(5);
        cond.setNumberRadioChannel();
        assertEquals(5, cond.getNumberRadioChannel());
    }

    @Test
    public void numberRadioChannelAboveInterval() {
        Radio cond = new Radio(11);
        cond.setNumberRadioChannel();
        assertEquals(10, cond.getNumberRadioChannel());
    }

    @Test
    public void currentRadioStation() {
        Radio cond = new Radio(1);
        cond.setCurrentRadioStation();
        assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationDefaultLimitRadioChannel() {
        Radio cond = new Radio();
        cond.setNextRadioStation(9);
        assertEquals(0, cond.getNextRadioStation());
    }

    @Test
    public void nextRadioStationLimitSetRadioChannel() {
        Radio cond = new Radio(20);
        cond.setNumberRadioChannel();
        cond.setNextRadioStation(0);
        assertEquals(1, cond.getNextRadioStation());
    }

    @Test
    public void prevRadioStationDefaultLimitRadioChannel() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(9);
        assertEquals(8, cond.getPrevRadioStation());
    }

    @Test
    public void prevRadioStation20Chanel() {
        Radio cond = new Radio(20);
        cond.setCurrentRadioStation();
        cond.setPrevRadioStation(0);
        assertEquals(9, cond.getPrevRadioStation());
    }

    @Test
    public void currentSoundVolume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(101);
        assertEquals(100, cond.getCurrentSoundVolume());
    }

    @Test
    public void currentSoundVolumeBelowLimit() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(-1);
        assertEquals(0, cond.getCurrentSoundVolume());
    }

    @Test
    public void nextSoundVolumeDefaultLimit() {
        Radio cond = new Radio();
        cond.nextSoundVolume();
        cond.setCurrentSoundVolume(100);
        assertEquals(100, cond.getCurrentSoundVolume());
    }

    @Test
    public void prevSoundVolume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume(1);
        cond.prevSoundVolume();
        assertEquals(0, cond.getCurrentSoundVolume());
    }
}