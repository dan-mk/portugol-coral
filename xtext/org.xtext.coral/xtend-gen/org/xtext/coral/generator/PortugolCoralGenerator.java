package org.xtext.coral.generator;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.coral.portugolcoral.AdicaoOuSubtracao;
import org.xtext.coral.portugolcoral.Atribuir;
import org.xtext.coral.portugolcoral.Comparacao;
import org.xtext.coral.portugolcoral.ConstanteInteira;
import org.xtext.coral.portugolcoral.ConstanteReal;
import org.xtext.coral.portugolcoral.ConstanteString;
import org.xtext.coral.portugolcoral.DeclararVariaveis;
import org.xtext.coral.portugolcoral.DeclararVariaveisTipo;
import org.xtext.coral.portugolcoral.E;
import org.xtext.coral.portugolcoral.ElementoParenteses;
import org.xtext.coral.portugolcoral.Exponenciacao;
import org.xtext.coral.portugolcoral.Expressao;
import org.xtext.coral.portugolcoral.Matriz;
import org.xtext.coral.portugolcoral.MultiplicacaoOuDivisao;
import org.xtext.coral.portugolcoral.Nao;
import org.xtext.coral.portugolcoral.Ou;
import org.xtext.coral.portugolcoral.PosicaoMatriz;
import org.xtext.coral.portugolcoral.ReferenciaVariavel;
import org.xtext.coral.portugolcoral.Sinal;
import org.xtext.coral.portugolcoral.Xou;

@SuppressWarnings("all")
public class PortugolCoralGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String output = "";
    Iterable<EObject> _filterNull = IterableExtensions.<EObject>filterNull(IteratorExtensions.<EObject>toIterable(resource.getAllContents()));
    for (final EObject e : _filterNull) {
      {
        if ((e instanceof DeclararVariaveis)) {
          String _output = output;
          CharSequence _compile = this.compile(((DeclararVariaveis)e));
          output = (_output + _compile);
        }
        if ((e instanceof Atribuir)) {
          String _output_1 = output;
          CharSequence _compile_1 = this.compile(((Atribuir)e));
          output = (_output_1 + _compile_1);
        }
      }
    }
    fsa.generateFile("output.py", output);
  }
  
  public CharSequence compile(final DeclararVariaveis e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<DeclararVariaveisTipo> _elementos = e.getElementos();
      for(final DeclararVariaveisTipo f : _elementos) {
        CharSequence _compile = this.compile(f, f.getTipo());
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final DeclararVariaveisTipo f, final String t) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<String> _elementos = f.getElementos();
      for(final String g : _elementos) {
        {
          boolean _equals = Objects.equal(t, "int");
          if (_equals) {
            _builder.append(g);
            _builder.append(" = 0");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_1 = Objects.equal(t, "real");
          if (_equals_1) {
            _builder.append(g);
            _builder.append(" = 0.0");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          boolean _equals_2 = Objects.equal(t, "texto");
          if (_equals_2) {
            _builder.append(g);
            _builder.append(" = \"\"");
            _builder.newLineIfNotEmpty();
          }
        }
        {
          if ((Objects.equal(t, "logico") || Objects.equal(t, "lógico"))) {
            _builder.append(g);
            _builder.append(" = False");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Atribuir e) {
    StringConcatenation _builder = new StringConcatenation();
    String _variavel = e.getVariavel();
    _builder.append(_variavel);
    _builder.append(" = ");
    String _compile = this.compile(e.getValor());
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String compile(final Object f) {
    String output = "";
    boolean _matched = false;
    if (f instanceof ReferenciaVariavel) {
      _matched=true;
      String _output = output;
      String _variavel = ((ReferenciaVariavel)f).getVariavel();
      output = (_output + _variavel);
    }
    if (!_matched) {
      if (f instanceof ConstanteString) {
        _matched=true;
        String _output = output;
        String _valor = ((ConstanteString)f).getValor();
        output = (_output + _valor);
      }
    }
    if (!_matched) {
      if (f instanceof ConstanteReal) {
        _matched=true;
        String _output = output;
        String _valor = ((ConstanteReal)f).getValor();
        output = (_output + _valor);
      }
    }
    if (!_matched) {
      if (f instanceof ConstanteInteira) {
        _matched=true;
        String _output = output;
        int _valor = ((ConstanteInteira)f).getValor();
        output = (_output + Integer.valueOf(_valor));
      }
    }
    if (!_matched) {
      if (f instanceof ElementoParenteses) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(");
        Object _compile = this.compile(((ElementoParenteses)f).getDireita().getDireita());
        _builder.append(_compile);
        _builder.append(")");
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Matriz) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        String _variavel = ((Matriz)f).getVariavel();
        _builder.append(_variavel);
        {
          EList<PosicaoMatriz> _direita = ((Matriz)f).getDireita();
          for(final PosicaoMatriz g : _direita) {
            _builder.append("[");
            Object _compile = this.compile(g.getDireita());
            _builder.append(_compile);
            _builder.append("]");
          }
        }
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Exponenciacao) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((Exponenciacao)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" ** ");
        Object _compile_1 = this.compile(((Exponenciacao)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Sinal) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        {
          EList<String> _sinais = ((Sinal)f).getSinais();
          for(final String g : _sinais) {
            _builder.append(" ");
            _builder.append(g);
            _builder.append(" ");
          }
        }
        Object _compile = this.compile(((Sinal)f).getDireita());
        _builder.append(_compile);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof MultiplicacaoOuDivisao) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((MultiplicacaoOuDivisao)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" ");
        String _operacao = ((MultiplicacaoOuDivisao)f).getOperacao();
        _builder.append(_operacao);
        _builder.append(" ");
        Object _compile_1 = this.compile(((MultiplicacaoOuDivisao)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof AdicaoOuSubtracao) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((AdicaoOuSubtracao)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" ");
        String _operacao = ((AdicaoOuSubtracao)f).getOperacao();
        _builder.append(_operacao);
        _builder.append(" ");
        Object _compile_1 = this.compile(((AdicaoOuSubtracao)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Comparacao) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((Comparacao)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" ");
        String _comparacao = ((Comparacao)f).getComparacao();
        _builder.append(_comparacao);
        _builder.append(" ");
        Object _compile_1 = this.compile(((Comparacao)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Nao) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        {
          EList<String> _naos = ((Nao)f).getNaos();
          for(final String g : _naos) {
            _builder.append(" not ");
          }
        }
        Object _compile = this.compile(((Nao)f).getDireita());
        _builder.append(_compile);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Xou) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(not (");
        Object _compile = this.compile(((Xou)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(") and ");
        Object _compile_1 = this.compile(((Xou)f).getDireita());
        _builder.append(_compile_1);
        _builder.append(" or ");
        Object _compile_2 = this.compile(((Xou)f).getEsquerda());
        _builder.append(_compile_2);
        _builder.append(" and not (");
        Object _compile_3 = this.compile(((Xou)f).getDireita());
        _builder.append(_compile_3);
        _builder.append("))");
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof E) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((E)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" and ");
        Object _compile_1 = this.compile(((E)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Ou) {
        _matched=true;
        String _output = output;
        StringConcatenation _builder = new StringConcatenation();
        Object _compile = this.compile(((Ou)f).getEsquerda());
        _builder.append(_compile);
        _builder.append(" or ");
        Object _compile_1 = this.compile(((Ou)f).getDireita());
        _builder.append(_compile_1);
        output = (_output + _builder);
      }
    }
    if (!_matched) {
      if (f instanceof Expressao) {
        _matched=true;
        String _output = output;
        Object _compile = this.compile(((Expressao)f).getEsquerda());
        output = (_output + _compile);
      }
    }
    if (!_matched) {
      String _output = output;
      output = (_output + ("deuruim" + f));
    }
    return output;
  }
}
