/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.workingflows.js.jscore.client.api.promise;

import com.google.gwt.core.client.js.JsType;

/**
 * TODO parametrizar Rejected
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 * @param <T>
 * @param <E>
 */
@JsType
public interface PromiseFn {
    
    void f(Resolve resolve, Rejected rejected);
    
}
