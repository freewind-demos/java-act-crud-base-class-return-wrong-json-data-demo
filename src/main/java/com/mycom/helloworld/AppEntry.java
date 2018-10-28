package com.mycom.helloworld;

import act.Act;
import act.db.ebean.EbeanDao;
import act.job.OnAppStart;

import javax.inject.Inject;

/**
 * Hello world!
 */
public class AppEntry {

    @Inject
    protected EbeanDao<Long, User> dao;

    @OnAppStart()
    public void initData() {
        User user = new User();
        user.name = "act";
        dao.save(user);
    }

    public static void main(String[] args) throws Exception {
        Act.start();
    }

}
