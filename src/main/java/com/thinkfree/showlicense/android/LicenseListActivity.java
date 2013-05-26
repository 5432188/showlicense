package com.thinkfree.showlicense.android;

import android.R;
import android.app.ListActivity;
import android.os.Bundle;
import com.thinkfree.showlicense.LicensedProject;

public class LicenseListActivity extends ListActivity {
    public static LicensedProject[] projects = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LicenseListView lsv = new LicenseListView(this);
        lsv.setId(R.id.list);
        setContentView(lsv);
        if(projects==null) throw new RuntimeException("please us ShowLicense.createActivityIntent()");
        LicenseListAdapter adapter = new LicenseListAdapter(projects);
        setListAdapter(adapter);
    }
}