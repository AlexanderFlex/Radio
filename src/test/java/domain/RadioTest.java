package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    int max = 12; //инициализация поля для задания тестового параметра "количество станций"

    @Test
    public void amountTest() {
        Radio amountRadio = new Radio(max);
       Assertions.assertEquals(max, amountRadio.amount );
    }

    @Test
    public void amountTestDefault() {
        Radio amountRadio = new Radio();
        Assertions.assertEquals(10, amountRadio.amount );
    }

    @Test
    public void shouldSetStationMax() {
        Radio station = new Radio(max);
        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0Default() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationDefault() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMax1() {
        Radio station = new Radio(max);
        station.setCurrentStation(11);
        int expected = 11;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveDefault() {
        Radio station = new Radio();
        station.setCurrentStation(999);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio station = new Radio(max);
        station.setCurrentStation(999);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationLess0Default() {
        Radio station = new Radio();
        station.setCurrentStation(-5);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationLess0Max() {
        Radio station = new Radio(max);
        station.setCurrentStation(-5);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationDefault() {
        Radio nextStation = new Radio();
        nextStation.setCurrentStation(8);
        nextStation.next();
        int expected = 9;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radio nextStation = new Radio(max);
        nextStation.setCurrentStation(10);
        nextStation.next();
        int expected = 11;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveMax() {
        Radio nextStation = new Radio(max);
        nextStation.setCurrentStation(max-1);
        nextStation.next();
        int expected = 0;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAboveDefault() {
        Radio nextStation = new Radio();
        nextStation.setCurrentStation(9);
        nextStation.next();
        int expected = 0;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationDefault() {
        Radio prevStation = new Radio();
        prevStation.setCurrentStation(9);
        prevStation.prev();
        int expected = 8;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMax() {
        Radio prevStation = new Radio(max);
        prevStation.setCurrentStation(11);
        prevStation.prev();
        int expected = 10;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationLess0Default() {
        Radio prevStation = new Radio();
        prevStation.setCurrentStation(0);
        prevStation.prev();
        int expected = 9;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationLess0Max() {
        Radio prevStation = new Radio(max);
        prevStation.setCurrentStation(0);
        prevStation.prev();
        int expected = max - 1;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio(max);
        volume.setCurrentVolume(5);
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio(max);
        volume.setCurrentVolume(5);
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotIncreaseVolumeAbove100() {
        Radio volume = new Radio(max);
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLess0() {
        Radio volume = new Radio(max);
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
