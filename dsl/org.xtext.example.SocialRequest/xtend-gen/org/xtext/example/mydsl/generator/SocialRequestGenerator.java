/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.mydsl.socialRequest.Association;
import org.xtext.example.mydsl.socialRequest.Attribute;
import org.xtext.example.mydsl.socialRequest.Entity;
import org.xtext.example.mydsl.socialRequest.Repository;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SocialRequestGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Entity> _filter = Iterables.<Entity>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Entity.class);
    for (final Entity entity : _filter) {
      String _name = entity.getName();
      String _plus = (_name + ".java");
      fsa.generateFile(_plus, this.generateEntity(entity));
    }
    Iterable<Repository> _filter_1 = Iterables.<Repository>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Repository.class);
    for (final Repository repo : _filter_1) {
      String _name_1 = repo.getEntity().getName();
      String _plus_1 = (_name_1 + ".java");
      fsa.generateFile(_plus_1, this.generateQuery(repo));
    }
  }
  
  private CharSequence generateEntity(final Entity e) {
    CharSequence output = this.generateImports(e);
    EList<Attribute> _attributes = e.getAttributes();
    for (final Attribute attr : _attributes) {
      String _string = this.generateAttribute(attr).toString();
      String _plus = (output + _string);
      output = _plus;
    }
    return output;
  }
  
  private CharSequence generateImports(final Entity e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ????");
    _builder.newLine();
    _builder.append("import javax.persistence.Entity;");
    _builder.newLine();
    _builder.append("�FOR attr : e.attributes �");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�IF attr.modifier == \"LOB\"�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import javax.persistence.Lob;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�IF attr.modifier == \"LOB\"�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import javax.persistence.Id;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�IF attr.association != null�");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("import import javax.persistence.�attr.association�;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("�ENDFOR�");
    _builder.newLine();
    _builder.append("TODO: does not work like that, how we check if already imported");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateAttribute(final Attribute a) {
    CharSequence _xifexpression = null;
    Association _association = a.getAssociation();
    boolean _equals = Objects.equal(_association, null);
    if (_equals) {
      _xifexpression = null;
    } else {
      _xifexpression = this.generateAssociationAttribute(a);
    }
    return _xifexpression;
  }
  
  private CharSequence generateAssociationAttribute(final Attribute a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("�IF a.mappedBy == null && a.fetchType == null�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@�a.association�");
    _builder.newLine();
    _builder.append("�ELSEIF a.mappedBy != null && a.fetchType != null�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@�a.association�(mappedBy = �a.mappedBy�, fetch = �a.fetchType�)");
    _builder.newLine();
    _builder.append("�ELSEIF a.mappedBy != null && a.fetchType == null�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@�a.association�(mappedBy = �a.mappedBy�)");
    _builder.newLine();
    _builder.append("�ELSEIF a.mappedBy == null && a.fetchType != null�");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@�a.association�(mappedBy = �a.fetchType�)");
    _builder.newLine();
    _builder.append("�ENDIF�");
    _builder.newLine();
    _builder.append("private �a.type�  �a.name�;");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateQuery(final Repository r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
