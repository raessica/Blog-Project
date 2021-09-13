package com.raessica.service.impl;

import com.raessica.entity.User;
import com.raessica.mapper.UserMapper;
import com.raessica.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author raessica
 * @since 2021-08-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
