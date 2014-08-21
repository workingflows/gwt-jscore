/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.promise;

/**
 * Implemented with JsType
 *
 * @author Cristian Rinaldi <a
 * href="mailto:csrinaldi@gmail.com?Subject=JQuery">csrinaldi@gmail.com</a>
 * @author Andres Testi <a
 * href="mailto:andres.a.testi@gmail.com?Subject=JQuery">andres.a.testi@gmail.com</a>
 */
public class Resolve implements ResolveFn{

    /**
     *
     * @param objs
     */
    @Override
    public void resolve(Object objs) {
        internalResolve(this, objs);
    }

    private static native void internalResolve(Object ref, Object... objs)/*-{
     ref(objs);
    }-*/;
}
