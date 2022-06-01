package com.ch9.service;

import com.ch9.entity.Account;

/**
 * (Account)表服务接口
 *
 * @author makejava
 * @since 2022-06-02 00:04:36
 */
public interface AccountService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Account queryById(Integer id);

    /**
     * 分页查询
     *
     * @param account 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    /**
     * 新增数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account insert(Account account);

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    Account update(Account account);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

//    将钱从outerUSer转到inUser
    void transfer(String outerUser,String inUser,Double balance);
}
