
package me.naganithin.bdaa.hw8common.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "meta",
    "altimeter",
    "clouds",
    "flight_rules",
    "other",
    "sanitized",
    "visibility",
    "wind_direction",
    "wind_gust",
    "wind_speed",
    "wx_codes",
    "raw",
    "station",
    "time",
    "remarks",
    "dewpoint",
    "remarks_info",
    "runway_visibility",
    "temperature",
    "wind_variable_direction",
    "units"
})
public class WeatherReportResponse {

    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("altimeter")
    private Altimeter altimeter;
    @JsonProperty("clouds")
    private List<Cloud> clouds = null;
    @JsonProperty("flight_rules")
    private String flight_rules;
    @JsonProperty("other")
    private List<Object> other = null;
    @JsonProperty("sanitized")
    private String sanitized;
    @JsonProperty("visibility")
    private Visibility visibility;
    @JsonProperty("wind_direction")
    private Wind_direction wind_direction;
    @JsonProperty("wind_gust")
    private Wind_gust wind_gust;
    @JsonProperty("wind_speed")
    private Wind_speed wind_speed;
    @JsonProperty("wx_codes")
    private List<Wx_code> wx_codes = null;
    @JsonProperty("raw")
    private String raw;
    @JsonProperty("station")
    private String station;
    @JsonProperty("time")
    private Time time;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("dewpoint")
    private Dewpoint dewpoint;
    @JsonProperty("remarks_info")
    private Remarks_info remarks_info;
    @JsonProperty("runway_visibility")
    private List<Object> runway_visibility = null;
    @JsonProperty("temperature")
    private Temperature temperature;
    @JsonProperty("wind_variable_direction")
    private List<Object> wind_variable_direction = null;
    @JsonProperty("units")
    private Units units;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("altimeter")
    public Altimeter getAltimeter() {
        return altimeter;
    }

    @JsonProperty("altimeter")
    public void setAltimeter(Altimeter altimeter) {
        this.altimeter = altimeter;
    }

    @JsonProperty("clouds")
    public List<Cloud> getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(List<Cloud> clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("flight_rules")
    public String getFlight_rules() {
        return flight_rules;
    }

    @JsonProperty("flight_rules")
    public void setFlight_rules(String flight_rules) {
        this.flight_rules = flight_rules;
    }

    @JsonProperty("other")
    public List<Object> getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(List<Object> other) {
        this.other = other;
    }

    @JsonProperty("sanitized")
    public String getSanitized() {
        return sanitized;
    }

    @JsonProperty("sanitized")
    public void setSanitized(String sanitized) {
        this.sanitized = sanitized;
    }

    @JsonProperty("visibility")
    public Visibility getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind_direction")
    public Wind_direction getWind_direction() {
        return wind_direction;
    }

    @JsonProperty("wind_direction")
    public void setWind_direction(Wind_direction wind_direction) {
        this.wind_direction = wind_direction;
    }

    @JsonProperty("wind_gust")
    public Wind_gust getWind_gust() {
        return wind_gust;
    }

    @JsonProperty("wind_gust")
    public void setWind_gust(Wind_gust wind_gust) {
        this.wind_gust = wind_gust;
    }

    @JsonProperty("wind_speed")
    public Wind_speed getWind_speed() {
        return wind_speed;
    }

    @JsonProperty("wind_speed")
    public void setWind_speed(Wind_speed wind_speed) {
        this.wind_speed = wind_speed;
    }

    @JsonProperty("wx_codes")
    public List<Wx_code> getWx_codes() {
        return wx_codes;
    }

    @JsonProperty("wx_codes")
    public void setWx_codes(List<Wx_code> wx_codes) {
        this.wx_codes = wx_codes;
    }

    @JsonProperty("raw")
    public String getRaw() {
        return raw;
    }

    @JsonProperty("raw")
    public void setRaw(String raw) {
        this.raw = raw;
    }

    @JsonProperty("station")
    public String getStation() {
        return station;
    }

    @JsonProperty("station")
    public void setStation(String station) {
        this.station = station;
    }

    @JsonProperty("time")
    public Time getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(Time time) {
        this.time = time;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("dewpoint")
    public Dewpoint getDewpoint() {
        return dewpoint;
    }

    @JsonProperty("dewpoint")
    public void setDewpoint(Dewpoint dewpoint) {
        this.dewpoint = dewpoint;
    }

    @JsonProperty("remarks_info")
    public Remarks_info getRemarks_info() {
        return remarks_info;
    }

    @JsonProperty("remarks_info")
    public void setRemarks_info(Remarks_info remarks_info) {
        this.remarks_info = remarks_info;
    }

    @JsonProperty("runway_visibility")
    public List<Object> getRunway_visibility() {
        return runway_visibility;
    }

    @JsonProperty("runway_visibility")
    public void setRunway_visibility(List<Object> runway_visibility) {
        this.runway_visibility = runway_visibility;
    }

    @JsonProperty("temperature")
    public Temperature getTemperature() {
        return temperature;
    }

    @JsonProperty("temperature")
    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("wind_variable_direction")
    public List<Object> getWind_variable_direction() {
        return wind_variable_direction;
    }

    @JsonProperty("wind_variable_direction")
    public void setWind_variable_direction(List<Object> wind_variable_direction) {
        this.wind_variable_direction = wind_variable_direction;
    }

    @JsonProperty("units")
    public Units getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(Units units) {
        this.units = units;
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
