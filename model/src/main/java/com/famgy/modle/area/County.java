package com.famgy.modle.area;

import org.litepal.crud.DataSupport;

/**
 * Created by famgy on 3/12/18.
 */

public class County extends DataSupport{

    private int id;

    private String weather_id;

    private String countyName;

    private String weather_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeather_Id() {
        return weather_id;
    }

    public void setWeather_Id(String id) {
        this.weather_id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeather_url() {
        return weather_url;
    }

    public void setWeather_url(String weather_url) {
        this.weather_url = weather_url;
    }
}