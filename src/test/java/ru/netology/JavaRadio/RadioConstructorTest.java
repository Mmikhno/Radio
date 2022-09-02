package ru.netology.JavaRadio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioConstructorTest {

    Radio radio = new Radio(100);

    @ParameterizedTest
    @CsvSource({
            "25,25",
            "99,99",
            "100,0",
            "101,0"
    })
    public void shouldSetCurrentStation(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    //тесты для метода Next

    @ParameterizedTest
    @CsvSource({
            "25,26",
            "98,99",
            "99,0"
    })
    public void shouldSetNextStation(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);
        radio.next();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "35,34",
            "1,0",
            "0,99"
    })
    public void shouldSetPrevStation(int newCurrentStation, int expected) {
        radio.setCurrentStation(newCurrentStation);
        radio.prev();
        Assertions.assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource({
            "0,1",
            "50,51",
            "99,100",
            "100,100"
    })
    public void shouldIncreaseVol(int newCurrentVolume, int expected) {
        radio.setCurrentVolume(newCurrentVolume);
        radio.increaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "0,0",
            "50,49"
    })
    public void shouldDecreaseVol(int newCurrentVolume, int expected) {
        radio.setCurrentVolume(newCurrentVolume);
        radio.decreaseVolume();
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

}
