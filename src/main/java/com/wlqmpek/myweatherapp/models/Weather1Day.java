package com.wlqmpek.myweatherapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather1Day {
//    @JsonProperty("dt")
//    private LocalDateTime localDateTime;
    @JsonProperty("temp")
    private Temperature temperature;
}
