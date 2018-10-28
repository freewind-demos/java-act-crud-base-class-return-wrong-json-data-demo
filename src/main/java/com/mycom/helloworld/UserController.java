package com.mycom.helloworld;

import act.controller.annotation.UrlContext;
import act.db.ebean.EbeanDao;
import org.osgl.mvc.annotation.GetAction;

import javax.inject.Inject;
import java.util.List;

abstract class CrudController<ID, T> {

    @Inject
    protected EbeanDao<ID, T> dao;

    @GetAction()
    public List<T> list() {
        return dao.findAllAsList();
    }

}

@UrlContext("/users")
public class UserController extends CrudController<Long, User> {

}
