package Model;

public class main {
   private float temp;
   private int pressure;
   private int humidity;

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public float getTemo_max() {
        return temo_max;
    }

    public void setTemo_max(float temo_max) {
        this.temo_max = temo_max;
    }

    private float temp_min;
   private float temo_max;
}
