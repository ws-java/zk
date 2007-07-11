/* JVMs.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Wed Mar 21 20:29:16     2007, Created by tomyeh
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.lang;

import org.zkoss.util.Utils;

/**
 * Utilities of Java Virtual Machine.
 *
 * @author tomyeh
 */
public class JVMs {
	private JVMs() {}

	private static final int _major, _minor;
	private static final boolean _j5, _j6;
	static {
		final String s = System.getProperty("java.version");
		int major = Utils.getSubversion(s, 0),
			minor = Utils.getSubversion(s, 1);
		_major = major >= 0 ? major: 0;
		_minor = minor >= 0 ? minor: 0;
		_j5 = (_major == 1 && _minor >= 5) || _major >= 5;
		_j6 = (_major == 1 && _minor >= 6) || _major >= 6;
	}

	/** Returns whether JVM is 5.0 or above
	 */
	public static final boolean isJava5() {
		return _j5;
	}
	/** Returns whether JVM is 6.0 or above.
	 */
	public static final boolean isJava6() {
		return _j6;
	}
	/** Returns the major version.
	 */
	public static final int getMajorVersion() {
		return _major;
	}
	/** Returns the minor version.
	 */
	public static final int getMinorVersion() {
		return _minor;
	}
}
