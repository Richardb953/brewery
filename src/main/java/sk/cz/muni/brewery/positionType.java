package sk.cz.muni.brewery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class positionType implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "POSITIONTYPE_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "POSITIONTYPE_ID_GENERATOR", sequenceName = "POSITIONTYPE_ID_SEQ")
    private java.lang.Long id;

    public positionType() {
    }
    
    public positionType(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }




}