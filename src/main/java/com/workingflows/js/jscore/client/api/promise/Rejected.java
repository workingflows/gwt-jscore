/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.promise;

import com.google.gwt.core.client.JavaScriptObject;
import com.workingflows.js.jscore.client.factory.Browser;

/**
 * Implemented with {@link JavaScriptObject}.
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
public final class Rejected extends JavaScriptObject {

    protected Rejected() {
    }

    public void rejected(Object obj) {
        Browser.getWindow().getConsole().log(obj);
        call(obj);
    }

    protected final native void call(Object objs)/*-{
     this(objs);
     }-*/;

}
