/**
 * generated by Xtext 2.16.0
 */
package org.xtext.coral.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.coral.PortugolCoralRuntimeModule;
import org.xtext.coral.PortugolCoralStandaloneSetup;
import org.xtext.coral.ide.PortugolCoralIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class PortugolCoralIdeSetup extends PortugolCoralStandaloneSetup {
  @Override
  public Injector createInjector() {
    PortugolCoralRuntimeModule _portugolCoralRuntimeModule = new PortugolCoralRuntimeModule();
    PortugolCoralIdeModule _portugolCoralIdeModule = new PortugolCoralIdeModule();
    return Guice.createInjector(Modules2.mixin(_portugolCoralRuntimeModule, _portugolCoralIdeModule));
  }
}