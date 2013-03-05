/**
 * Copyright (C) 2013 Barchart, Inc. <http://www.barchart.com/>
 *
 * All rights reserved. Licensed under the OSI BSD License.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */

package com.barchart.jenkins.cascade;

/**
 * Project role selector.
 * 
 * @author Andrei Pozolotin
 */
public enum ProjectRole {

	/** Role unknown. */
	UNKNOWN(""), //

	/** Cascade project. */
	CASCADE("cascade"), //

	/** Layout project. */
	LAYOUT("layout"), //

	/** Member project. */
	MEMBER("member"), //

	;

	private final String code;

	public String code() {
		return code;
	}

	ProjectRole(final String code) {
		this.code = code;
	}

	public static ProjectRole from(final String code) {
		if (code == null || code.isEmpty()) {
			return UNKNOWN;
		}
		for (final ProjectRole known : values()) {
			if (known.code().equalsIgnoreCase(code.trim())) {
				return known;
			}
		}
		return UNKNOWN;
	}

}
