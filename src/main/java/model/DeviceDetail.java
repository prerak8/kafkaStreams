
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
    "browserInfo",
    "browserVersion",
    "userAgent",
    "deviceType",
    "deviceIp",
    "geoLocation"
})
public class DeviceDetail {

    @JsonProperty("browserInfo")
    private String browserInfo;
    @JsonProperty("browserVersion")
    private String browserVersion;
    @JsonProperty("userAgent")
    private String userAgent;
    @JsonProperty("deviceType")
    private String deviceType;
    @JsonProperty("deviceIp")
    private String deviceIp;
    @JsonProperty("geoLocation")
    private GeoLocation geoLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeviceDetail() {
    }

    /**
     * 
     * @param deviceType
     * @param deviceIp
     * @param geoLocation
     * @param browserVersion
     * @param userAgent
     * @param browserInfo
     */
    public DeviceDetail(String browserInfo, String browserVersion, String userAgent, String deviceType, String deviceIp, GeoLocation geoLocation) {
        super();
        this.browserInfo = browserInfo;
        this.browserVersion = browserVersion;
        this.userAgent = userAgent;
        this.deviceType = deviceType;
        this.deviceIp = deviceIp;
        this.geoLocation = geoLocation;
    }

    @JsonProperty("browserInfo")
    public String getBrowserInfo() {
        return browserInfo;
    }

    @JsonProperty("browserInfo")
    public void setBrowserInfo(String browserInfo) {
        this.browserInfo = browserInfo;
    }

    @JsonProperty("browserVersion")
    public String getBrowserVersion() {
        return browserVersion;
    }

    @JsonProperty("browserVersion")
    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    @JsonProperty("userAgent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @JsonProperty("deviceType")
    public String getDeviceType() {
        return deviceType;
    }

    @JsonProperty("deviceType")
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @JsonProperty("deviceIp")
    public String getDeviceIp() {
        return deviceIp;
    }

    @JsonProperty("deviceIp")
    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    @JsonProperty("geoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("geoLocation")
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
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
        return new ToStringBuilder(this).append("browserInfo", browserInfo).append("browserVersion", browserVersion).append("userAgent", userAgent).append("deviceType", deviceType).append("deviceIp", deviceIp).append("geoLocation", geoLocation).append("additionalProperties", additionalProperties).toString();
    }

}
