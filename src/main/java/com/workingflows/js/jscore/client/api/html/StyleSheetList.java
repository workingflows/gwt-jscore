/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import jsinterop.annotations.JsType;

/**
 * Native StyleSheetList
 * https://developer.mozilla.org/en-US/docs/Web/API/StyleSheetList
 * 
 * @author Cristian Rinaldi
 */
@JsType(isNative = true)
public class StyleSheetList {
    
    public native StyleSheet item(int idx);
    
    public native int length();
    
}
