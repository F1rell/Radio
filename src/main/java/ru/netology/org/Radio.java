package ru.netology.org;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int enterStation;


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getEnterStation() {
        return enterStation;
    }

    public void setCurrentRadioStationUp(int currentRadioStation) {
        if (currentRadioStation >= 9) {
            currentRadioStation = 9;
        }
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentRadioStationDown(int currentRadioStation) {
        if (currentRadioStation == 0) {
            currentRadioStation = 0;
        }
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void enterStation(int enterStation) {
        if (enterStation >= 0) {
            enterStation = enterStation;
        }
        if (enterStation >= 10) {
            enterStation = 10;
        }
        this.enterStation = enterStation;
    }


    public void setCurrentVolumeUp(int currentVolume) {
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    public void setCurrentVolumeDown(int currentVolume) {
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }


}


