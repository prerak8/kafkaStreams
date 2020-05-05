
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
    "outSideUS",
    "wareHouseAddress",
    "corporateAddress"
})
public class OperationInfo {

    @JsonProperty("outSideUS")
    private Boolean outSideUS;
    @JsonProperty("wareHouseAddress")
    private List<WareHouseAddress> wareHouseAddress = null;
    @JsonProperty("corporateAddress")
    private List<CorporateAddress> corporateAddress = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public OperationInfo() {
    }

    /**
     * 
     * @param outSideUS
     * @param corporateAddress
     * @param wareHouseAddress
     */
    public OperationInfo(Boolean outSideUS, List<WareHouseAddress> wareHouseAddress, List<CorporateAddress> corporateAddress) {
        super();
        this.outSideUS = outSideUS;
        this.wareHouseAddress = wareHouseAddress;
        this.corporateAddress = corporateAddress;
    }

    @JsonProperty("outSideUS")
    public Boolean getOutSideUS() {
        return outSideUS;
    }

    @JsonProperty("outSideUS")
    public void setOutSideUS(Boolean outSideUS) {
        this.outSideUS = outSideUS;
    }

    @JsonProperty("wareHouseAddress")
    public List<WareHouseAddress> getWareHouseAddress() {
        return wareHouseAddress;
    }

    @JsonProperty("wareHouseAddress")
    public void setWareHouseAddress(List<WareHouseAddress> wareHouseAddress) {
        this.wareHouseAddress = wareHouseAddress;
    }

    @JsonProperty("corporateAddress")
    public List<CorporateAddress> getCorporateAddress() {
        return corporateAddress;
    }

    @JsonProperty("corporateAddress")
    public void setCorporateAddress(List<CorporateAddress> corporateAddress) {
        this.corporateAddress = corporateAddress;
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
        return new ToStringBuilder(this).append("outSideUS", outSideUS).append("wareHouseAddress", wareHouseAddress).append("corporateAddress", corporateAddress).append("additionalProperties", additionalProperties).toString();
    }

}
