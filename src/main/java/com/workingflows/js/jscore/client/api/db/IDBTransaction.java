/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.workingflows.js.jscore.client.api.Function;
import com.workingflows.js.jscore.client.api.core.DOMError;
import com.workingflows.js.jscore.client.api.core.EventTarget;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType(isNative = true)
public class IDBTransaction extends EventTarget{

    @JsProperty
    public native IDBDatabase getBb();

    @JsProperty
    public native DOMError getError();

    @JsProperty
    public native IDBTransactionMode getMode();
    
    @JsProperty
    public native void setMode(IDBTransactionMode mode);

    @JsProperty
    public native void setOnabort(Function fn);

    @JsProperty
    public native void setOncomplete(Function fn);
    
    @JsProperty
    public native String[] getObjectStoreNames();

    @JsProperty
    public native void setOnerror(Function fn);

    public native void abort();

    public native IDBObjectStore objectStore(String name);
}
