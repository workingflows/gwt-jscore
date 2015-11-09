/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;


import com.workingflows.js.jscore.client.api.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 * @param <T>
 */
@JsType(isNative = true)
public class IDBOpenDBRequest extends IDBRequest<IDBDatabase>{

    @JsProperty
    public native void setOnupgradeneeded(Function<IDBVersionChangeEvent<IDBOpenDBRequest>, Void> fn);
    
}
