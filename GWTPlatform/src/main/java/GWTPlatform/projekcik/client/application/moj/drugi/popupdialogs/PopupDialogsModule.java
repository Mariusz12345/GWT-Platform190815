package GWTPlatform.projekcik.client.application.moj.drugi.popupdialogs;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class PopupDialogsModule extends AbstractPresenterModule {
    @Override
    protected void configure() {
            bindPresenterWidget(PopupDialogsPresenter.class, PopupDialogsPresenter.MyView.class, PopupDialogsView.class);
    }
}