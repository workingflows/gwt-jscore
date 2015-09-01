/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import com.workingflows.js.jscore.client.api.core.Element;
import com.workingflows.js.jscore.client.api.core.EventListener;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.JsObject;

/**
 *
 * @author iron
 */
@JsType(prototype = "HTMLElement")
public interface HTMLElement extends Element {

    public void setAttribute(String align, String center);

    public void appendChild(HTMLElement element);

    public void addEventListener(String event, EventListener<? extends JsObject> handler);

    @JsProperty
    public void setInnerHTML(String text);

    @JsProperty
    public void setInnerText(String text);

}
