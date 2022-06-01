package com.ch9.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2022-06-02 00:04:35
 */
public class Account implements Serializable {
    private static final long serialVersionUID = -64908095849715785L;
    
    private Integer id;
    
    private String username;
    
    private Object balance;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Object getBalance() {
        return balance;
    }

    public void setBalance(Object balance) {
        this.balance = balance;
    }



}

