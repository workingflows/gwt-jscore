/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.core.Event;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */

@JsType
public interface IDBVersionChangeEvent<T extends IDBOpenDBRequest> extends Event<T>{
    
    //@JsProperty
    long oldVersion();
    
    //@JsProperty
    long newVersion();
    
}
