/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.JsObject;

/**
 *
 * @author iron
 */
@JsType(prototype = "Node")
public interface Node extends EventTarget {

    void bind(String property, JsObject objects);

    //@JsProperty
    Element parentElement();

    //@JsProperty
    Node parentNode();

    //@JsProperty
    Node firstChild();

    Node removeChild(Node child);
    
    void appendChild(Object child);
}
