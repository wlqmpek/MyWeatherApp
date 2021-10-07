package com.wlqmpek.myweatherapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather5Days {


    @JsonProperty("daily")
    private List<Weather1Day> fiveDaysWeather;
    private double lat;
    private double lon;

}
