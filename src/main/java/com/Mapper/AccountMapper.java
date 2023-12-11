package com.Mapper;

import com.DTO.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author: yrj
 * @create: 2023-12-07 15:27
 * @Description: 操作账户mapper接口
 */
@Mapper
@Repository
public interface AccountMapper {

    //根据id值查询
    Account selectAccountById(Integer id);

    //插入数据
    int insertAccount(Account account);

    //转账
    int updateAccount(@Param("name") String name, @Param("price") Double price);

    //删除数据
    int deleteAccount(Integer id);
}
