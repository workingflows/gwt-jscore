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

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.Function;

/**
 * Utility class for access to JS Native Objects.
 * 
 * 
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
@JsType
public class JS {

    public static JsObject Object;

    public static Array Array;

    public static JSON JSON;
    
    public static StaticPromise Promise;

    static {
        Object = createNativeObject();
        Array = createNativeArray();
        JSON = createNativeJSON();
    }

    /**
     * Create a Native Object
     * @return 
     */
    public static native JsObject createNativeObject()/*-{
     return $wnd.Object;
     }-*/;
    
    
    /**
     * Create a Native Promise
     * @return 
     */
    public static native StaticPromise createNativePromise()/*-{
     return $wnd.Promise;
     }-*/;
    
    /**
     * Create a Native Array Object 
     * @return 
     */
    private static native Array createNativeArray() /*-{
     return $wnd.Array;
     }-*/;

    /**
     * Create a Native JSON Object
     * 
     * @return 
     */
    private static native JSON createNativeJSON() /*-{
     return $wnd.JSON;
     }-*/;
    
    /**
     * Create a native function with GWT Function how parameter.
     * 
     * @param fn
     * @return 
     */
    public static native Function Function(Function fn) /*-{
     return function(changes){
        fn.f(changes);
     }
     }-*/;

    /**
     * Interface JsObject
     * Represent a accesor for "static" method in JS
     */
    @JsType(isNative = true, prototype = "Object")
    public interface JsObject {

        void observe(Object model, Function fn);

    }
    
    /**
     * Interface StaticPromise
     * Represent a accesor for "static" method in Promise Object
     */
    @JsType(isNative = true, prototype = "Promise")
    public interface StaticPromise {

        

    }

    /**
     * Interface Array
     */
    @JsType(isNative = true, prototype = "Array")
    public interface Array extends JsObject{

        
    }

    /**
     * Interface JSON
     */
    @JsType(isNative = true, prototype = "JSON")
    public interface JSON {

        String stringify(JsObject obj);

        JsObject parse(String json);
    }
}
