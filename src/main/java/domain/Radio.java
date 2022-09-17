package domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        int volume;
        if (currentVolume == 10) {
            volume = currentVolume;
        } else {
            volume = currentVolume + 1;
        }
        currentVolume = volume;
    }

    public void decreaseVolume() {
        int volume;
        if (currentVolume == 0) {
            volume = currentVolume;
        } else {
            volume = currentVolume - 1;
        }
        currentVolume = volume;
    }

    public void next() {
        int station;
        if (currentStation == 9) {
            station = 0;
        } else {
            station = currentStation + 1;
        }
        currentStation = station;
    }

    public void prev() {
        int station;
        if (currentStation == 0) {
            station = 9;
        } else {
            station = currentStation - 1;
        }
        currentStation = station;
    }

}
