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
        } else {
            currentRadioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
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
        } else {
            currentRadioStation = 10;
        }
    }

    public void setCurrentVolumeDown() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}