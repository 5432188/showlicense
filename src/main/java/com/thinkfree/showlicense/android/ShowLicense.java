package com.thinkfree.showlicense.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import com.thinkfree.showlicense.LicensedProject;

public class ShowLicense {
    private ShowLicense() {
        // do not create an instance
    }

    /**
     * @param cxt a parent activity
     * @param title can be null
     * @param projects open source projects list
     * @return the new license dialog
     */
    public static AlertDialog createDialog(Context cxt, String title, LicensedProject[] projects) {
        AlertDialog.Builder dBuilder = new AlertDialog.Builder(cxt);
        if(title!=null) {
            dBuilder.setTitle(title);
        }
        LicenseListView licenseView = new LicenseListView(cxt);
        LicenseListAdapter adapter = new LicenseListAdapter(projects);
        licenseView.setAdapter(adapter);
        AlertDialog dialog = dBuilder.setView(licenseView).create();
        return dialog;
    }

    /**
     * @param cxt a parent activity
     * @param title can be null
     * @param projects open source projects list
     * @return an intent will show license activity
     */
    public static Intent createActivityIntent(Context cxt, String title, LicensedProject[] projects) {
        LicenseListActivity.projects = projects;
        Intent intent = new Intent(cxt, LicenseListActivity.class);
        return intent;
    }
}