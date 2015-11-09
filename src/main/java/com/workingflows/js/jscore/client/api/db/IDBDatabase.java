/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.workingflows.js.jscore.client.api.Function;
import com.workingflows.js.jscore.client.api.JsObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 *
 * @author Cristian Rinaldi
 * 
 */
@JsType(isNative = true)
public class IDBDatabase extends JsObject{

    @JsProperty
    public native String getName();

    @JsProperty
    public native Long getVersion();

    @JsProperty
    public native String[] getObjectStoreNames();

    @JsProperty
    public native void setOnabort(Function f);

    @JsProperty
    public native void setOnerror(Function f);

    @JsProperty
    public native void setOnversionchange(Function f);

    public native void close();

    public native IDBObjectStore createObjectStore(String objStore, Object parametes);

    public native void deleteObjectStore(String objStore);
    
    public native IDBTransaction transaction(String[] objStores, String mode);
}
