
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
    "premiumCategory",
    "revenue",
    "refurbishedSkusPercent",
    "invalidUPCSkusPercent",
    "usedSkusPercent",
    "catalogSize"
})
public class ProductInfo {

    @JsonProperty("premiumCategory")
    private String premiumCategory;
    @JsonProperty("revenue")
    private Long revenue;
    @JsonProperty("refurbishedSkusPercent")
    private Long refurbishedSkusPercent;
    @JsonProperty("invalidUPCSkusPercent")
    private Long invalidUPCSkusPercent;
    @JsonProperty("usedSkusPercent")
    private Long usedSkusPercent;
    @JsonProperty("catalogSize")
    private Long catalogSize;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductInfo() {
    }

    /**
     * 
     * @param premiumCategory
     * @param revenue
     * @param usedSkusPercent
     * @param invalidUPCSkusPercent
     * @param catalogSize
     * @param refurbishedSkusPercent
     */
    public ProductInfo(String premiumCategory, Long revenue, Long refurbishedSkusPercent, Long invalidUPCSkusPercent, Long usedSkusPercent, Long catalogSize) {
        super();
        this.premiumCategory = premiumCategory;
        this.revenue = revenue;
        this.refurbishedSkusPercent = refurbishedSkusPercent;
        this.invalidUPCSkusPercent = invalidUPCSkusPercent;
        this.usedSkusPercent = usedSkusPercent;
        this.catalogSize = catalogSize;
    }

    @JsonProperty("premiumCategory")
    public String getPremiumCategory() {
        return premiumCategory;
    }

    @JsonProperty("premiumCategory")
    public void setPremiumCategory(String premiumCategory) {
        this.premiumCategory = premiumCategory;
    }

    @JsonProperty("revenue")
    public Long getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(Long revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("refurbishedSkusPercent")
    public Long getRefurbishedSkusPercent() {
        return refurbishedSkusPercent;
    }

    @JsonProperty("refurbishedSkusPercent")
    public void setRefurbishedSkusPercent(Long refurbishedSkusPercent) {
        this.refurbishedSkusPercent = refurbishedSkusPercent;
    }

    @JsonProperty("invalidUPCSkusPercent")
    public Long getInvalidUPCSkusPercent() {
        return invalidUPCSkusPercent;
    }

    @JsonProperty("invalidUPCSkusPercent")
    public void setInvalidUPCSkusPercent(Long invalidUPCSkusPercent) {
        this.invalidUPCSkusPercent = invalidUPCSkusPercent;
    }

    @JsonProperty("usedSkusPercent")
    public Long getUsedSkusPercent() {
        return usedSkusPercent;
    }

    @JsonProperty("usedSkusPercent")
    public void setUsedSkusPercent(Long usedSkusPercent) {
        this.usedSkusPercent = usedSkusPercent;
    }

    @JsonProperty("catalogSize")
    public Long getCatalogSize() {
        return catalogSize;
    }

    @JsonProperty("catalogSize")
    public void setCatalogSize(Long catalogSize) {
        this.catalogSize = catalogSize;
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
        return new ToStringBuilder(this).append("premiumCategory", premiumCategory).append("revenue", revenue).append("refurbishedSkusPercent", refurbishedSkusPercent).append("invalidUPCSkusPercent", invalidUPCSkusPercent).append("usedSkusPercent", usedSkusPercent).append("catalogSize", catalogSize).append("additionalProperties", additionalProperties).toString();
    }

}
