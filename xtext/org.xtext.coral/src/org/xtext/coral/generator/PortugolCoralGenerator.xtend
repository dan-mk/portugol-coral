package org.xtext.coral.generator
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.xtext.coral.portugolcoral.DeclararVariaveis
import org.xtext.coral.portugolcoral.DeclararVariaveisTipo
import org.xtext.coral.portugolcoral.Atribuir
import org.xtext.coral.portugolcoral.Expressao
import org.xtext.coral.portugolcoral.Ou
import org.xtext.coral.portugolcoral.E
import org.xtext.coral.portugolcoral.Xou
import org.xtext.coral.portugolcoral.Comparacao
import org.xtext.coral.portugolcoral.AdicaoOuSubtracao
import org.xtext.coral.portugolcoral.MultiplicacaoOuDivisao
import org.xtext.coral.portugolcoral.Exponenciacao
import org.xtext.coral.portugolcoral.ConstanteInteira
import org.xtext.coral.portugolcoral.ConstanteReal
import org.xtext.coral.portugolcoral.ConstanteString
import org.xtext.coral.portugolcoral.ReferenciaVariavel
import org.xtext.coral.portugolcoral.Sinal
import org.xtext.coral.portugolcoral.Nao
import org.xtext.coral.portugolcoral.Matriz
import org.xtext.coral.portugolcoral.ElementoParenteses

class PortugolCoralGenerator extends AbstractGenerator {
 
    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
    	var output = ""
        for(e : resource.allContents.toIterable.filterNull) {
        	if(e instanceof DeclararVariaveis){
        		output += e.compile	
        	}
    		if(e instanceof Atribuir){
        		output += e.compile	
        	}
        }
        fsa.generateFile("output.py", output)
    }
 
    def compile(DeclararVariaveis e) '''
        «FOR f : e.elementos»
			«f.compile(f.tipo)»
        «ENDFOR»
    '''
    
    def compile(DeclararVariaveisTipo f, String t) ''' 
        «FOR g : f.elementos»
        	«IF t == 'int'»
        		«g» = 0
        	«ENDIF»
        	«IF t == 'real'»
        		«g» = 0.0
        	«ENDIF»
        	«IF t == 'texto'»
        		«g» = ""
        	«ENDIF»
        	«IF t == 'logico' || t == 'lógico'»
        		«g» = False
        	«ENDIF»
        «ENDFOR»
    '''
    
    def compile(Atribuir e) '''
    	«e.variavel» = «e.valor.compile»
    '''

	def compile(Object f){
		var output = ""
		switch(f){
			ReferenciaVariavel:
				output += f.variavel
			ConstanteString:
				output += f.valor
			ConstanteReal:
				output += f.valor
			ConstanteInteira:
				output += f.valor
			ElementoParenteses:
				output += '''(«f.direita.direita.compile»)'''
			Matriz:
				output += '''«f.variavel»«FOR g : f.direita»[«g.direita.compile»]«ENDFOR»'''
			Exponenciacao:
				output += '''«f.esquerda.compile» ** «f.direita.compile»'''
			Sinal:
				output += '''«FOR g : f.sinais» «g» «ENDFOR»«f.direita.compile»'''
			MultiplicacaoOuDivisao:
				output += '''«f.esquerda.compile» «f.operacao» «f.direita.compile»'''
			AdicaoOuSubtracao:
				output += '''«f.esquerda.compile» «f.operacao» «f.direita.compile»'''
			Comparacao:
				output += '''«f.esquerda.compile» «f.comparacao» «f.direita.compile»'''
			Nao:
				output += '''«FOR g : f.naos» not «ENDFOR»«f.direita.compile»'''
			Xou:
				output += '''(not («f.esquerda.compile») and «f.direita.compile» or «f.esquerda.compile» and not («f.direita.compile»))'''
			E:
				output += '''«f.esquerda.compile» and «f.direita.compile»'''
			Ou:
				output += '''«f.esquerda.compile» or «f.direita.compile»'''
			Expressao:
				output += f.esquerda.compile
			default:
				output += " ERRO -> " + f + " "
		}
		return output
	}
}

