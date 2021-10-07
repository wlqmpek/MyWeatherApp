package com.wlqmpek.myweatherapp.models;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class UserInput {
    private String cityName;
    private String countryCode;
}
