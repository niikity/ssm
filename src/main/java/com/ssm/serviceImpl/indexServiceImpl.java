package com.ssm.serviceImpl;

import com.ssm.dao.TbAccountMapper;
import com.ssm.service.indexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class indexServiceImpl implements indexService {

    @Resource
    private TbAccountMapper tbAccountMapper;

    @Override
    public String selectAll() {
        return tbAccountMapper.selectAll().toString();
    }
}
