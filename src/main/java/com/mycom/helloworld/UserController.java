package com.mycom.helloworld;

import act.controller.annotation.UrlContext;

@UrlContext("/users")
public class UserController extends CrudController<Long, User> {

}
