package com.dimple.service;

import com.dimple.bean.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * @ClassName: UserService
 * @Description:
 * @Auther: Owenb
 * @Date: 11/19/18 17:20
 * @Version: 1.0
 */
@CacheConfig(cacheNames = "user")
public interface UserService {
    @Cacheable(key = "'loginId'.concat(#loginId)")
    User findByUserLoginId(String loginId);
}