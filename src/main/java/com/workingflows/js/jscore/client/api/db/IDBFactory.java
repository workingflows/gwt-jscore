    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.workingflows.js.jscore.client.api.JsObject;
import jsinterop.annotations.JsType;



/**
 *
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class IDBFactory extends JsObject{

    public native IDBOpenDBRequest open(String name, int version);

    public native IDBOpenDBRequest deleteDatabase(String name);

    public native int cmp(Object first, Object second);
};
