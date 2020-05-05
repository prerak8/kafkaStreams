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
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"dataType",
"name",
"dept"
})

@Component
@Document(collection = "user")
public class User extends Jsondata {
	
	@Id
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("dataType")
	private String dataType;
	@JsonProperty("name")
	private String name;
	@JsonProperty("dept")
	private String dept;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	/**
	* No args constructor for use in serialization
	*
	*/
	public User() {
	}
	
	/**
	*
	* @param dataType
	* @param name
	* @param dept
	*/
	public User(String dataType, String name, String dept) {
	super();
	this.dataType = dataType;
	this.name = name;
	this.dept = dept;
	}
	
	@JsonProperty("dataType")
	public String getDataType() {
	return dataType;
	}
	
	@JsonProperty("dataType")
	public void setDataType(String dataType) {
	this.dataType = dataType;
	}
	
	@JsonProperty("name")
	public String getName() {
	return name;
	}
	
	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}
	
	@JsonProperty("dept")
	public String getDept() {
	return dept;
	}
	
	@JsonProperty("dept")
	public void setDept(String dept) {
	this.dept = dept;
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
	return new ToStringBuilder(this).append("dataType", dataType).append("name", name).append("dept", dept).append("additionalProperties", additionalProperties).toString();
	}
	
	public String getjsonData()
    {
    	return this.toString();
    }

}