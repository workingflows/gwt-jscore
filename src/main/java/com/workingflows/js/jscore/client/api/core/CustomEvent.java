/**
 * 
 */
package com.workingflows.js.jscore.client.api.core;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 * @author Roman Kaufmann
 *
 */
@JsType
public interface CustomEvent<T> extends Event<T> {
	@JsProperty public T getDetail();
}
