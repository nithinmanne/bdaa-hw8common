
package me.naganithin.bdaa.hw8common.Response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "altimeter",
    "altitude",
    "temperature",
    "visibility",
    "wind_speed"
})
public class Units {

    @JsonProperty("altimeter")
    private String altimeter;
    @JsonProperty("altitude")
    private String altitude;
    @JsonProperty("temperature")
    private String temperature;
    @JsonProperty("visibility")
    private String visibility;
    @JsonProperty("wind_speed")
    private String wind_speed;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("altimeter")
    public String getAltimeter() {
        return altimeter;
    }

    @JsonProperty("altimeter")
    public void setAltimeter(String altimeter) {
        this.altimeter = altimeter;
    }

    @JsonProperty("altitude")
    public String getAltitude() {
        return altitude;
    }

    @JsonProperty("altitude")
    public void setAltitude(String altitude) {
        this.altitude = altitude;
    }

    @JsonProperty("temperature")
    public String getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("visibility")
    public String getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind_speed")
    public String getWind_speed() {
        return wind_speed;
    }

    @JsonProperty("wind_speed")
    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
