package ru.netelogy.radio;

public class Radio {
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {

        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        if (currentNumber < 0) {
            return;
        }
        if (currentNumber > 9) {
            return;
        }
        this.currentNumber = currentNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextRadioStation() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void prevRadioStation() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = 9;
        }
    }

    public void upVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1; //currentVolume++
        } else  {
            currentVolume = 100;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else  {
            currentVolume = 0;
        }
    }
}
