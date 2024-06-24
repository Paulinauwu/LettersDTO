package com.bbva.mzic.dto.implementacion;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The LetterDTO class...
 */
public class LetterDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	
	private String name;
	private String lastname;
	private String description;
	private String reference;

	private LettersINDTO lettersIND;
    private LettersOUTDTO LettersOUTD;

	/**
	 * Get the name attribute
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the name attribute
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Get the surname attribute
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * Set the surname attribute
	 */
	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * Set the surname attribute
	 */
	public void setDescription(final String description) {
		this.description = description;
	}

	public String getReference() {
		return this.reference;
	}

	/**
	 * Set the surname attribute
	 */
	public void setReference(final String reference) {
		this.reference = reference;
	}

}

    public LettersINDTO getLettersIND() {
        return this.lettersIND;
    }
    public void setLettersIN(final LettersINDTO lettersIND) {
        this.lettersIND = lettersIND;
    }


    public LettersOUTDTO getLettersOUTD() {
        return this.lettersOUTD;
    }
    public void setLettersOUT(final LettersOUTDTO lettersOUTD) {
        this.lettersOUTD = lettersOUTD;
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
					.append(name, rhs.name)
					.append(surname, rhs.lastname)
					.append(surname, rhs.description)
					.append(surname, rhs.reference)
					.append(lettersIN, rhs.lettersIND)
                    .append(lettersOUT, rhs.lettersOUTD)

					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.name)
			.append(this.lastname)
			.append(this.description)
			.append(this.reference)
			.append(this.lettersIND)
            .append(this.lettersOUTD)

			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("name", name)
			.append("lastname", lastname)
			.append("description", description)
			.append("reference", reference)
			.append("lettersIN", lettersIND)
            .append("lettersOUT",lettersOUTD)

			.toString();
	}

