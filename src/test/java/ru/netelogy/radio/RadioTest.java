package ru.netelogy.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(5);

        int expected = 5;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(9);

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinNumber() {
        Radio radio = new Radio();

        radio.setCurrentNumber(0);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumber(6);

        radio.nextRadioStation();
        int expected = 7;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumberRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentNumber(4);

        radio.prevRadioStation();
        int expected = 3;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void ShouldNotSetNumberAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void ShouldNotSetNumberBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentNumber(9);

        int expected = 9;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetlouderVolume () {  // Volume louder громче
        Radio radio = new Radio();

        radio.setCurrentVolume(51);

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetQuietVolume() {  //  quiet  Volume   тише
        Radio radio = new Radio();
        radio.setCurrentVolume(49);

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void ShouldNotSetVolumeAboveMax() {  // louder  Volume громче макс
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public  void ShouldNotSetVolumeBelowMin() {  // Volume тише мин
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
