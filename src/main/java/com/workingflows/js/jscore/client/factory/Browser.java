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
package com.workingflows.js.jscore.client.factory;

import com.workingflows.js.jscore.client.api.Array;
import com.workingflows.js.jscore.client.api.JsObject;
import com.workingflows.js.jscore.client.api.Window;
import com.workingflows.js.jscore.client.api.promise.Promise;
import com.workingflows.js.jscore.client.api.promise.PromiseFn;


/**
 * Fatories for low level creation.
 *
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
public class Browser {

    /**
     * Create a native JS Promise.
     *
     * @param onPromise
     * @return
     */
    public static native Promise newPromise(PromiseFn onPromise)/*-{
     return new $wnd.Promise(onPromise);
     }-*/;

    /**
     * Create a native JS Promise.
     *
     * @return
     */
    public static native Array newArray() /*-{
     return new Array();
     }-*/;
    
    /**
     * Create a native JS Object.
     *
     * @return
     */
    public static native JsObject newObject() /*-{
     return {};
     }-*/;

    /**
     * Create a JSON native Object
     *
     * @return
     */
    public static native Window getWindow() /*-{
     return $wnd;
     }-*/;
    
    

}
