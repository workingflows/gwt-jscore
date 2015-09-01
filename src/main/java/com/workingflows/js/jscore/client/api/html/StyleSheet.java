/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.core.Node;

/**
 *
 * @author iron
 */
@JsType(prototype = "StyleSheet")
public interface StyleSheet {
    
    @JsProperty
    boolean isDisabled();
    
    @JsProperty
    void setDisabled(boolean disabled);
    
    //TODO media
    //@JsProperty
    Node ownerNode();
    
    //@JsProperty
    StyleSheet parentStyleSheet();
    
    @JsProperty
    String getTitle();

    @JsProperty
    String getType();
    
    @JsProperty
    String getHref();
    
    
}
