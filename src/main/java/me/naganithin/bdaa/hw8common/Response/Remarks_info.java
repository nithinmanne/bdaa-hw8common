
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
    "dewpoint_decimal",
    "temperature_decimal"
})
public class Remarks_info {

    @JsonProperty("dewpoint_decimal")
    private Dewpoint_decimal dewpoint_decimal;
    @JsonProperty("temperature_decimal")
    private Temperature_decimal temperature_decimal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dewpoint_decimal")
    public Dewpoint_decimal getDewpoint_decimal() {
        return dewpoint_decimal;
    }

    @JsonProperty("dewpoint_decimal")
    public void setDewpoint_decimal(Dewpoint_decimal dewpoint_decimal) {
        this.dewpoint_decimal = dewpoint_decimal;
    }

    @JsonProperty("temperature_decimal")
    public Temperature_decimal getTemperature_decimal() {
        return temperature_decimal;
    }

    @JsonProperty("temperature_decimal")
    public void setTemperature_decimal(Temperature_decimal temperature_decimal) {
        this.temperature_decimal = temperature_decimal;
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
