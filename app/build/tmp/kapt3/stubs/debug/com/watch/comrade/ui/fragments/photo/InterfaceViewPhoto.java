package com.watch.comrade.ui.fragments.photo;

import java.lang.System;

/**
 * Created by luis rafael on 20/03/18.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/watch/comrade/ui/fragments/photo/InterfaceViewPhoto;", "Lcom/watch/comrade/ui/activities/base/InterfaceView;", "setRecyclerAdapter", "", "recyclerAdapter", "Lcom/watch/comrade/ui/adapters/photoadapter/PhotoRecyclerAdapter;", "setValuePermission", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "setValueState", "app_debug"})
public abstract interface InterfaceViewPhoto extends com.watch.comrade.ui.activities.base.InterfaceView {
    
    public abstract void setRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    com.watch.comrade.ui.adapters.photoadapter.PhotoRecyclerAdapter recyclerAdapter);
    
    public abstract void setValueState(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
    
    public abstract void setValuePermission(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DataSnapshot dataSnapshot);
}