/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.JsObject;

/**
 * Documentación de {@link DOMTokenList}.
 *
 * //TODO Documentar la interface
 *
 * @author Cristian Rinaldi <csrinaldi@gmail.com>
 */
@JsType(prototype = "DOMTokenList")
public interface DOMTokenList {

    /**
     * Returns an item in the list by its index (or undefined if the number is
     * greater than or equal to the length of the list, prior to Gecko 7.0
     * returned null)
     *
     * @param index
     * @return
     */
    String item(int index);

    /**
     * Returns true if the underlying string contains token, otherwise false
     *
     * @param obj
     * @return
     */
    Boolean contains(String obj);

    /**
     * Adds token to the underlying string
     *
     * @param obj
     */
    void add(String obj);

    /**
     * Removes token from the underlying string
     * @param obj
     */
    void remove(String obj);

    /**
     * Removes token from string and returns false. If token doesn't exist it's added and the function returns true
     * @param obj
     * @return 
     */
    Boolean toggle (String obj);


}
