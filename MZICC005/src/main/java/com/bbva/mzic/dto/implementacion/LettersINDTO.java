package com.bbva.mzic.dto.implementacion;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterDTO class...
 */
public class LettersINDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	
	private int id;
	private int phone;
	private String reference;



	/**
	 * Get the name attribute
	 */
	public int id() {
		return this.id;
	}

	/**
	 * Set the name attribute
	 */
	public void setId(final int id) {
		this.id = id;
	}

	/**
	 * Get the surname attribute
	 */
	public int getPhone() {
		return this.phone;
	}

	/**
	 * Set the surname attribute
	 */
	public void setPhone(final int phone) {
		this.phone = phone;
	}

	

	public String getReference() {
		return this.reference;
	}

	

	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final LetterDTO rhs = (LetterDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(name, rhs.id)
					.append(surname, rhs.phone)
					.append(surname, rhs.reference)

					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.phone)
			.append(this.reference)

			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("phone", phone)
			.append("reference", reference)

			.toString();
	}

