/*
 * (c) Copyright IBM Corp. 2002.
 * All Rights Reserved.
 */
package org.eclipse.jdt.internal.debug.eval.ast.instructions;

import org.eclipse.core.runtime.CoreException;

public class PushArrayType extends ArrayInstruction {

	private String fTypeSignature;
	
	private int fDimension;
	
	public PushArrayType(String typeSignature, int dimension, int start) {
		super(start);
		fTypeSignature = typeSignature;
		fDimension = dimension;
	}


	/*
	 * @see Instruction#execute()
	 */
	public void execute() throws CoreException {
		push(getArrayType(fTypeSignature.replace('/','.'), fDimension));
	}

}
