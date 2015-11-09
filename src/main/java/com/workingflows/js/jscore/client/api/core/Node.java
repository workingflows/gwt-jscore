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
package com.workingflows.js.jscore.client.api.core;

import com.workingflows.js.jscore.client.api.JsObject;
import jsinterop.annotations.JsType;

/**
 * Represent a EventTarget Element
 * 
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class Node extends EventTarget {

    public native void bind(String property, JsObject objects);

    public native Element parentElement();

    public native Node parentNode();

    public native Node firstChild();

    public native Node removeChild(Node child);
    
    public native void appendChild(Object child);
}
