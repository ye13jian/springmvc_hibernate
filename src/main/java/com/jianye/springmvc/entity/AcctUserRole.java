package com.jianye.springmvc.entity;
// Generated 2016-6-5 10:23:59 by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AcctUserRole generated by hbm2java
 */
@Entity
@Table(name = "acct_user_role", catalog = "work")
public class AcctUserRole implements java.io.Serializable {

	private AcctUserRoleId id;

	public AcctUserRole() {
	}

	public AcctUserRole(AcctUserRoleId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "roleId", column = @Column(name = "role_id", nullable = false, length = 36)),
			@AttributeOverride(name = "userId", column = @Column(name = "user_id", nullable = false, length = 36)) })
	public AcctUserRoleId getId() {
		return this.id;
	}

	public void setId(AcctUserRoleId id) {
		this.id = id;
	}

}