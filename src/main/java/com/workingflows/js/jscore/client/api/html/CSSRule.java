/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.workingflows.js.jscore.client.api.html;

import jsinterop.annotations.JsProperty;

/** 
 * Native CSSRule 
 * https://developer.mozilla.org/en-US/docs/Web/API/CSSRule
 * 
 * @author Cristian Rinaldi
 */
public class CSSRule {
    
    final short STYLE_RULE = 1;
    final short CHARSET_RULE = 2; // Obsolete
    final short IMPORT_RULE = 3;
    final short MEDIA_RULE = 4;
    final short FONT_FACE_RULE = 5;
    final short PAGE_RULE = 6;
    final short KEYFRAMES_RULE = 7;
    final short KEYFRAME_RULE = 8;
    final short NAMESPACE_RULE = 10;
    final short COUNTER_STYLE_RULE = 11;
    final short SUPPORTS_RULE = 12;
    final short DOCUMENT_RULE = 13;
    final short FONT_FEATURE_VALUES_RULE = 14;
    final short VIEWPORT_RULE = 15;
    final short REGION_STYLE_RULE = 16;
    
    @JsProperty
    public native short getType();
    
    
}
