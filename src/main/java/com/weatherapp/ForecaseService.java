package com.weatherapp;

import com.weatherapp.model.ForecastTable;
import com.weatherapp.repository.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class ForecaseService {

    @Autowired
    ForecastRepository forecastRepository;

    public ForecastTable get(String location){
        return forecastRepository.findByLocation(location);
    }

    public void deleteByCreatedAtBefore(Date date){
        forecastRepository.deleteByCreatedDateBefore(date);
    }

    public ForecastTable save(ForecastTable table){
        return forecastRepository.save(table);
    }


}
