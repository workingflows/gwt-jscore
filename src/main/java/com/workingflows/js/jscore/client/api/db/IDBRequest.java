/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;


import com.workingflows.js.jscore.client.api.Function;
import com.workingflows.js.jscore.client.api.JsObject;
import com.workingflows.js.jscore.client.api.core.DOMError;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType(isNative = true)
public class IDBRequest<T> {
    
    @JsProperty
    public native void setOnsuccess(Function fn);
    
    @JsProperty
    public native Function getOnsuccess();
    
    @JsProperty
    public native void setSource(JsObject object);
    
    @JsProperty
    public native JsObject getSource();
    
    @JsProperty
    public native DOMError getError();
    
    @JsProperty
    public native void setError(DOMError dom);
    
    @JsProperty
    public native void setOnerror(Function fn);
    
    @JsProperty
    public native Function getOnerror();

    @JsProperty
    public native String getReadyState();
    
    @JsProperty
    public native T getResult();
    
    @JsProperty
    public native  IDBTransaction getTransaction();
    
}
