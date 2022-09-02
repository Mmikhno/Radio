package ru.netology.JavaRadio;

public class Radio {
    protected int maxVolume = 100;
    protected int currentVolume;
    protected int maxStation;
    protected int currentStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int numStation) {
        maxStation = numStation - 1;
    }

    public int getCurrentStation() {
        //получение текущей станции
        return currentStation;
    }

    public int getCurrentVolume() {
        //получение текущего звука
        return currentVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMaxVolume(){
        return maxVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        //изменение текущей станции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        //изменение звука
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        //переключение станции на следующую
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        //переключение станции на предыдущую
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        int targetVolume = currentVolume + 1;
        setCurrentVolume(targetVolume);
    }

    public void decreaseVolume() {
        int targetVolume = currentVolume - 1;
        setCurrentVolume(targetVolume);
    }


}
