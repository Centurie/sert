package com.uu.service.dao;

import com.jfinal.plugin.activerecord.Page;
import com.uu.model.User;

//数据库操作
public class UserService {
    private User dao = new User().dao();

    public Page<User> paginate(int pageNumber, int pageSize) {
        return dao.paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
    }

    public User findById(int id) {
        return dao.findById(id);
    }

    public void deleteById(int id) {
        dao.deleteById(id);
    }
}
