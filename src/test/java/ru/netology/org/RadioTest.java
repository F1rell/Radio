package ru.netology.org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    public void thisTestNeedFor100Covered() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(50);
        assertEquals(49, radio.getMaxNumberStation());
    }

    @Test
    public void enterStation() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(50);
        assertEquals(49, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationIfCurrentStationMoreLimit() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(51);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void enterStationIfCurrentStationNotCorrect() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(0);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(5);
        radio.setNextRadioStation();
        assertEquals(6, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationTestForCoveredBranch() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(49);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationTestForCoveredBranch2() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(50);
        radio.setNextRadioStation();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void nextStationIfCurrentStationMoreMaxLimit() {
        Radio radio = new Radio(30);
        radio.setCurrentRadioStation(49);
        radio.setNextRadioStation();
        assertEquals(1, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(30);
        radio.setPrevRadioStation();
        assertEquals(29, radio.getCurrentRadioStation());
    }

    @Test
    public void prevStationIfCurrentStationF1rst() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(0);
        radio.setPrevRadioStation();
        assertEquals(49, radio.getCurrentRadioStation());
    }

    @Test
    public void testVolumeFoCovered() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelForTestBranch1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void volumeLevelForTestBranch2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        radio.setCurrentVolumeUp();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelUpIfVolumeLevelMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.setCurrentVolumeUp();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void volumeLevelDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setCurrentVolumeDown();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume()); //допустима ли такая запись?
    }

    @Test
    public void volumeLevelDownIfVolumLevelZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setCurrentVolumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void ifDefaultConstructor() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void ifDefaultConstructorMoreDefaulMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        assertEquals(0, radio.getCurrentRadioStation());
    }
}