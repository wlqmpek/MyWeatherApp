package com.wlqmpek.myweatherapp.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
//End of lombok, start of JPA
@Entity
public class City {
    @Id
    private UUID id;
    private String name;
    private String country;
    private Double latitude;
    private Double longitude;
}
