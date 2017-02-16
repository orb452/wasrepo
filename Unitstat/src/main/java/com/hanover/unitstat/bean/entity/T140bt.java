package com.hanover.unitstat.bean.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * T140bt entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "T140BT")
public class T140bt implements java.io.Serializable {

	// Fields

	private T140btId id;
	private String addr;

	// Constructors

	/** default constructor */
	public T140bt() {
	}

	/** full constructor */
	public T140bt(T140btId id, String addr) {
		this.id = id;
		this.addr = addr;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "polNbr", column = @Column(name = "POL_NBR", nullable = false, length = 13)),
			@AttributeOverride(name = "polSym", column = @Column(name = "POL_SYM", nullable = false, length = 3)),
			@AttributeOverride(name = "polMod", column = @Column(name = "POL_MOD", nullable = false)),
			@AttributeOverride(name = "co", column = @Column(name = "CO", nullable = false, length = 2)),
			@AttributeOverride(name = "polEffDt", column = @Column(name = "POL_EFF_DT", nullable = false, length = 10)),
			@AttributeOverride(name = "rptNbr", column = @Column(name = "RPT_NBR", nullable = false, length = 2)),
			@AttributeOverride(name = "corrId", column = @Column(name = "CORR_ID", nullable = false, length = 2)) })
	public T140btId getId() {
		return this.id;
	}

	public void setId(T140btId id) {
		this.id = id;
	}

	@Column(name = "ADDR", nullable = false, length = 90)
	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}