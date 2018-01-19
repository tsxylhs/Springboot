package com.ZB.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ZB.Dao.ZbuserDao;

@Service
public class ZbuserService {
          @Autowired
          private ZbuserDao zbuserDao;
	public String userinsert(String uid, String upwd) {
		// 业务逻辑处理\
		return zbuserDao.insert(uid,upwd);
		
	}

	
}
