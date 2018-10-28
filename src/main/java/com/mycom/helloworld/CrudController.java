package com.mycom.helloworld;

import act.db.ebean.EbeanDao;
import act.job.OnAppStart;
import org.osgl.http.H;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.ResponseContentType;

import javax.inject.Inject;
import java.util.List;

abstract class CrudController<ID, T> {

    @Inject
    protected EbeanDao<ID, T> dao;

    @GetAction()
    @ResponseContentType(H.MediaType.JSON)
    public List<T> list() {
        return dao.findAllAsList();
    }

}
