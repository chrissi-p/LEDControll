package de.cp.ledcontroll;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.util.Log;

/**
 * Created by chrissi on 25.04.17.
 */

public class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();
        if (action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)) {
            Log.d("Wifi:NCR:WifiState", "Wifi state Changed");
            MainActivity.testWifiState();
        } else {
            Log.d("Wifi:NCR", "Wrong action: " + action.toString());
        }
    }
}
