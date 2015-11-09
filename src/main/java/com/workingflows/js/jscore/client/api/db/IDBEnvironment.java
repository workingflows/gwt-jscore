/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;


/**
 *
 * @author Cristian Rinaldi <csrinaldi@gmail.com>
 */
@JsType(isNative = true)
public class IDBEnvironment {
    
    @JsProperty
    public native IDBFactory getIndexedDB();
    
}
