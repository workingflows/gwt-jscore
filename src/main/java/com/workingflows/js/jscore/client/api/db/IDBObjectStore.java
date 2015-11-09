/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.workingflows.js.jscore.client.api.JsObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType(isNative = true)
public class IDBObjectStore {
    
    public native Object createIndex(String name, String path, JsObject options);
    
    public native IDBRequest add(JsObject obj, String id);
    
    public native IDBRequest put(JsObject obj, String id);
    
    public native IDBRequest get(String id);
    
    @JsProperty
    public native String getKeyPath();
    
}
