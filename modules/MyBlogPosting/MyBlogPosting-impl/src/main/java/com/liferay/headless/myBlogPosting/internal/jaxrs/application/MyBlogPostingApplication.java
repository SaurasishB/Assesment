package com.liferay.headless.myBlogPosting.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author me
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false", "osgi.jaxrs.application.base=/MyBlogPosting",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=MyBlogPosting"
	},
	service = Application.class
)
@Generated("")
public class MyBlogPostingApplication extends Application {
}