package ru.netology.JavaRadio;

public class Radio {

    protected int currentStation;
    protected int currentVolume;

    public int getCurrentStation() {
        //получение текущей станции
        return currentStation;
    }

    public int getCurrentVolume() {
        //получение текущего звука
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        //изменение текущей станции
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        //изменение звука
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void next() {
        //переключение станции на следующую
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prev() {
        //переключение станции на предыдущую
        if (currentStation == 0) {
            currentStation = 9;
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
