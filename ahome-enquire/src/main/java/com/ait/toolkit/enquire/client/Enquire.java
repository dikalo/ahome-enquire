package com.ait.toolkit.enquire.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.enquire.client.resources.EnquireResources;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;

/**
 * Main Enquire class.
 */
public class Enquire extends JsObject {

	private static final EnquireResources ressources = GWT.create(EnquireResources.class);
	private static final Enquire INSTANCE = new Enquire();

	public static Enquire get() {
		return INSTANCE;
	}

	private Enquire() {
		jsObj = createPeer();
	}

	private Enquire(JavaScriptObject peer) {
		jsObj = peer;
	}

	static {
		load();
	}

	private static void load() {
		if (!isLoaded()) {
			ScriptInjector.fromString(ressources.polyfill().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
			ScriptInjector.fromString(ressources.js().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
	}

	/**
	 * register a callback with the given css media query
	 * 
	 * @param mediaQuery
	 *            , the css media query to test against
	 * @param callback
	 *            , the callback that gets called if the css query is a match
	 */
	public native Enquire register(String mediaQuery, Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (!peer) {
			peer = $wnd.enquire;
		}
		var obj = peer.register(mediaQuery, $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		}));
		return @com.ait.toolkit.enquire.client.Enquire::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void register(String mediaQuery, EnquireOptions options)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (!peer) {
			peer = $wnd.enquire;
		}
		var obj = peer.register(mediaQuery,
				options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.enquire.client.Enquire::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void register(String mediaQuery, EnquireOptions options, boolean shouldDegrade)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (!peer) {
			peer = $wnd.enquire;
		}
		var obj = peer.register(mediaQuery,
				options.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				shouldDegrade);
		return @com.ait.toolkit.enquire.client.Enquire::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
	}-*/;

	public native void unregister(String mediaQuery)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.unregister(mediaQuery);
	}-*/;

	private static native boolean isLoaded()/*-{
		if (typeof $wnd.enquire === "undefined" || $wnd.enquire === null) {
			return false;
		}
		return true;
	}-*/;

	private native JavaScriptObject createPeer()/*-{
		return $wnd.enquire;
	}-*/;

}
