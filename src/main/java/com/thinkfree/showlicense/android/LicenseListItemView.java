package com.thinkfree.showlicense.android;

import android.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TwoLineListItem;
import com.thinkfree.showlicense.LicensedProject;

@SuppressWarnings("deprecation")
class LicenseListItemView extends LinearLayout {
    public LicensedProject project;
    private TwoLineListItem twoLineItem;

    LicenseListItemView(Context context) {
        super(context);
        initChildren();
    }

    private void initChildren() {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        twoLineItem = (TwoLineListItem)inflater.inflate(R.layout.simple_list_item_2, null);
        addView(twoLineItem);
    }

    void setProject(LicensedProject project) {
        this.project = project;
        setText(twoLineItem.getText1(), project.name);
        setText(twoLineItem.getText2(), project.license.name);
    }

    private static void setText(TextView tv, String text) {
        if(tv==null) return;
        if(text==null) return;
        tv.setText(text);
    }
}