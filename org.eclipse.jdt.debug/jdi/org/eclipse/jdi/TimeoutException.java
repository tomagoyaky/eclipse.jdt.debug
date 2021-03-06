/*******************************************************************************
 * Copyright (c) 2000, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdi;

public class TimeoutException extends RuntimeException {
	private static final long serialVersionUID = 6009335074727417445L;

	public TimeoutException() {
	}

	public TimeoutException(String message) {
		super(message);
	}
}
