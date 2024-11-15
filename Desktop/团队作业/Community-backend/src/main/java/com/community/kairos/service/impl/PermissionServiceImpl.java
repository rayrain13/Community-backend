package com.community.kairos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.writingcode.www.community.dao.PermissionMapper;
import com.writingcode.www.community.entity.po.Permission;
import com.writingcode.www.community.service.IPermissionService;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chavy
 * @date  2020/05/02
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
