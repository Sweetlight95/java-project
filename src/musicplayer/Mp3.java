package musicplayer;

public class Mp3 {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }
    public void turnOn(boolean isOn) {
        this.isOn = isOn;
    }

    public void turnOff(boolean isOff) {
        this.isOn = isOff;
    }

    public boolean isOff() {
        return isOn;
    }

    public boolean playMusic(boolean playMusic) {
        return false;
    }
}
