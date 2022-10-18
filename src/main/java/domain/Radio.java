package domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int currentVolume;
    public final int amount;


    public Radio() {
        this.amount = 10;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > amount) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        int volume;
        if (currentVolume == 100) {
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
        if (currentStation == amount - 1) {
            station = 0;
        } else {
            station = currentStation + 1;
        }
        currentStation = station;
    }

    public void prev() {
        int station;
        if (currentStation == 0) {
            station = amount - 1;
        } else {
            station = currentStation - 1;
        }
        currentStation = station;
    }

}
