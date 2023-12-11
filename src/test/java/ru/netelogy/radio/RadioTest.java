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
// ////////////////////////////////////////////////////////////
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
    public void shouldSetLouderVolume () {  // Volume louder громче
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

    // гр.зн.


    @Test // -1 похожий тест - не выставлять меньше минимального
    public void shouldNotSetFirstLeftBorderVolumeValue() {      // не должен устанавливать первое левое граничное значение громкости
        Radio radio = new Radio();

        radio.setCurrentNumber(-1);

        int expected = 0;                          // не должна переключиться
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // 0 - но этот тест уже есть как минимум
    public void shouldSetSecondLeftBorderVolumeValue() {    // должен устанавливать второе левое граничное значение громкости
        Radio radio = new Radio();

        radio.setCurrentNumber(0);

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // 1
    public void shouldSetThirdLeftBorderVolumeValue() {  //  должен устанавливать третье левое граничное значение громкости
        Radio radio = new Radio();

        radio.setCurrentNumber(1);

        int expected = 1;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // 99
    public void shouldSetFirstRightBorderVolumeValue() {  //  должен устанавливать первое правое граничное значение громкости
        Radio radio = new Radio();

        radio.setCurrentNumber(99);

        int expected = 99;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // 100 - есть как максимум
    public void shouldSetSecondRightBorderVolumeValue() {  //  должен устанавливать второе правое граничное значение громкости

        Radio radio = new Radio();

        radio.setCurrentNumber(100);

        int expected = 100;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test // 101 похожий тест есть - не выставлять больше максимума
    public void shouldNotSetThirdRightBorderVolumeValue() {  //  не должен устанавливать третье правое граничное значение громкости
        Radio radio = new Radio();

        radio.setCurrentNumber(101);

        int expected = 0;               // не должна меняться                ?
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }


}
