package com.temenos;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RULE implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "STATUS")
	private java.lang.String STATUS;
	@org.kie.api.definition.type.Label(value = "MESSAGE")
	private java.lang.String MESSAGE;

	public RULE() {
	}

	public java.lang.String getSTATUS() {
		return this.STATUS;
	}

	public void setSTATUS(java.lang.String STATUS) {
		this.STATUS = STATUS;
	}

	public java.lang.String getMESSAGE() {
		return this.MESSAGE;
	}

	public void setMESSAGE(java.lang.String MESSAGE) {
		this.MESSAGE = MESSAGE;
	}

	public RULE(java.lang.String STATUS, java.lang.String MESSAGE) {
		this.STATUS = STATUS;
		this.MESSAGE = MESSAGE;
	}

}