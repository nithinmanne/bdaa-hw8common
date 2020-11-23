
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
    "value",
    "spoken"
})
public class Dewpoint {

    @JsonProperty("repr")
    private String repr;
    @JsonProperty("value")
    private Integer value;
    @JsonProperty("spoken")
    private String spoken;
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

    @JsonProperty("value")
    public Integer getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Integer value) {
        this.value = value;
    }

    @JsonProperty("spoken")
    public String getSpoken() {
        return spoken;
    }

    @JsonProperty("spoken")
    public void setSpoken(String spoken) {
        this.spoken = spoken;
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
