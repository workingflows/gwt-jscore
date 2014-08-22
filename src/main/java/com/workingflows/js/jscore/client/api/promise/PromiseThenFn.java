/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.workingflows.js.jscore.client.api.promise;

import com.google.gwt.core.client.js.JsType;

/**
 *
 * @author scit
 */
@JsType
public interface PromiseThenFn {
    Promise f(Object obj);
}
