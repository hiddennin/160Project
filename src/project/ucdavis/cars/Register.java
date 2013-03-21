package project.ucdavis.cars;


import project.ucdavis.cars.util.SystemUiHider;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class Register extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.register);
	}
	
	public void doRegister(View view)	{
		//Parse Fields via String <whatever> = ((TextView) findViewById(R.id.register<Fieldid>Field)).getText().toString();
		if (false /*check error condition for registration*/)	{
			TextView error = (TextView) findViewById(R.id.error);
			error.setText("This is an error"/*Change to relevant error text*/);
		}
		else	{
			//Actually Register the User
			finish(); // Close the view and go back to the login screen
		}
 	}
	public void goBack(View view)	{
		finish();
	}
}

