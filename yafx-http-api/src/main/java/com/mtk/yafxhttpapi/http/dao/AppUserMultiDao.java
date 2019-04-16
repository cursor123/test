package com.mtk.yafxhttpapi.http.dao;

import com.mtk.yafxhttpapi.http.vo.AppUserMultiVo;

public interface AppUserMultiDao {
    /*insert MultiUser*/
    public boolean inserMultiUser(AppUserMultiVo appUserMultiVo);
    /*updateMultiUser*/
    public boolean updateMultiUser(AppUserMultiVo appUserMultiVo);
    /*selectbywechatid*/
    public AppUserMultiVo selectByWeChatId(String wechatOpenId);
    /*slectbyphonenum*/
    public AppUserMultiVo selectByPhoneNum(String phoneNum);
    /*slectbysystemuserid*/
    public AppUserMultiVo selectBySystemUserId(String systemUserId);
}
