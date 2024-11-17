package com.community.kairos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.writingcode.www.community.dao.RoleMapper;
import com.writingcode.www.community.entity.po.Role;
import com.writingcode.www.community.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chavy
 * @date  2020/05/02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
