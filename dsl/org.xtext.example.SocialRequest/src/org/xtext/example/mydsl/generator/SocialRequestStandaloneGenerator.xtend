package org.xtext.example.mydsl.generator

import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.xtext.example.mydsl.SocialRequestStandaloneSetup
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.eclipse.xtext.generator.GeneratorDelegate
import org.eclipse.emf.common.util.URI

/**
 * Starting point for the MusketStandaloneGenerator.
 * <p>
 * This can be used to generate models without opening an additional eclipse instance.
 * Just choose run as > java application.
 * If models should be added, include them in the list "val models = #[....]"
 * Remember to use relative paths.
 */
class SocialRequestStandaloneGenerator {
	private static final Logger logger = LogManager.getLogger(SocialRequestStandaloneGenerator)

	def static void main(String[] args) {

		logger.info("Start standalone SocialRequest generator.")
		val MusketGenerator = new SocialRequestGenerator();
		val injector = new SocialRequestStandaloneSetup().createInjectorAndDoEMFRegistration()

		// obtain a resourceset from the injector
		val resourceSet = injector.getInstance(XtextResourceSet)
		val fsa = injector.getInstance(JavaIoFileSystemAccess)
		
		fsa.setOutputPath("../src-gen/")
		val generator = injector.getInstance(GeneratorDelegate)
		val s = '../org.xtext.example.SocialRequest.models/SocialRequest.platform'
		val resource = try{
			resourceSet.getResource(URI.createFileURI(s), true)
		}catch(RuntimeException e){
			logger.warn("File: " + s + " not found.")
			null
		}
		generator.doGenerate(resource, fsa)
		logger.info("Generate: " + s + '. Done.') 
		logger.info("Social Request standalone generator done.")
	}
}
