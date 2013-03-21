package project.ucdavis.cars;

import project.ucdavis.cars.util.SystemUiHider;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import android.content.Intent;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);
	}
	public void doLoginCheck(View view)	{
		//username and password should contain whatever was entered into the username and password fields
		String username = ((TextView) findViewById(R.id.loginUsernameField)).getText().toString();
		String password = ((TextView) findViewById(R.id.loginPasswordField)).getText().toString();
		//Validate user/password
		if (false /*change condition*/)	{
			TextView error = (TextView) findViewById(R.id.error);
			error.setText("This is an error"/*Change to relevant error text*/);
		}
		else	{
			User.userId = 0; //TODO Set user id on successful login
			User.isAdmin = false; //TODO Set admin status on successful login
			((TextView) findViewById(R.id.loginUsernameField)).setText("");
			((TextView) findViewById(R.id.loginPasswordField)).setText("");
			Intent i = new Intent(this, MainMenu.class);
			startActivityForResult(i,1);		
		}
	}
	
	public void goRegister(View view)	{
		Intent i = new Intent(this, Register.class);
		startActivityForResult(i,1);
	}
}
