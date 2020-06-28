package de.wwu.acse.socialrequest.lib;

/**
 * Only implements one method {@link #get(String)}.
 * It enables another class to get specific (allowed)
 * attributes by the name of the attribute as a String.
 *
 * Example:
 *
 * <pre>
 * {@code
 * ((UniversalGetter) anyObject).get(attributeName);
 * }
 * </pre>
 */
public interface UniversalGetter {

  public Object get(String field);

}
