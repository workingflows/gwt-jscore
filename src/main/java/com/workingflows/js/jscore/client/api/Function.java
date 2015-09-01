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

import com.google.gwt.core.client.js.JsFunction;

/**
 * Represent a Function in JS Enviroment.
 *
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 * @param <T>
 * @param <E>
 */
@JsFunction
public interface Function<T, E> {
    
    E call(T changed);

    //E f(T changed);

    /**
     * Factory for Promise creation
     */
    public static class Static {

        /**
         * Create a native wrapper function with GWT Function how parameter.
         * This is for now, when SAM will be implemented this disapear.
         *
         * @param <T>
         * @param <E>
         * @param fn
         * @return
         */
        public static native <T extends Object, E extends Object> Function<T, E> newInstance(Function<T, E> fn)/*-{
         return function(e){
         fn.f(e);  
         }
         }-*/;
    }

}
