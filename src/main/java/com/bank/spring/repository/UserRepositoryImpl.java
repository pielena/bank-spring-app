package com.bank.spring.repository;

import com.bank.spring.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public class UserRepositoryImpl {

    private final SessionFactory sessionFactory;

    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<User> getAllUsers() {
        Session session = sessionFactory.getCurrentSession();
        List<User> allUsers = session.createQuery("from User", User.class).getResultList();
        return allUsers;
    }

    public User getUserById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }
}
