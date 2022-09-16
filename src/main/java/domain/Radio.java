package domain;
public class Radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    };

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    };

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    };

    public void increaseVolume(int newCurrenVolume) {
        if (newCurrenVolume == 10) {
            currentVolume = newCurrenVolume;
        } else {
            currentVolume = newCurrenVolume + 1;
        }
    }

    public void decreaseVolume(int newCurrenVolume) {
        if (newCurrenVolume == 0) {
            currentVolume = newCurrenVolume;
        } else {
            currentVolume = newCurrenVolume - 1;
        }
    }

    public int next(int station) {
        if (station == 9) {
            currentStation = 0;
        } else {
        currentStation = station + 1;
        }
        return currentStation;
    }

    public void prev(int station) {
        if (station == 0) {
            currentStation = 9;
        } else {
        currentStation = station - 1;
        }
    }

}
