package com.kexi.service;

import com.kexi.basic.ResponseResult;
import com.kexi.entity.User;

public interface ILoginServcie {
     ResponseResult login(User user);
     ResponseResult logout();
}
