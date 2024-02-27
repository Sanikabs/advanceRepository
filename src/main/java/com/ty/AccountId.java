package com.ty;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AccountId implements Serializable {

	private String email;
	private long phono;

	@Override
	public int hashCode() {
		return Objects.hash(email, phono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountId other = (AccountId) obj;
		return Objects.equals(email, other.email) && phono == other.phono;
	}

	@Override
	public String toString() {
		return "AccountId [email=" + email + ", phono=" + phono + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhono() {
		return phono;
	}

	public void setPhono(long phono) {
		this.phono = phono;
	}

}
