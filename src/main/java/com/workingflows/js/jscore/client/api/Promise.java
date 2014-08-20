/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.workingflows.js.jscore.client.api;

import com.google.gwt.core.client.js.JsType;


/**
 * Utility class for access to JS Native Objects.
 * 
 * TODO make a especial Function for Promise.onFulfilled
 * TODO make a especial Function for Promise.onRejected
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
@JsType(isNative = true, prototype = "Promise")
public interface Promise {
    
    void then(Function f);
    
    void cath(Function f);
    
}
