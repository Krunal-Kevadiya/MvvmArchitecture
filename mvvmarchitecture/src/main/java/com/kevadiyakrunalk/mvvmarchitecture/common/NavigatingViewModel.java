package com.kevadiyakrunalk.mvvmarchitecture.common;

import android.support.annotation.Nullable;

public abstract class NavigatingViewModel<T extends Navigator> extends BaseViewModel {

    @Nullable
    protected T navigator;
    @Nullable
    protected NavigationCommand<T> pendingCommand;

    /**
     * Setter for navigator
     *
     * @param navigator {@link Navigator} for this ViewModel
     */
    public void setNavigator(@Nullable T navigator) {
        this.navigator = navigator;
        if (navigator != null && pendingCommand != null) {
            pendingCommand.execute(navigator);
            pendingCommand = null;
        }
    }

    public T getNavigator() {
        return navigator;
    }

    /**
     * Executes command if {@link Navigator} is attached.
     * Otherwise command will be saved and executed on {@link Navigator} attach.
     *
     * @param navigationCommand command for {@link Navigator}
     */
    public void executeNavigationCommand(NavigationCommand<T> navigationCommand) {
        if (navigationCommand == null) {
            return;
        }
        T vmNavigator = navigator;
        if (vmNavigator == null) {
            pendingCommand = navigationCommand;
        } else {
            navigationCommand.execute(vmNavigator);
        }
    }
}
