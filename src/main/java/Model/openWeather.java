package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class openWeather {
    private clouds clouds;
    private coord coord;
    private main main;
    private sys sys;
    private ArrayList<weather> weather;
    private wind wind;

    public Model.clouds getClouds() {
        return clouds;
    }

    public void setClouds(Model.clouds clouds) {
        this.clouds = clouds;
    }

    public Model.coord getCoord() {
        return coord;
    }

    public void setCoord(Model.coord coord) {
        this.coord = coord;
    }

    public Model.main getMain() {
        return main;
    }

    public void setMain(Model.main main) {
        this.main = main;
    }

    public Model.sys getSys() {
        return sys;
    }

    public void setSys(Model.sys sys) {
        this.sys = sys;
    }

    public ArrayList<Model.weather> getWeather() {
        return weather;
    }

    public void setWeather(ArrayList<Model.weather> weather) {
        this.weather = weather;
    }

    public Model.wind getWind() {
        return wind;
    }

    public void setWind(Model.wind wind) {
        this.wind = wind;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String visibility;
    private int dt;
    private int id;
    private String name;
}
