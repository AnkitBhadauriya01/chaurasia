package com.WttApi.ExceptionHandling;

@SuppressWarnings(value = { "serial" })
public class ResourceNotFoundException {
	String resourceName;
	String fieldName;
	long fieldvalue;
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public long getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(long fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldvalue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldvalue = fieldvalue;
	}
	

}
