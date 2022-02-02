package ru.netology.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationUp(5);
        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextStationIfCurrentStationEquals9() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationUp(10);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationDown(5);
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevStationIfCurrentStationEquals0() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationDown(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void enterRadioStation() {
        Radio radio = new Radio();
        radio.enterStation(5);
        int expected = 5;
        int actual = radio.getEnterStation();
        assertEquals(expected, actual);
    }


    @Test
    public void volumeNextStep() {
        Radio radio = new Radio();
        radio.setCurrentVolumeUp(5);
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeNextIfVolumeLevelMax() {
        Radio radio = new Radio();
        radio.setCurrentVolumeUp(11);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolumeDown(5);
        int expected = 4;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


    @Test
    public void volumeNextIfVolumeLevelZero() {
        Radio radio = new Radio();
        radio.setCurrentVolumeDown(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }


}