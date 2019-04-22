package com.mtk.yafxhttpapi.dao.impl;

import com.mtk.yafxhttpapi.http.dao.AppUserMultiDao;
import com.mtk.yafxhttpapi.http.vo.AppUserMultiVo;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class AppUserMultiDaoImpl implements AppUserMultiDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Override
    @Transactional
    public boolean inserMultiUser(AppUserMultiVo appUserMultiVo) {
        int res = this.sqlSessionTemplate.insert("insertMultiUser", appUserMultiVo);
        return  res > 0 ? true : false;
    }

    @Override
    public boolean updateMultiUser(AppUserMultiVo appUserMultiVo) {
        int res = this.sqlSessionTemplate.update("updateMultiUser", appUserMultiVo);
        return res > 0 ? true: false;
    }

    @Override
    public AppUserMultiVo selectByWeChatId(String wechatOpenId) {
        return this.sqlSessionTemplate.selectOne("selectAppUserMultiByWechatOpenId", wechatOpenId);
    }

    @Override
    public AppUserMultiVo selectByPhoneNum(String phoneNum) {
        return this.sqlSessionTemplate.selectOne("selectAppUserMultiByPhoneNum", phoneNum);
    }

    @Override
    public AppUserMultiVo selectBySystemUserId(String systemUserId) {
        return this.sqlSessionTemplate.selectOne("selectAppUserMultiBySystemUserId", systemUserId);
    }
}
