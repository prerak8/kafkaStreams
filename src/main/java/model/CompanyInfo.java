
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
    "legalName",
    "webSite",
    "taxType",
    "dunsNumber",
    "fein",
    "incorporation"
})
public class CompanyInfo {

    @JsonProperty("legalName")
    private String legalName;
    @JsonProperty("webSite")
    private String webSite;
    @JsonProperty("taxType")
    private String taxType;
    @JsonProperty("dunsNumber")
    private String dunsNumber;
    @JsonProperty("fein")
    private String fein;
    @JsonProperty("incorporation")
    private Incorporation incorporation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CompanyInfo() {
    }

    /**
     * 
     * @param legalName
     * @param webSite
     * @param incorporation
     * @param fein
     * @param dunsNumber
     * @param taxType
     */
    public CompanyInfo(String legalName, String webSite, String taxType, String dunsNumber, String fein, Incorporation incorporation) {
        super();
        this.legalName = legalName;
        this.webSite = webSite;
        this.taxType = taxType;
        this.dunsNumber = dunsNumber;
        this.fein = fein;
        this.incorporation = incorporation;
    }

    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    @JsonProperty("webSite")
    public String getWebSite() {
        return webSite;
    }

    @JsonProperty("webSite")
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @JsonProperty("taxType")
    public String getTaxType() {
        return taxType;
    }

    @JsonProperty("taxType")
    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    @JsonProperty("dunsNumber")
    public String getDunsNumber() {
        return dunsNumber;
    }

    @JsonProperty("dunsNumber")
    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    @JsonProperty("fein")
    public String getFein() {
        return fein;
    }

    @JsonProperty("fein")
    public void setFein(String fein) {
        this.fein = fein;
    }

    @JsonProperty("incorporation")
    public Incorporation getIncorporation() {
        return incorporation;
    }

    @JsonProperty("incorporation")
    public void setIncorporation(Incorporation incorporation) {
        this.incorporation = incorporation;
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
        return new ToStringBuilder(this).append("legalName", legalName).append("webSite", webSite).append("taxType", taxType).append("dunsNumber", dunsNumber).append("fein", fein).append("incorporation", incorporation).append("additionalProperties", additionalProperties).toString();
    }

}
