# Ahomé-Enquire

## About Ahomé-Enquire

Built on-top of Enquire.js, Ahomé-Enquire is a GWT-based library that helps you create dynamic CSS media queries in your web application.

##Enterprise Support
Get high quality support through Ahomé (Note that Ahomé-Ext is FREE to use with an Apache 2 License).

* <a href="http://opensource.ahome-it.com/pricing/">Buy Enterprise Support</a>


##Community
* [Ahomé Google+ Community](https://plus.google.com/u/0/communities/106380618381566688303) - See whats happening in the community.


## Getting Started with Ahomé-Enquire
1)  <a href="https://github.com/ahome-it/ahome-offline/releases/download/1.0.0/ahome-enquire-1.0.0.jar">Download the jar file</a>

2)  Inherit the ahome-enquire module
```xml
     <inherits name='com.ait.toolkit.enquire.Enquire'/>
```

3)  Start coding
```java
     package com.ait.toolkit.playground.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.enquire.client.Enquire;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

public class EnquireEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Enquire.get().register("screen and (max-width:45em)", new Function() {
			@Override
			public void execute() {
				Window.alert("We have a match !");
			}
		});
	}
}
```

