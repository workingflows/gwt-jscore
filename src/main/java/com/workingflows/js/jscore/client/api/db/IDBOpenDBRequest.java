/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.Function;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 * @param <T>
 */
@JsType
public interface IDBOpenDBRequest extends IDBRequest<IDBDatabase>{

    //@JsProperty
    void onupgradeneeded(Function<IDBVersionChangeEvent<IDBOpenDBRequest>, Void> fn);
    
}
