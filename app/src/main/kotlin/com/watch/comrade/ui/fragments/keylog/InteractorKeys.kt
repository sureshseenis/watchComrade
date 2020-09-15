package com.watch.comrade.ui.fragments.keylog

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.watch.comrade.data.rxFirebase.InterfaceFirebase
import com.watch.comrade.ui.activities.base.BaseInteractor
import com.watch.comrade.ui.adapters.keysadapter.InterfaceKeysAdapter
import com.watch.comrade.ui.adapters.keysadapter.KeysRecyclerAdapter
import com.watch.comrade.utils.Consts.CHILD_SERVICE_DATA
import com.watch.comrade.utils.Consts.DATA
import com.watch.comrade.utils.Consts.KEY_LOGGER
import com.google.firebase.database.DatabaseError
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by luis rafael on 18/03/18.
 */
class InteractorKeys<V : InterfaceViewKeys> @Inject constructor(supportFragment: FragmentManager, context: Context, firebase: InterfaceFirebase) : BaseInteractor<V>(supportFragment, context, firebase), InterfaceInteractorKeys<V>, InterfaceKeysAdapter {

    private var recyclerAdapter: KeysRecyclerAdapter? = null

    override fun setSearchQuery(query: String) {
        if (recyclerAdapter!=null) recyclerAdapter!!.setFilter(query)
    }

    override fun setRecyclerAdapter() {
        recyclerAdapter = KeysRecyclerAdapter(firebase().getDatabaseReference("$KEY_LOGGER/$DATA").limitToLast(300))
        getView()!!.setRecyclerAdapter(recyclerAdapter!!)
        recyclerAdapter!!.onRecyclerAdapterListener(this)
    }

    override fun startRecyclerAdapter() {
        if (recyclerAdapter != null) recyclerAdapter!!.startListening()
    }

    override fun stopRecyclerAdapter() {
        if (recyclerAdapter != null) recyclerAdapter!!.stopListening()
    }

    override fun successResult(result: Boolean, filter:Boolean) {
        if (isNullView()) getView()!!.successResult(result,filter)
    }

    override fun failedResult(error: DatabaseError) {
        if (getView() != null) getView()!!.failedResult(Throwable(error.message))
    }

    override fun valueEventEnableKeys() {
        getView()!!.addDisposable(firebase().valueEvent("$DATA/$CHILD_SERVICE_DATA")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { if (getView() != null) { getView()!!.setValueState(it) } })
    }

}