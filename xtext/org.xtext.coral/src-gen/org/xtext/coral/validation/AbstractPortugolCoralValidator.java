/*
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPortugolCoralValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.coral.portugolcoral.PortugolcoralPackage.eINSTANCE);
		return result;
	}
}
