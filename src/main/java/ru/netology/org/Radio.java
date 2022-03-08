package ru.netology.org;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxDefaultStation;
    private int maxVolumeLevel = 100;

    public Radio(int maxDefaultStation) {
        this.maxDefaultStation = maxDefaultStation;
    }

    public Radio() {
        maxDefaultStation = 10;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation <= 0) {
            return;
        }
        if (newCurrentRadioStation > maxDefaultStation - 1) {
            this.currentRadioStation = maxDefaultStation - 1;
            return;
        }
        this.currentRadioStation = newCurrentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == maxDefaultStation - 1) {
            setCurrentRadioStation(0);
            return;
        }
        currentRadioStation = currentRadioStation+1;
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == 0) {
            setCurrentRadioStation(maxDefaultStation - 1);
            return;
        }
        currentRadioStation = currentRadioStation - 1;
        setCurrentRadioStation(currentRadioStation);
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolumeLevel) {
            return;
        }
        if (currentVolume <= 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeUp() {
        if (currentVolume < maxVolumeLevel) {
            currentVolume++;
        } else {
            currentVolume = maxVolumeLevel;
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