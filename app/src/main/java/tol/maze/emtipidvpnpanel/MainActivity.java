package tol.maze.emtipidvpnpanel;

import android.app.*;
import android.os.*;
import com.github.javiersantos.appupdater.*;
import com.github.javiersantos.appupdater.enums.*;
import android.support.v7.app.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//WELCOME APPUPDATER ##########
		AppUpdater appUpdater = new AppUpdater(this);
		appUpdater.setDisplay(Display.DIALOG);
		appUpdater.setUpdateFrom(UpdateFrom.JSON);
		appUpdater.setUpdateJSON("https://raw.githubusercontent.com/MannyToledoJr/Panel-eMTipid-VPN/master/app/src/main/res/raw/updates.json");
		appUpdater.setTitleOnUpdateAvailable("Update available");
		appUpdater.setContentOnUpdateAvailable("Check out the latest version available of my app!");
		appUpdater.setTitleOnUpdateNotAvailable("Update not available");
		appUpdater.setContentOnUpdateNotAvailable("No update available. Check for updates again later!");
		appUpdater.setButtonUpdate("Update now?");
		appUpdater.setCancelable(false);
		appUpdater.showAppUpdated(true);
		appUpdater.start();
    }
}
