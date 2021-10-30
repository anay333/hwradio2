package ru.netology.domain;

public class Radio {

    private int currentVolume;
    private int currentChannel;
    private int maxVolume = 10;
    private int minVolume = 0;
    private int minChannel = 0;
    private int maxChannel = 9;

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getMaxChannel() {

        return maxChannel;
    }

    public void setMaxChannel(int maxChannel) {

        this.maxChannel = maxChannel;
    }

    public int getMinChannel() {

        return minChannel;
    }

    public void setMinChannel(int minChannel) {

        this.minChannel = minChannel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > maxVolume) {
            return;
        }
        if (newCurrentVolume < minVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > maxChannel) {
            return;
        }
        if (newCurrentChannel < minChannel) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        currentChannel = currentChannel + 1;
        if (currentChannel == 10) {
            currentChannel = 0;
        }
    }


    public void prev() {

        currentChannel = currentChannel - 1;

        if (currentChannel == -1) {
            currentChannel = maxChannel;
        }
    }


    public void setNewChannel(int newChannel) {
        if (newChannel > maxChannel) {
            return;
        }
        if (newChannel < minChannel) {
            return;
        }
        currentChannel = newChannel;
    }
}

