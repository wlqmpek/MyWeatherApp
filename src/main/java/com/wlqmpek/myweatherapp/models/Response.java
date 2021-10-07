package com.wlqmpek.myweatherapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

    private Weather5Days weather5Days;
}
