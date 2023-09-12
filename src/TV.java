public class TV {
    int channel;// mac dinh la 0;
    int volume; // mac dinh la 0;
    boolean status; // mac dinh la false

    public TV(){};

    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void channelUp(){
        this.channel ++;
    }
    public void channelDown(){
        this.channel --;
    }
    public void volumeUp(){
        this.volume++;
    }
    public void volumeDown(){
        this.volume--;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", status=" + status +
                '}';
    }
}
