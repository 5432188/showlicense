showlicense
===========

A simple (open source) license UI library in JAR(not apklib) for android.
you can show the information using either an activity or dialog.

project list
------------

prepare LicensedProject[]
```
LicensedProject projABS = new LicensedProject(
    "ActionBarSherlock",    // name
    "com.actionbarsherlock:actionbarsherlock:2.3",  // GAV
    "http://actionbarsherlock.com", // project url
    License.APACHE2);
LicensedProject projDexDex = new LicensedProject(
    "dexdex", null, "https://github.com/behumble/dexdex", License.APACHE2);
LicensedProject[] projList = new LicensedProject[] { projABS, projDexDex }
```

Activity
--------
1. Java code
```
Intent intent = ShowLicense.createActivityIntent(this, "Open source licenses", projList);
startActivity(intent);

```

2. AndroidManifest.xml
add an activity element (optionally with label and icon)
```
    <activity android:name="com.thinkfree.showlicense.android.LicenseListActivity" android:label="Open Source License">
```

Dialog
------
```
ShowLicense(this, "Open source licenses", projList).show();
```

License
-------
    Copyright 2013 ThinkFree

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.