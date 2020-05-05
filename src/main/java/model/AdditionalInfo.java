
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
    "sessionInfo",
    "applicationStartDate",
    "applicationSubmitDate"
})
public class AdditionalInfo {

    @JsonProperty("sessionInfo")
    private SessionInfo sessionInfo;
    @JsonProperty("applicationStartDate")
    private Long applicationStartDate;
    @JsonProperty("applicationSubmitDate")
    private Long applicationSubmitDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public AdditionalInfo() {
    }

    /**
     * 
     * @param sessionInfo
     * @param applicationStartDate
     * @param applicationSubmitDate
     */
    public AdditionalInfo(SessionInfo sessionInfo, Long applicationStartDate, Long applicationSubmitDate) {
        super();
        this.sessionInfo = sessionInfo;
        this.applicationStartDate = applicationStartDate;
        this.applicationSubmitDate = applicationSubmitDate;
    }

    @JsonProperty("sessionInfo")
    public SessionInfo getSessionInfo() {
        return sessionInfo;
    }

    @JsonProperty("sessionInfo")
    public void setSessionInfo(SessionInfo sessionInfo) {
        this.sessionInfo = sessionInfo;
    }

    @JsonProperty("applicationStartDate")
    public Long getApplicationStartDate() {
        return applicationStartDate;
    }

    @JsonProperty("applicationStartDate")
    public void setApplicationStartDate(Long applicationStartDate) {
        this.applicationStartDate = applicationStartDate;
    }

    @JsonProperty("applicationSubmitDate")
    public Long getApplicationSubmitDate() {
        return applicationSubmitDate;
    }

    @JsonProperty("applicationSubmitDate")
    public void setApplicationSubmitDate(Long applicationSubmitDate) {
        this.applicationSubmitDate = applicationSubmitDate;
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
        return new ToStringBuilder(this).append("sessionInfo", sessionInfo).append("applicationStartDate", applicationStartDate).append("applicationSubmitDate", applicationSubmitDate).append("additionalProperties", additionalProperties).toString();
    }

}
