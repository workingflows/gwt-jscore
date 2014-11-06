/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.Function;
import com.workingflows.js.jscore.client.api.JsObject;
import com.workingflows.js.jscore.client.api.core.DOMError;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType
public interface IDBRequest<T> {
    
    @JsProperty
    public void onsuccess(Function fn);
    
    @JsProperty
    public JsObject source();
    
    @JsProperty
    public DOMError error();
    
    @JsProperty
    public void onerror(Function fn);

    //TODO see IDBRequestReadyState
    @JsProperty
    public JsObject readyState();
    
    @JsProperty
    public T result();
    
    @JsProperty
    IDBTransaction transaction();
    
}
