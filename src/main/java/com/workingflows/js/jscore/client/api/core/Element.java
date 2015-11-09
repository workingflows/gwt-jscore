/** To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import com.workingflows.js.jscore.client.api.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class Element extends Node {
    
    @JsProperty
    public native DOMTokenList getClassList();
    
    public native void addEventListener(String event, Function fn);
    
    public native Object querySelector(String selector);
    
    @JsProperty
    public native void setInnerHTML(String html);
    
    @JsProperty
    public native String getInnerHTML();

}
