
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
    "timestamp",
    "available",
    "isPartnershipSuspended",
    "isDuplicatePhoneNumber",
    "isDuplicateName",
    "isDuplicateEmail",
    "isOtherPartnership",
    "isDuplicateLegalName",
    "isDuplicateDBAName",
    "isDuplicateWareHouseAddress",
    "isDuplicateLegalAddress",
    "highRiskCategory",
    "partnershipTags",
    "emailDomains",
    "accountGeo"
})
public class ImperiumData {

    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("isPartnershipSuspended")
    private Boolean isPartnershipSuspended;
    @JsonProperty("isDuplicatePhoneNumber")
    private Boolean isDuplicatePhoneNumber;
    @JsonProperty("isDuplicateName")
    private Boolean isDuplicateName;
    @JsonProperty("isDuplicateEmail")
    private Boolean isDuplicateEmail;
    @JsonProperty("isOtherPartnership")
    private Boolean isOtherPartnership;
    @JsonProperty("isDuplicateLegalName")
    private Boolean isDuplicateLegalName;
    @JsonProperty("isDuplicateDBAName")
    private Boolean isDuplicateDBAName;
    @JsonProperty("isDuplicateWareHouseAddress")
    private Boolean isDuplicateWareHouseAddress;
    @JsonProperty("isDuplicateLegalAddress")
    private Boolean isDuplicateLegalAddress;
    @JsonProperty("highRiskCategory")
    private List<String> highRiskCategory = null;
    @JsonProperty("partnershipTags")
    private List<String> partnershipTags = null;
    @JsonProperty("emailDomains")
    private List<String> emailDomains = null;
    @JsonProperty("accountGeo")
    private String accountGeo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ImperiumData() {
    }

    /**
     * 
     * @param isDuplicateLegalName
     * @param isPartnershipSuspended
     * @param isDuplicateEmail
     * @param available
     * @param emailDomains
     * @param highRiskCategory
     * @param isDuplicatePhoneNumber
     * @param isOtherPartnership
     * @param isDuplicateDBAName
     * @param partnershipTags
     * @param accountGeo
     * @param isDuplicateWareHouseAddress
     * @param isDuplicateName
     * @param timestamp
     * @param isDuplicateLegalAddress
     */
    public ImperiumData(Long timestamp, Boolean available, Boolean isPartnershipSuspended, Boolean isDuplicatePhoneNumber, Boolean isDuplicateName, Boolean isDuplicateEmail, Boolean isOtherPartnership, Boolean isDuplicateLegalName, Boolean isDuplicateDBAName, Boolean isDuplicateWareHouseAddress, Boolean isDuplicateLegalAddress, List<String> highRiskCategory, List<String> partnershipTags, List<String> emailDomains, String accountGeo) {
        super();
        this.timestamp = timestamp;
        this.available = available;
        this.isPartnershipSuspended = isPartnershipSuspended;
        this.isDuplicatePhoneNumber = isDuplicatePhoneNumber;
        this.isDuplicateName = isDuplicateName;
        this.isDuplicateEmail = isDuplicateEmail;
        this.isOtherPartnership = isOtherPartnership;
        this.isDuplicateLegalName = isDuplicateLegalName;
        this.isDuplicateDBAName = isDuplicateDBAName;
        this.isDuplicateWareHouseAddress = isDuplicateWareHouseAddress;
        this.isDuplicateLegalAddress = isDuplicateLegalAddress;
        this.highRiskCategory = highRiskCategory;
        this.partnershipTags = partnershipTags;
        this.emailDomains = emailDomains;
        this.accountGeo = accountGeo;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("isPartnershipSuspended")
    public Boolean getIsPartnershipSuspended() {
        return isPartnershipSuspended;
    }

    @JsonProperty("isPartnershipSuspended")
    public void setIsPartnershipSuspended(Boolean isPartnershipSuspended) {
        this.isPartnershipSuspended = isPartnershipSuspended;
    }

    @JsonProperty("isDuplicatePhoneNumber")
    public Boolean getIsDuplicatePhoneNumber() {
        return isDuplicatePhoneNumber;
    }

    @JsonProperty("isDuplicatePhoneNumber")
    public void setIsDuplicatePhoneNumber(Boolean isDuplicatePhoneNumber) {
        this.isDuplicatePhoneNumber = isDuplicatePhoneNumber;
    }

    @JsonProperty("isDuplicateName")
    public Boolean getIsDuplicateName() {
        return isDuplicateName;
    }

    @JsonProperty("isDuplicateName")
    public void setIsDuplicateName(Boolean isDuplicateName) {
        this.isDuplicateName = isDuplicateName;
    }

    @JsonProperty("isDuplicateEmail")
    public Boolean getIsDuplicateEmail() {
        return isDuplicateEmail;
    }

    @JsonProperty("isDuplicateEmail")
    public void setIsDuplicateEmail(Boolean isDuplicateEmail) {
        this.isDuplicateEmail = isDuplicateEmail;
    }

    @JsonProperty("isOtherPartnership")
    public Boolean getIsOtherPartnership() {
        return isOtherPartnership;
    }

    @JsonProperty("isOtherPartnership")
    public void setIsOtherPartnership(Boolean isOtherPartnership) {
        this.isOtherPartnership = isOtherPartnership;
    }

    @JsonProperty("isDuplicateLegalName")
    public Boolean getIsDuplicateLegalName() {
        return isDuplicateLegalName;
    }

    @JsonProperty("isDuplicateLegalName")
    public void setIsDuplicateLegalName(Boolean isDuplicateLegalName) {
        this.isDuplicateLegalName = isDuplicateLegalName;
    }

    @JsonProperty("isDuplicateDBAName")
    public Boolean getIsDuplicateDBAName() {
        return isDuplicateDBAName;
    }

    @JsonProperty("isDuplicateDBAName")
    public void setIsDuplicateDBAName(Boolean isDuplicateDBAName) {
        this.isDuplicateDBAName = isDuplicateDBAName;
    }

    @JsonProperty("isDuplicateWareHouseAddress")
    public Boolean getIsDuplicateWareHouseAddress() {
        return isDuplicateWareHouseAddress;
    }

    @JsonProperty("isDuplicateWareHouseAddress")
    public void setIsDuplicateWareHouseAddress(Boolean isDuplicateWareHouseAddress) {
        this.isDuplicateWareHouseAddress = isDuplicateWareHouseAddress;
    }

    @JsonProperty("isDuplicateLegalAddress")
    public Boolean getIsDuplicateLegalAddress() {
        return isDuplicateLegalAddress;
    }

    @JsonProperty("isDuplicateLegalAddress")
    public void setIsDuplicateLegalAddress(Boolean isDuplicateLegalAddress) {
        this.isDuplicateLegalAddress = isDuplicateLegalAddress;
    }

    @JsonProperty("highRiskCategory")
    public List<String> getHighRiskCategory() {
        return highRiskCategory;
    }

    @JsonProperty("highRiskCategory")
    public void setHighRiskCategory(List<String> highRiskCategory) {
        this.highRiskCategory = highRiskCategory;
    }

    @JsonProperty("partnershipTags")
    public List<String> getPartnershipTags() {
        return partnershipTags;
    }

    @JsonProperty("partnershipTags")
    public void setPartnershipTags(List<String> partnershipTags) {
        this.partnershipTags = partnershipTags;
    }

    @JsonProperty("emailDomains")
    public List<String> getEmailDomains() {
        return emailDomains;
    }

    @JsonProperty("emailDomains")
    public void setEmailDomains(List<String> emailDomains) {
        this.emailDomains = emailDomains;
    }

    @JsonProperty("accountGeo")
    public String getAccountGeo() {
        return accountGeo;
    }

    @JsonProperty("accountGeo")
    public void setAccountGeo(String accountGeo) {
        this.accountGeo = accountGeo;
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
        return new ToStringBuilder(this).append("timestamp", timestamp).append("available", available).append("isPartnershipSuspended", isPartnershipSuspended).append("isDuplicatePhoneNumber", isDuplicatePhoneNumber).append("isDuplicateName", isDuplicateName).append("isDuplicateEmail", isDuplicateEmail).append("isOtherPartnership", isOtherPartnership).append("isDuplicateLegalName", isDuplicateLegalName).append("isDuplicateDBAName", isDuplicateDBAName).append("isDuplicateWareHouseAddress", isDuplicateWareHouseAddress).append("isDuplicateLegalAddress", isDuplicateLegalAddress).append("highRiskCategory", highRiskCategory).append("partnershipTags", partnershipTags).append("emailDomains", emailDomains).append("accountGeo", accountGeo).append("additionalProperties", additionalProperties).toString();
    }

}
