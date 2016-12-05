package latitude22.example.com.mytestproject;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class InternetConnection {

	public static boolean isInternetOn(Context mContext) {
		NetworkInfo localNetworkInfo = ((ConnectivityManager) mContext.getSystemService("connectivity")).getActiveNetworkInfo();
		return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
	}
}
