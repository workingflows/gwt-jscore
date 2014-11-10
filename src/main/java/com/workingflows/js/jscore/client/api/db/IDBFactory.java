    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.db;

import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author iron
 */
@JsType(prototype = "IDBFactory")
public interface IDBFactory {

    public IDBOpenDBRequest open(String name, int version);

    public IDBOpenDBRequest deleteDatabase(String name);

    public int cmp(Object first, Object second);
};
