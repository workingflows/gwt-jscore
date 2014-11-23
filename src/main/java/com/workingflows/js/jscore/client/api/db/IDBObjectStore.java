/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.json.client.JSONObject;

/**
 *
 * @author Cristian Rinaldi <crinaldi@santafe.gov.ar>
 */
@JsType
public interface IDBObjectStore {
    
    Object createIndex(String name, String path, JSONObject options);
    
    IDBRequest add(JSONObject obj, String id);
    
    IDBRequest put(JSONObject obj);
    
    @JsProperty
    String keyPath();
    
}
