package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

import lombok.Data;

@Data
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
}
