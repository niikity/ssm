package com.ssm.dao;

import com.ssm.bean.TbAccount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbAccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbAccount record);

    int insertSelective(TbAccount record);

    TbAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAccount record);

    int updateByPrimaryKey(TbAccount record);

    List<TbAccount> selectAll();
}