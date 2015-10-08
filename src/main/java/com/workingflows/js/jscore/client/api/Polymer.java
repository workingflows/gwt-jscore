/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.workingflows.js.jscore.client.api;

import com.google.gwt.core.client.js.JsType;
import com.workingflows.js.jscore.client.api.core.Element;

/**
 * Documentación de {@link $name}
 * 
 * //TODO
 *
 * @author Cristian Rinaldi - csrinaldi@gmail.com
 */
@JsType
public interface Polymer {

    Element dom(Element e);
    
    public static class Static {
        public static native Polymer get() /*-{
         return $wnd.Polymer
        }-*/;
    }
    
}
