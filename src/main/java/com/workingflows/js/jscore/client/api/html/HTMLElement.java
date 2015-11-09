/*
 * Copyright 2015 Cristian Rinaldi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.workingflows.js.jscore.client.api.html;

import com.workingflows.js.jscore.client.api.core.Element;
import com.workingflows.js.jscore.client.api.core.EventListener;
import com.workingflows.js.jscore.client.api.JsObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native HTMLElement 
 * 
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class HTMLElement extends Element {

    @JsMethod
    public static native void setAttribute(String align, String center);

    @JsMethod
    public static native void appendChild(HTMLElement element);

    @JsMethod
    public static native void addEventListener(String event, EventListener<? extends JsObject> handler);

    @JsProperty
    public static native void setInnerText(String text);
 
    @JsProperty
    public static native String getInnerText();

}
