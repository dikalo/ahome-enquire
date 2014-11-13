package com.ait.toolkit.enquire.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * ClientBundle interface for Enquire JS Resources
 */
public interface EnquireResources extends ClientBundle {

	@Source("enquire.min.js")
	TextResource jsMin();

	@Source("enquire.js")
	TextResource js();

	@Source("media.js")
	TextResource polyfill();
}
