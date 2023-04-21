package com.lsj.option.architecture.mvp.model;

import com.lsj.option.architecture.base.BaseSupportModel;
import com.lsj.option.architecture.net.dto.req.ReqKuaidi;
import com.lsj.option.architecture.net.observer.MyHttpResultObserver;
import com.lsj.option.architecture.net.TestServices;
import com.lsj.option.architecture.net.dto.resp.RespKuaidi;
import com.lsj.option.framework.mvp.IView;
import com.lsj.option.net.callback.SimpleHttpCallBack;

import java.util.List;

/**
 * <pre>
 *     author : jacks
 *     e-mail : 363525749@qq.com
 *     time   : 2019/12/03
 *     version: 1.0
 *     desc   : 生产数据层，Model层基类
 * </pre>
 */
public class DataModel extends BaseSupportModel {

    public DataModel(IView view) {
        super(view);
    }

    /**
     * 业务失败的请求
     *
     * <p>
     * 依赖mvp模式
     * transformWithLifecycleAndLoading()底层需DataModel(IView view)的参数值不为空
     * </p>
     *
     * @param r
     * @param callBack
     */
    public void getKuaidiByPost(ReqKuaidi r, SimpleHttpCallBack<List<RespKuaidi>> callBack) {
        transformWithLifecycleAndLoading(getService(TestServices.class).getKuaidiByPost(r))
                .subscribe(new MyHttpResultObserver<>(callBack));
    }

    /**
     * 业务成功的请求
     * <p>
     * 依赖mvp模式
     * transformWithLifecycleAndLoading()底层需DataModel(IView view)的参数值不为空
     * </p>
     *
     * @param type
     * @param postid
     * @param callBack
     */
    public void getKuaidiByGet(String type, String postid, SimpleHttpCallBack<List<RespKuaidi>> callBack) {
        transformWithLifecycleAndLoading(getService(TestServices.class).getKuaidiByGet(type, postid))
                .subscribe(new MyHttpResultObserver<>(callBack));
    }

    /**
     * 业务失败的请求
     * <p>
     * 不依赖mvp模式
     * 不需DataModel(IView view)的参数值不为空
     * </p>
     *
     * @param r
     * @param callBack
     */
    public void getKuaidiNoMVPByPost(ReqKuaidi r, SimpleHttpCallBack<List<RespKuaidi>> callBack) {
        transform(getService(TestServices.class).getKuaidiByPost(r))
                .subscribe(new MyHttpResultObserver<>(callBack));
    }

    /**
     * 业务成功的请求
     * <p>
     * 不依赖mvp模式
     * 不需DataModel(IView view)的参数值不为空
     * </p>
     *
     * @param type
     * @param postid
     * @param callBack
     */
    public void getKuaidiNoMVPByGet(String type, String postid, SimpleHttpCallBack<List<RespKuaidi>> callBack) {
        transform(getService(TestServices.class).getKuaidiByGet(type, postid))
                .subscribe(new MyHttpResultObserver<>(callBack));
    }

}
