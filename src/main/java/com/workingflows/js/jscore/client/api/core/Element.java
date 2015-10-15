/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.Function;

/**
 *
 * @author iron
 */
@JsType(prototype = "Element")
public interface Element extends Node {
    
    @JsProperty
    DOMTokenList getClassList();
    
    void addEventListener(String event, Function fn);
    
    Object querySelector(String selector);
    
    @JsProperty
    void setInnerHTML(String html);

}
