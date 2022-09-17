package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation0() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStation9() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAbove9() {
        Radio station = new Radio();
        station.setCurrentStation(999);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationLess0() {
        Radio station = new Radio();
        station.setCurrentStation(-5);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStation() {
        Radio nextStation = new Radio();
        nextStation.setCurrentStation(8);
        nextStation.next();
        int expected = 9;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationAbove9() {
        Radio nextStation = new Radio();
        nextStation.setCurrentStation(9);
        nextStation.next();
        int expected = 0;
        int actual = nextStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStation() {
        Radio prevStation = new Radio();
        prevStation.setCurrentStation(9);
        prevStation.prev();
        int expected = 8;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationLess0() {
        Radio prevStation = new Radio();
        prevStation.setCurrentStation(0);
        prevStation.prev();
        int expected = 9;
        int actual = prevStation.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotIncreaseVolumeAbove10() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeLess0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
