package sk.cz.muni.brewery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class worker implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "WORKER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "WORKER_ID_GENERATOR", sequenceName = "WORKER_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "Company mail")
	private java.lang.String workmail;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Worker CV information")
	private sk.cz.muni.brewery.cv cv;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Worker position")
	private sk.cz.muni.brewery.positionOffer position;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Worker position type")
	private sk.cz.muni.brewery.positionType positionType;

	public worker() {
	}
	
	public worker(java.lang.String workmail,
			sk.cz.muni.brewery.cv cv,
			sk.cz.muni.brewery.positionOffer position,
			sk.cz.muni.brewery.positionType positionType) {
		this.workmail = workmail;
		this.cv = cv;
		this.position = position;
		this.positionType = positionType;
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getWorkmail() {
		return this.workmail;
	}

	public void setWorkmail(java.lang.String workmail) {
		this.workmail = workmail;
	}

	public sk.cz.muni.brewery.cv getCv() {
		return this.cv;
	}

	public void setCv(sk.cz.muni.brewery.cv cv) {
		this.cv = cv;
	}

	public sk.cz.muni.brewery.positionOffer getPosition() {
		return this.position;
	}

	public void setPosition(sk.cz.muni.brewery.positionOffer position) {
		this.position = position;
	}

	public sk.cz.muni.brewery.positionType getPositionType() {
		return this.positionType;
	}

	public void setPositionType(sk.cz.muni.brewery.positionType positionType) {
		this.positionType = positionType;
	}

	public worker(java.lang.Long id, java.lang.String workmail,
			sk.cz.muni.brewery.cv cv,
			sk.cz.muni.brewery.positionOffer position,
			sk.cz.muni.brewery.positionType positionType) {
		this.id = id;
		this.workmail = workmail;
		this.cv = cv;
		this.position = position;
		this.positionType = positionType;
	}

}