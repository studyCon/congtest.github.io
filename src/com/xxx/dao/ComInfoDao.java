package com.xxx.dao;

import com.xxx.pojo.Category;
import com.xxx.pojo.ComInfo;

public interface ComInfoDao {
	ComInfo findComInfo();
	int update(ComInfo comInfo);

}
