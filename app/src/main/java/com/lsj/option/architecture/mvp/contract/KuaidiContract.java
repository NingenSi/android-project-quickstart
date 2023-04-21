package com.lsj.option.architecture.mvp.contract;

import com.lsj.option.architecture.net.dto.req.ReqKuaidi;
import com.lsj.option.architecture.net.dto.resp.RespKuaidi;
import com.lsj.option.framework.mvp.IPresenter;
import com.lsj.option.framework.mvp.IView;

import java.util.List;


/**
 * <pre>
 *     author : jacks
 *     e-mail : 363525749@qq.com
 *     time   : 12/06/2019 17:16
 *     version: 1.0
 *     desc   : Kuaidi
 * </pre>
 */
public interface KuaidiContract {
    interface View extends IView {
        void onReciveKuaidi(List<RespKuaidi> kuaidiList);

        void onReciveKuaidiError(String err);
    }

    interface Prestenter extends IPresenter<View> {
        void getKuaidiByGet(String type, String postid);

        void getKuaidiByPost(ReqKuaidi kuaidi);

    }
}
