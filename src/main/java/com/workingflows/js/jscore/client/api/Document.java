/*
 * Copyright 2014 Cristian Rinaldi & Andres Testi.
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
package com.workingflows.js.jscore.client.api;

import com.workingflows.js.jscore.client.api.html.StyleSheetList;
import com.workingflows.js.jscore.client.api.core.Element;
import com.workingflows.js.jscore.client.api.core.NodeList;
import com.workingflows.js.jscore.client.api.html.HTMLBodyElement;
import com.workingflows.js.jscore.client.api.html.HTMLElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Represent a Document
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
@JsType(isNative = true)
public class Document {

    public native HTMLElement createElement(String element);

    public native HTMLElement getElementsByTagName(String body);

    @JsProperty
    public native HTMLBodyElement getBody();

    public native Element querySelector(String selector);

    public native NodeList querySelectorAll(String selector);
    
    @JsProperty
    public native StyleSheetList getStyleSheets();
}
