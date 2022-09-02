package ru.netology.JavaRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    Radio radio = new Radio();

    //@ParameterizedTest
    //@CsvFileSource(files = "src/test/resources/data.csv")
    //public void shouldSetCurrentVolume(int expected, int newCurrentVolume) {

    //radio.setCurrentVolume(newCurrentVolume);
    // int actual = radio.getCurrentVolume();

    // Assertions.assertEquals(expected, actual);

    //}


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataStation.csv")

    public void shouldSetCurrentStation(int expected, int newCurrentStation) {

        radio.setCurrentStation(newCurrentStation);
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataNext.csv")

    public void shouldSetNextStation(int expected, int newCurrentStation) {

        radio.setCurrentStation(newCurrentStation);
        radio.next();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataPrev.csv")

    public void shouldSetPrevStation(int expected, int newCurrentStation) {

        radio.setCurrentStation(newCurrentStation);
        radio.prev();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/dataIncreaseVol.csv")

    public void shouldIncreaseVolume(int expected, int newCurrentVolume) {

        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    // @ParameterizedTest
    // @CsvFileSource(files = "src/test/resources/dataDecreaseVol.csv")

    //public void shouldDecreaseVolume(int expected, int newCurrentVolume) {

    //   radio.setCurrentVolume(newCurrentVolume);
    //   radio.decreaseVolume();

    //  int actual = radio.getCurrentVolume();

    //  Assertions.assertEquals(expected, actual);
    // }

}



