
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
    "repr",
    "type",
    "altitude",
    "modifier",
    "direction"
})
public class Cloud {

    @JsonProperty("repr")
    private String repr;
    @JsonProperty("type")
    private String type;
    @JsonProperty("altitude")
    private Integer altitude;
    @JsonProperty("modifier")
    private Object modifier;
    @JsonProperty("direction")
    private Object direction;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("repr")
    public String getRepr() {
        return repr;
    }

    @JsonProperty("repr")
    public void setRepr(String repr) {
        this.repr = repr;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("altitude")
    public Integer getAltitude() {
        return altitude;
    }

    @JsonProperty("altitude")
    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    @JsonProperty("modifier")
    public Object getModifier() {
        return modifier;
    }

    @JsonProperty("modifier")
    public void setModifier(Object modifier) {
        this.modifier = modifier;
    }

    @JsonProperty("direction")
    public Object getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(Object direction) {
        this.direction = direction;
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
