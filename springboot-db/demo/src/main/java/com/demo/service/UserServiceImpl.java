package com.demo.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;
import com.demo.bean.*;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private SessionFactory sessionFactory;

    public String loginValidation(String username, String password) {
        try (Session session = sessionFactory.getCurrentSession()) {
            // Use HQL to fetch the user by email
            Register_Entity user = session.createQuery("FROM p1bean01052024 WHERE email = :username", Register_Entity.class)
                                .setParameter("username", username)
                                .uniqueResult();
            
            if (user != null && user.getPassword().equals(password)) {
                return "login"; // Valid login
            } else {
                System.out.println("Invalid Username/Password");
                return " error" ; // Invalid login
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "catch exception"; // Error occurred
        }
    }
}
