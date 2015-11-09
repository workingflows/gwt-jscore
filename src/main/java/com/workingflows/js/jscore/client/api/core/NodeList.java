/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.core;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 *
 * @author iron
 */
@JsType(isNative = true)
public class NodeList {

    /**
     * This attribute specifies the length or size of the list.
     */
    @JsProperty
    public native int getLength();

    /**
     * This method retrieves a node specified by ordinal index. Nodes are
     * numbered in tree order (depth-first traversal order).
     *
     * @param index The index of the node to be fetched. The index origin is 0.
     * @return The <code>Node</code> at the corresponding position upon success.
     * A value of <code>null</code> is returned if the index is out of range.
     */
    public native Node item(int index);

}
