
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "methods",
    "fulfillOrdersBy2pmMonFri"
})
public class ShippingInfo {

    @JsonProperty("methods")
    private List<String> methods = null;
    @JsonProperty("fulfillOrdersBy2pmMonFri")
    private Boolean fulfillOrdersBy2pmMonFri;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ShippingInfo() {
    }

    /**
     * 
     * @param methods
     * @param fulfillOrdersBy2pmMonFri
     */
    public ShippingInfo(List<String> methods, Boolean fulfillOrdersBy2pmMonFri) {
        super();
        this.methods = methods;
        this.fulfillOrdersBy2pmMonFri = fulfillOrdersBy2pmMonFri;
    }

    @JsonProperty("methods")
    public List<String> getMethods() {
        return methods;
    }

    @JsonProperty("methods")
    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    @JsonProperty("fulfillOrdersBy2pmMonFri")
    public Boolean getFulfillOrdersBy2pmMonFri() {
        return fulfillOrdersBy2pmMonFri;
    }

    @JsonProperty("fulfillOrdersBy2pmMonFri")
    public void setFulfillOrdersBy2pmMonFri(Boolean fulfillOrdersBy2pmMonFri) {
        this.fulfillOrdersBy2pmMonFri = fulfillOrdersBy2pmMonFri;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("methods", methods).append("fulfillOrdersBy2pmMonFri", fulfillOrdersBy2pmMonFri).append("additionalProperties", additionalProperties).toString();
    }

}
