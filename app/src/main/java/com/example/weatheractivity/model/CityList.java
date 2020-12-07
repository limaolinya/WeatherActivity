package com.example.weatheractivity.model;

/**
 * 定制已选城市列表的ListView界面
 *
 * @author liang
 */
public class CityList {

    private String cityName;

    public CityList(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

}
