
package model;

import java.util.HashMap;
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
    "companyRegistrationData",
    "imperiumData"
})
public class Data {

    @JsonProperty("companyRegistrationData")
    private CompanyRegistrationData companyRegistrationData;
    @JsonProperty("imperiumData")
    private ImperiumData imperiumData;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param companyRegistrationData
     * @param imperiumData
     */
    public Data(CompanyRegistrationData companyRegistrationData, ImperiumData imperiumData) {
        super();
        this.companyRegistrationData = companyRegistrationData;
        this.imperiumData = imperiumData;
    }

    @JsonProperty("companyRegistrationData")
    public CompanyRegistrationData getCompanyRegistrationData() {
        return companyRegistrationData;
    }

    @JsonProperty("companyRegistrationData")
    public void setCompanyRegistrationData(CompanyRegistrationData companyRegistrationData) {
        this.companyRegistrationData = companyRegistrationData;
    }

    @JsonProperty("imperiumData")
    public ImperiumData getImperiumData() {
        return imperiumData;
    }

    @JsonProperty("imperiumData")
    public void setImperiumData(ImperiumData imperiumData) {
        this.imperiumData = imperiumData;
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
        return new ToStringBuilder(this).append("companyRegistrationData", companyRegistrationData).append("imperiumData", imperiumData).append("additionalProperties", additionalProperties).toString();
    }

}
