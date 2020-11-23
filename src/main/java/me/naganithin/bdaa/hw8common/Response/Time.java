
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
    "dt"
})
public class Time {

    @JsonProperty("repr")
    private String repr;
    @JsonProperty("dt")
    private String dt;
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

    @JsonProperty("dt")
    public String getDt() {
        return dt;
    }

    @JsonProperty("dt")
    public void setDt(String dt) {
        this.dt = dt;
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
