package com.jianye.springmvc.entity;
// Generated 2016-6-5 10:23:59 by Hibernate Tools 5.1.0.Alpha1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AcctUserRoleId generated by hbm2java
 */
@Embeddable
public class AcctUserRoleId implements java.io.Serializable {

	private String roleId;
	private String userId;

	public AcctUserRoleId() {
	}

	public AcctUserRoleId(String roleId, String userId) {
		this.roleId = roleId;
		this.userId = userId;
	}

	@Column(name = "role_id", nullable = false, length = 36)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "user_id", nullable = false, length = 36)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AcctUserRoleId))
			return false;
		AcctUserRoleId castOther = (AcctUserRoleId) other;

		return ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null
				&& castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		return result;
	}

}
