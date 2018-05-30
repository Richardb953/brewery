package sk.cz.muni.brewery;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class positionoffer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "POSITION_OFFER_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "POSITION_OFFER_ID_GENERATOR", sequenceName = "POSITION_OFFER_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Position name")
	private java.lang.String name;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label("Position conditions")
	private sk.cz.muni.brewery.positionConditions positionConditions;

	@org.kie.api.definition.type.Label("Salary (eur)")
	private java.lang.Integer salary;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label("Recommended position type")
	private sk.cz.muni.brewery.positionType type;

	@org.kie.api.definition.type.Label("Position basic description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("Is published")
	private java.lang.Boolean published;

	@org.kie.api.definition.type.Label("Still actual")
	private java.lang.Boolean actual;

	@org.kie.api.definition.type.Label("Number of free position slots")
	private java.lang.Integer count;

	public positionoffer() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public sk.cz.muni.brewery.positionConditions getPositionConditions() {
		return this.positionConditions;
	}

	public void setPositionConditions(
			sk.cz.muni.brewery.positionConditions positionConditions) {
		this.positionConditions = positionConditions;
	}

	public java.lang.Integer getSalary() {
		return this.salary;
	}

	public void setSalary(java.lang.Integer salary) {
		this.salary = salary;
	}

	public sk.cz.muni.brewery.positionType getType() {
		return this.type;
	}

	public void setType(sk.cz.muni.brewery.positionType type) {
		this.type = type;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Boolean getPublished() {
		return this.published;
	}

	public void setPublished(java.lang.Boolean published) {
		this.published = published;
	}

	public java.lang.Boolean getActual() {
		return this.actual;
	}

	public void setActual(java.lang.Boolean actual) {
		this.actual = actual;
	}

	public java.lang.Integer getCount() {
		return this.count;
	}

	public void setCount(java.lang.Integer count) {
		this.count = count;
	}

	public positionoffer(java.lang.Long id, java.lang.String name,
			sk.cz.muni.brewery.positionConditions positionConditions,
			java.lang.Integer salary, sk.cz.muni.brewery.positionType type,
			java.lang.String description, java.lang.Boolean published,
			java.lang.Boolean actual, java.lang.Integer count) {
		this.id = id;
		this.name = name;
		this.positionConditions = positionConditions;
		this.salary = salary;
		this.type = type;
		this.description = description;
		this.published = published;
		this.actual = actual;
		this.count = count;
	}

}