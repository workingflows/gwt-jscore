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

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType
public interface IDBDatabase {

    @JsProperty
    String name();

    @JsProperty
    long version();

    @JsProperty
    String[] objectStoreNames();

    @JsProperty
    void onabort(Function f);

    @JsProperty
    void onerror(Function f);

    @JsProperty
    void onversionchange(Function f);

    void close();

    IDBObjectStore createObjectStore(String objStore, JsObject parametes);

    void deleteObjectStore(String objStore);
    
    IDBTransaction transaction(String[] objStores, String mode);
}
