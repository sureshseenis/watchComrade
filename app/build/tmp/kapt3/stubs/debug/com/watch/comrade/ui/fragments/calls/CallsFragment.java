package com.watch.comrade.ui.fragments.calls;

import java.lang.System;

/**
 * Created by luis rafael on 9/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 f2\u00020\u00012\u00020\u0002:\u0001fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EH\u0017J\"\u0010F\u001a\u00020C2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020HH\u0002J\u0010\u0010K\u001a\u00020C2\u0006\u0010L\u001a\u00020MH\u0016J\u0012\u0010N\u001a\u00020C2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020MH\u0016J\u0010\u0010R\u001a\u00020C2\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u00020CH\u0016J\b\u0010V\u001a\u00020CH\u0016J\b\u0010W\u001a\u00020CH\u0016J*\u0010X\u001a\u00020C2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010Y\u001a\u00020TH\u0016J*\u0010Z\u001a\u00020C2\b\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020H2\u0006\u0010Y\u001a\u00020TH\u0016J\u0010\u0010[\u001a\u00020C2\u0006\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u00020CH\u0016J\b\u0010_\u001a\u00020CH\u0016J\b\u0010`\u001a\u00020CH\u0002J\u0010\u0010a\u001a\u00020C2\u0006\u0010(\u001a\u00020)H\u0016J\u0018\u0010b\u001a\u00020C2\u0006\u0010c\u001a\u00020M2\u0006\u0010d\u001a\u00020MH\u0016J\b\u0010e\u001a\u00020CH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\t\u001a\u0004\b%\u0010&R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\t\u001a\u0004\b,\u0010-R\u001b\u0010/\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\t\u001a\u0004\b1\u00102R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b5\u00102R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b=\u0010:R\u001b\u0010?\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\t\u001a\u0004\b@\u0010:\u00a8\u0006g"}, d2 = {"Lcom/watch/comrade/ui/fragments/calls/CallsFragment;", "Lcom/watch/comrade/ui/fragments/base/BaseFragment;", "Lcom/watch/comrade/ui/fragments/calls/InterfaceViewCalls;", "()V", "appBar", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBar$delegate", "Lkotlin/properties/ReadOnlyProperty;", "content", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getContent", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "content$delegate", "dataList", "", "Lcom/watch/comrade/data/model/DataDelete;", "floatingButton", "Lcom/github/clans/fab/FloatingActionButton;", "getFloatingButton", "()Lcom/github/clans/fab/FloatingActionButton;", "floatingButton$delegate", "interactor", "Lcom/watch/comrade/ui/fragments/calls/InterfaceInteractorCalls;", "getInteractor", "()Lcom/watch/comrade/ui/fragments/calls/InterfaceInteractorCalls;", "setInteractor", "(Lcom/watch/comrade/ui/fragments/calls/InterfaceInteractorCalls;)V", "layoutM", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLayoutM", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLayoutM", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "list", "Lcom/watch/comrade/ui/widget/CustomRecyclerView;", "getList", "()Lcom/watch/comrade/ui/widget/CustomRecyclerView;", "list$delegate", "recyclerAdapter", "Lcom/watch/comrade/ui/adapters/callsadapter/CallsRecyclerAdapter;", "toolbar", "Lcom/watch/comrade/ui/widget/toolbar/CustomToolbar;", "getToolbar", "()Lcom/watch/comrade/ui/widget/toolbar/CustomToolbar;", "toolbar$delegate", "txtFailed", "Landroid/widget/TextView;", "getTxtFailed", "()Landroid/widget/TextView;", "txtFailed$delegate", "txtNotHave", "getTxtNotHave", "txtNotHave$delegate", "viewFailed", "Landroid/widget/LinearLayout;", "getViewFailed", "()Landroid/widget/LinearLayout;", "viewFailed$delegate", "viewNotHave", "getViewNotHave", "viewNotHave$delegate", "viewProgress", "getViewProgress", "viewProgress$delegate", "failedResult", "", "throwable", "", "itemSelected", "key", "", "child", "file", "onActionStateChanged", "enabled", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onButtonClicked", "buttonCode", "", "onChangeHeight", "onDetach", "onHideFragment", "onItemClick", "position", "onItemLongClick", "onSearchConfirmed", "text", "", "onStart", "onStop", "recyclerPosition", "setRecyclerAdapter", "successResult", "result", "filter", "timeConnection", "Companion", "app_debug"})
public final class CallsFragment extends com.watch.comrade.ui.fragments.base.BaseFragment implements com.watch.comrade.ui.fragments.calls.InterfaceViewCalls {
    private java.util.List<com.watch.comrade.data.model.DataDelete> dataList;
    private final kotlin.properties.ReadOnlyProperty viewProgress$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty viewFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtNotHave$delegate = null;
    private final kotlin.properties.ReadOnlyProperty txtFailed$delegate = null;
    private final kotlin.properties.ReadOnlyProperty list$delegate = null;
    private final kotlin.properties.ReadOnlyProperty floatingButton$delegate = null;
    private final kotlin.properties.ReadOnlyProperty content$delegate = null;
    private final kotlin.properties.ReadOnlyProperty appBar$delegate = null;
    private final kotlin.properties.ReadOnlyProperty toolbar$delegate = null;
    private com.watch.comrade.ui.adapters.callsadapter.CallsRecyclerAdapter recyclerAdapter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls<com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> interactor;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.recyclerview.widget.LinearLayoutManager layoutM;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CallsFragment";
    public static final com.watch.comrade.ui.fragments.calls.CallsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.widget.LinearLayout getViewProgress() {
        return null;
    }
    
    private final android.widget.LinearLayout getViewNotHave() {
        return null;
    }
    
    private final android.widget.LinearLayout getViewFailed() {
        return null;
    }
    
    private final android.widget.TextView getTxtNotHave() {
        return null;
    }
    
    private final android.widget.TextView getTxtFailed() {
        return null;
    }
    
    private final com.watch.comrade.ui.widget.CustomRecyclerView getList() {
        return null;
    }
    
    private final com.github.clans.fab.FloatingActionButton getFloatingButton() {
        return null;
    }
    
    private final androidx.constraintlayout.widget.ConstraintLayout getContent() {
        return null;
    }
    
    private final com.google.android.material.appbar.AppBarLayout getAppBar() {
        return null;
    }
    
    private final com.watch.comrade.ui.widget.toolbar.CustomToolbar getToolbar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls<com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> getInteractor() {
        return null;
    }
    
    public final void setInteractor(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.fragments.calls.InterfaceInteractorCalls<com.watch.comrade.ui.fragments.calls.InterfaceViewCalls> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.LinearLayoutManager getLayoutM() {
        return null;
    }
    
    public final void setLayoutM(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void timeConnection() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void successResult(boolean result, boolean filter) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    public void failedResult(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @java.lang.Override()
    public void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.adapters.callsadapter.CallsRecyclerAdapter recyclerAdapter) {
    }
    
    private final void recyclerPosition() {
    }
    
    @java.lang.Override()
    public void onSearchConfirmed(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    @java.lang.Override()
    public void onItemLongClick(@org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String child, @org.jetbrains.annotations.NotNull()
    java.lang.String file, int position) {
    }
    
    private final void itemSelected(java.lang.String key, java.lang.String child, java.lang.String file) {
    }
    
    @java.lang.Override()
    public void onActionStateChanged(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onButtonClicked(int buttonCode) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onHideFragment() {
    }
    
    @java.lang.Override()
    public void onChangeHeight() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    public CallsFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/watch/comrade/ui/fragments/calls/CallsFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}