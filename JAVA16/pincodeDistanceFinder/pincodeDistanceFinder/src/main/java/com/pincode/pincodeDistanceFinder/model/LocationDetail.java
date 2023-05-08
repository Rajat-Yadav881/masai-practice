package com.pincode.pincodeDistanceFinder.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class LocationDetail {

    @JsonProperty("name")
    private String name;

    @JsonProperty("local_names")
    @JsonIgnore
    private List<String> localName;

    @JsonProperty("lat")
    private String lat;

    @JsonProperty("lon")
    private String lon;

    @JsonProperty("country")
    private String country;

    @JsonProperty("state")
    private String state;
}
