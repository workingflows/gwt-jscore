/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.workingflows.js.jscore.client.api.core.Event;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 * @param <T>
 */

@JsType(isNative = true)
public class IDBVersionChangeEvent<T extends IDBOpenDBRequest> extends Event<T>{
    
    @JsProperty
    public native int getOldVersion();
    
    @JsProperty
    public native int getNewVersion();
    
}
