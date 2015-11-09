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

import com.workingflows.js.jscore.client.api.core.Node;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Native StyleSheet
 * https://developer.mozilla.org/en-US/docs/Web/API/StyleSheet
 * 
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class StyleSheet {
    
    @JsProperty
    public native boolean getDisabled();
    
    @JsProperty
    public native void setDisabled(boolean disabled);
    
    @JsProperty
    public native Node getOwnerNode();
    
    @JsProperty
    public native StyleSheet getParentStyleSheet();
    
    @JsProperty
    public native String getTitle();

    @JsProperty
    public native String getType();
    
    @JsProperty
    public native String getHref();
}
