package com.temenos.transact;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Branch implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "BRANCH_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "BRANCH_ID_GENERATOR", sequenceName = "BRANCH_ID_SEQ")
    private java.lang.Long id;

    public Branch() {
    }
    
    public Branch(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}