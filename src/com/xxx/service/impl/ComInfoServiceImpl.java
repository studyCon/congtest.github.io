package com.xxx.service.impl;

import com.xxx.dao.ComInfoDao;
import com.xxx.dao.impl.ComInfoDaoImpl;
import com.xxx.pojo.ComInfo;
import com.xxx.service.ComInfoService;

public class ComInfoServiceImpl implements ComInfoService{

	@Override
	public boolean update(ComInfo comInfo) {
		ComInfoDao comInfoDao = new ComInfoDaoImpl();
		int num = comInfoDao.update(comInfo);
		if (num>0) {
			return true;
		}
		return false;
	}

	@Override
	public ComInfo findComInfo() {
		ComInfoDao comInfoDao = new ComInfoDaoImpl();
		return comInfoDao.findComInfo();
	}

}
