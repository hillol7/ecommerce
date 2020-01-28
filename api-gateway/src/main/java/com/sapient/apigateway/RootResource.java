package com.sapient.apigateway;

import org.springframework.hateoas.ResourceSupport;

public class RootResource extends ResourceSupport {
	public static final String LINK_NAME_CATALOG = "catalog";
	public static final String LINK_NAME_PRODUCT_DETAIL = "product";
}
