package com.thinkfree.showlicense.android;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.thinkfree.showlicense.LicensedProject;

public class LicenseListAdapter implements ListAdapter {
    public static final int VIEW_TYPE_PLAIN_LICENSE = 0;
    private LicensedProject[] projects;

    public LicenseListAdapter(LicensedProject[] projects) {
        this.projects = projects;
    }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override
    public boolean isEnabled(int i) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        // nothing to do
    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        // nothing to do
    }

    @Override
    public int getCount() {
        if(projects==null) return 0;
        return projects.length;
    }

    @Override
    public Object getItem(int position) {
        if(projects==null) return null;
        return projects[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LicenseListItemView itemView = (LicenseListItemView) convertView;
        if(itemView==null) {
            itemView = new LicenseListItemView(parent.getContext());
        }
        itemView.setProject( projects[position] );

        return itemView;
    }

    @Override
    public int getItemViewType(int i) {
        return VIEW_TYPE_PLAIN_LICENSE;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        if(projects==null) return true;
        return projects.length==0;
    }
}