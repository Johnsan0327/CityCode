package Model.Returnmodel;

import Model.clouds;
import Model.main;
import Model.wind;

import java.util.ArrayList;

public class allReturnWeather {
    private returnSys returnSys;

    public Model.Returnmodel.returnSys getReturnSys() {
        return returnSys;
    }

    public void setReturnSys(Model.Returnmodel.returnSys returnSys) {
        this.returnSys = returnSys;
    }


    public ArrayList<Model.Returnmodel.returnWeather> getReturnWeather() {
        return returnWeather;
    }

    public void setReturnWeather(ArrayList<Model.Returnmodel.returnWeather> returnWeather) {
        this.returnWeather = returnWeather;
    }

    private ArrayList<returnWeather> returnWeather;

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    private Model.main main;
    private String visibility;
    private wind wind;
    private clouds clouds;

    public Model.main getMain() {
        return main;
    }

    public void setMain(Model.main main) {
        this.main = main;
    }



    public Model.wind getWind() {
        return wind;
    }

    public void setWind(Model.wind wind) {
        this.wind = wind;
    }

    public Model.clouds getClouds() {
        return clouds;
    }

    public void setClouds(Model.clouds clouds) {
        this.clouds = clouds;
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

    private int dt;
    private int id;
    private String name;
}
