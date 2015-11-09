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
package com.workingflows.js.jscore.client.api.promise;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;



/**
 * Represent a Native Promise Object.
 *
 *
 * @author Cristian Rinaldi 
 * <a href="mailto:csrinaldi@gmail.com?Subject=JSCore">csrinaldi@gmail.com</a>
 */
@JsType(isNative = true)
public class Promise {

    public Promise(PromiseFn fn) {}
    
    public Promise() {}
    
    public native Promise then(PromiseThen f);

    public native Promise then(PromiseThen f, PromiseThen error);
    
    @JsMethod(name = "catch")
    public native Promise catchException(PromiseThen error);

    public static native Promise resolve(Object obj);

    public static native Promise reject(Object obj);

    public static native Promise all(Object... objs);

    public static native Promise race(Object... iterable);
}
