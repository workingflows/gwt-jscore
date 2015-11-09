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
package com.workingflows.js.jscore.client.api;



/**
 * Native JS Object 
 *
 * @author Cristian Rinaldi <a href="mailto:csrinaldi@gmail.com?Subject=JsCore">csrinaldi@gmail.com</a>
 */
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, name = "Object", namespace = JsPackage.GLOBAL)
public class JsObject {

    @JsMethod
    public static native <T extends JsObject> void observe(T model, Function<Changed<T>[], Void> fn);
    
    public static native String[] getOwnPropertyNames(Object object);
    
    public native boolean hasOwnProperty(String name);
    
}
