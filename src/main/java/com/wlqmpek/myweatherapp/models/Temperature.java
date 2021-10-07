package com.wlqmpek.myweatherapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Temperature {
    @JsonProperty("min")
    private double minDailyTemp;
    @JsonProperty("max")
    private double maxDailyTemp;
}
