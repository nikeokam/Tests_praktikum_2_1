package com.company.Events;

import org.json.JSONObject;

public class PredictionsWeatherEvent {

    public String getForecast() {
        return forecast.toString();
    }

    private final JSONObject forecast;

    public PredictionsWeatherEvent(JSONObject jsonObject) {
        this.forecast = jsonObject.getJSONArray("list").getJSONObject(0);


    }
}
