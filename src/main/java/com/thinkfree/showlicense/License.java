package com.thinkfree.showlicense;

/**
 * please let me know if you have nice icon set for popular license.
 */
public class License {
    public static final License APACHE2 = new License("Apache License, Version 2.0",
            "http://www.apache.org/licenses/LICENSE-2.0.html",
            "http://www.apache.org/images/feather-small.gif");
    public static final License BSD_3_CLAUSE = new License("The BSD 3-Clause License",
            "http://opensource.org/licenses/BSD-3-Clause", null);
    public static final License BSD_2_CLAUSE = new License("The BSD 2-Clause License",
            "http://opensource.org/licenses/BSD-2-Clause", null);
    public static final License GPL3 = new License("The GNU General Public License, version 3",
            "http://www.gnu.org/licenses/gpl-3.0.html",
            "http://www.gnu.org/graphics/gplv3-127x51.png");
    public static final License GPL2 = new License("The GNU General Public License, version 2",
            "http://www.gnu.org/licenses/gpl-2.0.html", null);
    public static final License LGPL3 = new License("The GNU Lesser General Public License, version 3.0",
            "http://opensource.org/licenses/LGPL-3.0",
            "http://www.gnu.org/graphics/lgplv3-147x51.png");
    public static final License LGPL2_1 = new License("The GNU Lesser General Public License, version 2.1",
            "http://opensource.org/licenses/LGPL-2.1", null);
    public static final License MIT = new License("The MIT License",
            "http://opensource.org/licenses/mit-license.php",
            "http://upload.wikimedia.org/wikipedia/commons/thumb/0/0b/License_icon-mit-2.svg/256px-License_icon-mit-2.svg.png");
    public static final License MOZILLA2 = new License("Mozilla Public License 2.0",
            "http://www.mozilla.org/MPL/",
            "http://www.mozilla.org/images/template/screen/logo_footer.png"
    );
    public static final License CDDL = new License("Common Development and Distribution License",
            "http://opensource.org/licenses/CDDL-1.0", null);
    public static final License EPL = new License("Eclipse Public License 1.0",
            "http://www.eclipse.org/legal/epl-v10.html", null);

    public String name;
    public String licenseUrl;
    public String logoUrl;

    public License(String name, String url, String logoUrl) {
        this.name = name;
        this.licenseUrl = url;
        this.logoUrl = logoUrl;
    }
}