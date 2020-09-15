package com.watch.comrade.ui.fragments.recording

import com.watch.comrade.ui.activities.base.InterfaceView
import com.watch.comrade.ui.adapters.recordingadapter.RecordingRecyclerAdapter
import com.google.firebase.database.DataSnapshot

/**
 * Created by luis rafael on 17/03/19.
 */
interface InterfaceViewRecording : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValueTimerRecording(timer: Long)
    fun setRecyclerAdapter(recyclerAdapter: RecordingRecyclerAdapter)

}