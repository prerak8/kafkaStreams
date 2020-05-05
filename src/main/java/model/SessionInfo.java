
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
    "sessionIds"
})
public class SessionInfo {

    @JsonProperty("sessionIds")
    private List<String> sessionIds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public SessionInfo() {
    }

    /**
     * 
     * @param sessionIds
     */
    public SessionInfo(List<String> sessionIds) {
        super();
        this.sessionIds = sessionIds;
    }

    @JsonProperty("sessionIds")
    public List<String> getSessionIds() {
        return sessionIds;
    }

    @JsonProperty("sessionIds")
    public void setSessionIds(List<String> sessionIds) {
        this.sessionIds = sessionIds;
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
        return new ToStringBuilder(this).append("sessionIds", sessionIds).append("additionalProperties", additionalProperties).toString();
    }

}
