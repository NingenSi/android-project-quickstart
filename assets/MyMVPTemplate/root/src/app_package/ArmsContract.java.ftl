package ${contractPackageName};

import com.lsj.option.framework.mvp.IPresenter;
import com.lsj.option.framework.mvp.IView;

<#import "root://activities/MyMVPTemplate/globals.xml.ftl" as gb>

<@gb.fileHeader />
public interface ${pageName}Contract {
    interface View extends IView {

    }

    interface Prestenter extends IPresenter<View> {

    }
}
