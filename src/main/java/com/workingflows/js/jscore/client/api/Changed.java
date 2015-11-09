/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * obj The object to be observed. callback The function called each time changes
 * are made, with the following argument: changes An array of objects each
 * representing a change. The properties of these change objects are: name: The
 * name of the property which was changed. object: The changed object after the
 * change was made. type: A string indicating the type of change taking place.
 * One of "add", "update", or "delete". oldValue: Only for "update" and "delete"
 * types. The value before the change. acceptList The list of types of changes
 * to be observed on the given object for the given callback. If omitted, the
 * array ["add", "update", "delete", "reconfigure", "setPrototype",
 * "preventExtensions"] will be used.
 *
 * @author Cristian Rinaldi
 * @param <T>
 */
@JsType
public class Changed<T>{

    @JsProperty
    public native String getName();

    @JsProperty
    public native T getObject();

    @JsProperty
    public native String getType();
}
