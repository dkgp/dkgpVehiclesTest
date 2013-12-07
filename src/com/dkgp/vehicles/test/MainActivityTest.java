package com.dkgp.vehicles.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.suitebuilder.annotation.MediumTest;
import android.widget.Button;

import com.dkgp.vehicles.MainActivity;

public class MainActivityTest extends ActivityUnitTestCase<MainActivity>  {


	public MainActivityTest(Class<MainActivity> activityClass) {
		super(activityClass);
		// TODO Auto-generated constructor stub
	}

	private Intent mLaunchIntent;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mLaunchIntent = new Intent(getInstrumentation()
				.getTargetContext(), MainActivity.class);
		startActivity(mLaunchIntent, null, null);
		//final Button launchNextButton = (Button) getActivity().findViewById(com.dkgp.vehicles.R.id.btnTakePicure);
	}

	@MediumTest
	public void testPictureCaptureWithIntent() {
	    startActivity(mLaunchIntent, null, null);
	    final Button takePicture =
	            (Button) getActivity()
	            .findViewById(com.dkgp.vehicles.R.id.btnTakePicure);
	    takePicture.performClick();

	    final Intent launchIntent = getStartedActivityIntent();
	    assertNotNull("Intent was null", launchIntent);
	    assertTrue(isFinishCalled());

	    
	}
	
}
