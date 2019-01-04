package cn.wenhaha.serialport.processing;

import android.util.Log;

import java.util.List;

import cn.wenhaha.serialport.bean.Function;
import cn.wenhaha.serialport.bean.FunctionMsg;
import cn.wenhaha.serialport.context.SeriaPortConetxt;

public class DefaultMsgProcessing extends FunctionMsg {

    private static final String TAG = "DefaultMsgProcessing";


    public DefaultMsgProcessing(Function function) {
        super(function);
    }

    @Override
    public void read(String name, String[] data, List<String> allData) {
        if (SeriaPortConetxt.getDebug())
            Log.d(TAG, "read: "+data);
    }


}