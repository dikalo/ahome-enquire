package com.ait.toolkit.enquire.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

/**
 * Configuration option for the Enquire class.<br/>
 * Use this class if you want full control on how the query should be handled
 * 
 */
public class EnquireOptions extends JsObject {

	public EnquireOptions() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * If supplied, triggered when a media query matches.
	 * 
	 * @param fn
	 *            , the function to call
	 */
	public native void setMatch(Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.math = $entry(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * If supplied, triggered when the media query transitions from a matched state to an unmatched state*.
	 * 
	 * @param fn
	 *            , the function to call
	 */
	public native void setUnMatch(Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.unmatch = $entry(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * If supplied, triggered once, when the handler is registered.
	 * 
	 * @param fn
	 *            , the function to call
	 */
	public native void setSetUp(Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setup = $entry(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	/**
	 * If set to true, defers execution of the setup function until the first time the media query is matched. <br/>
	 * defaults to false
	 */
	public native void setDeferSetup(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.deferSetup = value;
	}-*/;

	/**
	 * If supplied, triggered when handler is unregistered. Place cleanup code here
	 * 
	 * @param fn
	 *            , the function to call
	 */
	public native void setDestroy(Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.destroy = $entry(function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

}
