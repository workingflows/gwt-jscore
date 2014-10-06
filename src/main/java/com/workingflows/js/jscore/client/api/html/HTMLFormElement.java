/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author iron
 */
@JsType(isNative = true, prototype = "HTMLFormElement")
public interface HTMLFormElement extends HTMLElement {

    void submit();

    void reset();

    boolean checkValidity();
    
    @JsProperty
    HTMLCollection getElements();
    
    @JsProperty
    int getLength();

    @JsProperty
    String acceptCharset();

    @JsProperty
    String action();

    @JsProperty
    String autocomplete();

    @JsProperty
    String enctype();

    @JsProperty
    String encoding();

    @JsProperty
    String method();

    @JsProperty
    String name();

    @JsProperty
    boolean noValidate();

    @JsProperty
    String target();
}
