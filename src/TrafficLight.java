public enum TrafficLight {
    RED(50),
    YELLOW(25),
    GREEN(60);

    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
