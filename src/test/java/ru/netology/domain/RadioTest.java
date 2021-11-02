package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test

    public void shouldGetAndSetMaxVolume() {
        Radio radio = new Radio();
        int expected = 130;
        radio.setMaxVolume(expected);
        assertEquals(expected, radio.getMaxVolume());
    }

    @Test

    public void shouldGetAndSetMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinVolume();
        radio.setMinVolume(expected);
        assertEquals(expected, actual);
    }

    @Test

    public void shouldGetAndSetMinChannel() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setMinChannel(expected);
        assertEquals(expected, radio.getMinChannel());
    }

    @Test

    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test

    public void shouldSetCurrentVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-50);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetCurrentVolume4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(200);
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }


    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }


    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int expected = 4;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void next() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void next2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(10);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void next3() {
        Radio radio = new Radio(60);
        radio.setCurrentChannel(55);
        radio.next();
        int expected = 56;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void next4() {
        Radio radio = new Radio(60);
        radio.setCurrentChannel(59);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev3() {
        Radio radio = new Radio();
        radio.setCurrentChannel(50);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev2() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev4() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev5() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(36);
        radio.prev();
        int expected = 35;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void prev6() {
        Radio radio = new Radio(50);
        radio.setCurrentChannel(0);
        radio.prev();
        int expected = 49;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel() {
        Radio radio = new Radio();

        radio.setCurrentChannel(24);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel2() {
        Radio radio = new Radio(30);

        radio.setCurrentChannel(24);
        int expected = 24;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentChannel3() {
        Radio radio = new Radio(30);

        radio.setCurrentChannel(35);
        int expected = 0;
        int actual = radio.getCurrentChannel();

        assertEquals(expected, actual);
    }
}
