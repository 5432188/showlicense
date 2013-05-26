package com.thinkfree.showlicense.android;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.thinkfree.showlicense.LicensedProject;

public class LicenseListView extends ListView implements AdapterView.OnItemClickListener {
    public LicenseListView(Context context) {
        super(context);
        setOnItemClickListener(this);
    }

    public LicenseListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        LicenseListItemView itemView = (LicenseListItemView) view;
        LicensedProject proj = itemView.project;
        if(proj!=null && proj.projectUrl!=null) {
            Intent browseIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(proj.projectUrl));
            getContext().startActivity(browseIntent);
        }
    }

    /**
     * (CAUTION) you can not set <code>OnItemClickListener</code>.
     *
     * @param listener The callback that will be invoked.
     */
    @Override
    public void setOnItemClickListener(OnItemClickListener listener) {
        OnItemClickListener oldListener = getOnItemClickListener();
        if(oldListener==null) {
            super.setOnItemClickListener(listener);
        } else {
            Log.d("LicenseListView", "please call setOnItemClickListener(null) first.");
        }
    }
}