/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author Cristian Rinaldi <csrinaldi@gmail.com>
 */
@JsType
public interface IDBEnvironment {
    
    @JsProperty
    IDBFactory indexedDB();
    
}
