package com.et1n2.settings;

//import android.net.ConnectivityManager;
import java.util.List;

import android.os.Bundle;
import android.provider.Settings;
import android.app.Activity;
import android.telephony.SmsMessage.MessageClass;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.hardware.*;
import android.hardware.Camera.Parameters;

//import com.android.*;

public class MainActivity extends Activity
{
		static String TAG = "MainActivity";
		//Camera camera;
		//MessageClass messaging;
		//BroadcastReceiver broadcast;
		//Context context;
		//Intent intent;
		DevicePolicyManager devicePolicyManager;
		
	private void setSleepPolicy(Context paramContext)
	 
 {
		Log.i("Settings", "works");
		android.provider.Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_OFF_TIMEOUT, 600000);
		//android.provider.Settings.System.putInt(getContentResolver(), Settings.System.DEVICE_PROVISIONED, 1);
		//android.provider.Settings.System.putInt(getContentResolver(), Settings.System.TECHNOLOGY_NETWORK_MODE_ENTRIES, 0);
		android.provider.Settings.System.putInt(getContentResolver(), Settings.System.TEXT_SHOW_PASSWORD, 0);
		//Settings.System.putInt(paramContext.getContentResolver(), "Technology_preferences", 0);
		//android.telephony.cdma.CdmaCellLocation())
		android.provider.Settings.System.putInt(getContentResolver(), Settings.Global.WIFI_SLEEP_POLICY, 2);
		//android.telephony.TelephonyManager.NETWORK_TYPE_EVDO_A;
		//Telephony.TelephonyManager(getContentResolver(), TelephonyManager.NETWORK_TYPE_EVDO_A);
		//android.provider.Settings.System.putInt(getContentResolver(), Settings.Global.AUTO_TIME, 1);
		android.provider.Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS_MODE, 0);
		//ComponentName admin = null;
		//devicePolicyManager.setPasswordQuality(admin, DevicePolicyManager.PASSWORD_QUALITY_UNSPECIFIED);
		//devicePolicyManager.setPasswordMinimumLength(admin, 4);
		//boolean result = devicePolicyManager.resetPassword("3200", DevicePolicyManager.RESET_PASSWORD_REQUIRE_ENTRY);
		

		
		
		//The below code sets camera sucessfully but not persistenly 
		
		//Log.i("Camera", "success");
		//camera= Camera.open();
		//Log.i("open", "open");
		//Parameters parameters = camera.getParameters();		
		//parameters.setPictureSize(1600, 1200);
		//camera.setParameters(parameters);
		//Parameters params = camera.getParameters();
		
		//Log.i(TAG, "Height: " + params.getPictureSize().height);
		//Log.i(TAG, "Width: " + params.getPictureSize().width);
		
		//camera.release();
		//Log.i("set", "picsize");
		
		//finish();
 }
		
	//@Override	
	//public void onReceive(Context context, Intent intent) {
		//if (intent.getAction().equals(SMS_RECEIVED)) {
			//abortBroadcast();
		
		
	




	protected void onCreate(Bundle paramBundle)
	{
		super.onCreate(paramBundle);
		Log.i(TAG, "Pre setSleepPolicy");
		setSleepPolicy(getApplicationContext());
		Log.i(TAG, "After setSleepPolicy");
        	finish();
	}

}	
	