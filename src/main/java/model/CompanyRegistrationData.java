
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
    "partnerId",
    "available",
    "legalAddressInfo",
    "operationInfo",
    "contactInfo",
    "companyInfo",
    "shippingInfo",
    "integrationInfo",
    "sellerInfo",
    "productInfo",
    "additionalInfo",
    "deviceDetails"
})
public class CompanyRegistrationData {

    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("partnerId")
    private String partnerId;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("legalAddressInfo")
    private LegalAddressInfo legalAddressInfo;
    @JsonProperty("operationInfo")
    private OperationInfo operationInfo;
    @JsonProperty("contactInfo")
    private ContactInfo contactInfo;
    @JsonProperty("companyInfo")
    private CompanyInfo companyInfo;
    @JsonProperty("shippingInfo")
    private ShippingInfo shippingInfo;
    @JsonProperty("integrationInfo")
    private IntegrationInfo integrationInfo;
    @JsonProperty("sellerInfo")
    private SellerInfo sellerInfo;
    @JsonProperty("productInfo")
    private ProductInfo productInfo;
    @JsonProperty("additionalInfo")
    private AdditionalInfo additionalInfo;
    @JsonProperty("deviceDetails")
    private List<DeviceDetail> deviceDetails = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public CompanyRegistrationData() {
    }

    /**
     * 
     * @param deviceDetails
     * @param operationInfo
     * @param contactInfo
     * @param companyInfo
     * @param shippingInfo
     * @param available
     * @param sellerInfo
     * @param productInfo
     * @param legalAddressInfo
     * @param additionalInfo
     * @param integrationInfo
     * @param partnerId
     * @param timestamp
     */
    public CompanyRegistrationData(Long timestamp, String partnerId, Boolean available, LegalAddressInfo legalAddressInfo, OperationInfo operationInfo, ContactInfo contactInfo, CompanyInfo companyInfo, ShippingInfo shippingInfo, IntegrationInfo integrationInfo, SellerInfo sellerInfo, ProductInfo productInfo, AdditionalInfo additionalInfo, List<DeviceDetail> deviceDetails) {
        super();
        this.timestamp = timestamp;
        this.partnerId = partnerId;
        this.available = available;
        this.legalAddressInfo = legalAddressInfo;
        this.operationInfo = operationInfo;
        this.contactInfo = contactInfo;
        this.companyInfo = companyInfo;
        this.shippingInfo = shippingInfo;
        this.integrationInfo = integrationInfo;
        this.sellerInfo = sellerInfo;
        this.productInfo = productInfo;
        this.additionalInfo = additionalInfo;
        this.deviceDetails = deviceDetails;
    }

    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("partnerId")
    public String getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partnerId")
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("legalAddressInfo")
    public LegalAddressInfo getLegalAddressInfo() {
        return legalAddressInfo;
    }

    @JsonProperty("legalAddressInfo")
    public void setLegalAddressInfo(LegalAddressInfo legalAddressInfo) {
        this.legalAddressInfo = legalAddressInfo;
    }

    @JsonProperty("operationInfo")
    public OperationInfo getOperationInfo() {
        return operationInfo;
    }

    @JsonProperty("operationInfo")
    public void setOperationInfo(OperationInfo operationInfo) {
        this.operationInfo = operationInfo;
    }

    @JsonProperty("contactInfo")
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    @JsonProperty("contactInfo")
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @JsonProperty("companyInfo")
    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    @JsonProperty("companyInfo")
    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }

    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    @JsonProperty("shippingInfo")
    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    @JsonProperty("integrationInfo")
    public IntegrationInfo getIntegrationInfo() {
        return integrationInfo;
    }

    @JsonProperty("integrationInfo")
    public void setIntegrationInfo(IntegrationInfo integrationInfo) {
        this.integrationInfo = integrationInfo;
    }

    @JsonProperty("sellerInfo")
    public SellerInfo getSellerInfo() {
        return sellerInfo;
    }

    @JsonProperty("sellerInfo")
    public void setSellerInfo(SellerInfo sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    @JsonProperty("productInfo")
    public ProductInfo getProductInfo() {
        return productInfo;
    }

    @JsonProperty("productInfo")
    public void setProductInfo(ProductInfo productInfo) {
        this.productInfo = productInfo;
    }

    @JsonProperty("additionalInfo")
    public AdditionalInfo getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(AdditionalInfo additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("deviceDetails")
    public List<DeviceDetail> getDeviceDetails() {
        return deviceDetails;
    }

    @JsonProperty("deviceDetails")
    public void setDeviceDetails(List<DeviceDetail> deviceDetails) {
        this.deviceDetails = deviceDetails;
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
        return new ToStringBuilder(this).append("timestamp", timestamp).append("partnerId", partnerId).append("available", available).append("legalAddressInfo", legalAddressInfo).append("operationInfo", operationInfo).append("contactInfo", contactInfo).append("companyInfo", companyInfo).append("shippingInfo", shippingInfo).append("integrationInfo", integrationInfo).append("sellerInfo", sellerInfo).append("productInfo", productInfo).append("additionalInfo", additionalInfo).append("deviceDetails", deviceDetails).append("additionalProperties", additionalProperties).toString();
    }

}
