/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.Function;
import com.workingflows.js.jscore.client.api.core.DOMError;
import com.workingflows.js.jscore.client.api.core.EventTarget;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType
public interface IDBTransaction extends EventTarget {

    public static String READ = "read";
    public static String WRITE = "write";
    public static String READWRITE = "readwrite";
    
    @JsProperty
    IDBDatabase db();

    @JsProperty
    DOMError error();

    @JsProperty
    IDBTransactionMode mode();

    @JsProperty
    void onabort(Function fn);

    @JsProperty
    void oncomplete(Function fn);

    @JsProperty
    void onerror(Function fn);
    
    void abort();

    IDBObjectStore objectStore(String name);
}
