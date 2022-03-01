package ru.netology.org;

public class Radio {

    private int numberRadioChannel = 10;
    private int currentRadioStation;
    private int nextRadioStation;
    private int prevRadioStation;
    private int currentSoundVolume = 100;

    public Radio() {
    }

    public Radio(int numberRadioChannel) {
        this.numberRadioChannel = numberRadioChannel;
    }

    public int getNumberRadioChannel() {
        return numberRadioChannel;
    }

    public int setNumberRadioChannel() {
        if (numberRadioChannel < 10) {
            numberRadioChannel = numberRadioChannel;
        }
        if (numberRadioChannel >= 10) {
            numberRadioChannel = 10;
        }
        this.numberRadioChannel = numberRadioChannel;
        return numberRadioChannel;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation() {
        setNumberRadioChannel();
        currentRadioStation = numberRadioChannel - 1;
        this.currentRadioStation = currentRadioStation;
    }

    public int getNextRadioStation() {
        return nextRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation) {
        nextRadioStation = currentRadioStation + 1;
        if (nextRadioStation >= numberRadioChannel - 1) {
            nextRadioStation = 0;
        }
        nextRadioStation = nextRadioStation;
    }

    public int getPrevRadioStation() {
        return prevRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation) {
        prevRadioStation = currentRadioStation - 1;
        if (prevRadioStation < 0) {
            prevRadioStation = numberRadioChannel - 1;
        }
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 100) {
            currentSoundVolume = 100;
        }
        if (currentSoundVolume < 0) {
            currentSoundVolume = 0;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void nextSoundVolume() {
        int nextSoundVolume = currentSoundVolume + 1;
        currentSoundVolume = nextSoundVolume;

    }

    public void prevSoundVolume() {
        int prevSoundVolume = currentSoundVolume - 1;
        currentSoundVolume = prevSoundVolume;

    }
}