
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
    "productCategories",
    "foreignExporter",
    "dba",
    "tin",
    "jobTitle",
    "accounts"
})
public class SellerInfo {

    @JsonProperty("productCategories")
    private List<String> productCategories = null;
    @JsonProperty("foreignExporter")
    private Boolean foreignExporter;
    @JsonProperty("dba")
    private String dba;
    @JsonProperty("tin")
    private String tin;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("accounts")
    private List<Account> accounts = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellerInfo() {
    }

    /**
     * 
     * @param productCategories
     * @param foreignExporter
     * @param dba
     * @param jobTitle
     * @param tin
     * @param accounts
     */
    public SellerInfo(List<String> productCategories, Boolean foreignExporter, String dba, String tin, String jobTitle, List<Account> accounts) {
        super();
        this.productCategories = productCategories;
        this.foreignExporter = foreignExporter;
        this.dba = dba;
        this.tin = tin;
        this.jobTitle = jobTitle;
        this.accounts = accounts;
    }

    @JsonProperty("productCategories")
    public List<String> getProductCategories() {
        return productCategories;
    }

    @JsonProperty("productCategories")
    public void setProductCategories(List<String> productCategories) {
        this.productCategories = productCategories;
    }

    @JsonProperty("foreignExporter")
    public Boolean getForeignExporter() {
        return foreignExporter;
    }

    @JsonProperty("foreignExporter")
    public void setForeignExporter(Boolean foreignExporter) {
        this.foreignExporter = foreignExporter;
    }

    @JsonProperty("dba")
    public String getDba() {
        return dba;
    }

    @JsonProperty("dba")
    public void setDba(String dba) {
        this.dba = dba;
    }

    @JsonProperty("tin")
    public String getTin() {
        return tin;
    }

    @JsonProperty("tin")
    public void setTin(String tin) {
        this.tin = tin;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("accounts")
    public List<Account> getAccounts() {
        return accounts;
    }

    @JsonProperty("accounts")
    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
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
        return new ToStringBuilder(this).append("productCategories", productCategories).append("foreignExporter", foreignExporter).append("dba", dba).append("tin", tin).append("jobTitle", jobTitle).append("accounts", accounts).append("additionalProperties", additionalProperties).toString();
    }

}
