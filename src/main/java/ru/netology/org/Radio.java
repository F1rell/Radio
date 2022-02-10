package ru.netology.org;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation <= 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
            return;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
            return;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeUp() {
        if (currentVolume < 10) {
            currentVolume++;
        }
        if (currentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}