package com.raessica.service.impl;

import com.raessica.entity.Blog;
import com.raessica.mapper.BlogMapper;
import com.raessica.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
