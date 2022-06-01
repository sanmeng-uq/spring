package com.ch9.service.impl;

import com.ch9.entity.Account;
import com.ch9.dao.AccountDao;
import com.ch9.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (Account)表服务实现类
 *
 * @author makejava
 * @since 2022-06-02 00:04:37
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Account queryById(Integer id) {
        return this.accountDao.queryById(id);
    }

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
    @Override
    public Account insert(Account account) {
        this.accountDao.insert(account);
        return account;
    }

    /**
     * 修改数据
     *
     * @param account 实例对象
     * @return 实例对象
     */
    @Override
    public Account update(Account account) {
        this.accountDao.update(account);
        return this.queryById(account.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.accountDao.deleteById(id) > 0;
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
