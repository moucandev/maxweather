package com.example.maxweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by mouca on 2017/8/5.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}