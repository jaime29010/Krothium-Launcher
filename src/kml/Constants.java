package kml;

import java.net.URL;

/**
 * @website https://krothium.com
 * @author DarkLBP
 */

public class Constants {
    public static final int KERNEL_BUILD = 14;
    public static final String KERNEL_BUILD_NAME = "1.1.0";
    public static final URL AUTHENTICATE_URL = Utils.stringToURL("https://mc.krothium.com/authenticate");
    public static final URL REFRESH_URL = Utils.stringToURL("https://mc.krothium.com/refresh");
    public static final URL VALIDATE_URL = Utils.stringToURL("https://mc.krothium.com/validate");
    public static final URL CHANGESKIN_URL = Utils.stringToURL("https://mc.krothium.com/changeskin");
    public static final URL CHANGECAPE_URL = Utils.stringToURL("https://mc.krothium.com/changecape");
    public static final URL GETLATEST_URL = Utils.stringToURL("https://mc.krothium.com/latestversion");
    public static final URL VERSION_MANIFEST_FILE = Utils.stringToURL("https://launchermeta.mojang.com/mc/game/version_manifest.json");
    public static final String RESOURCES_URL = "http://resources.download.minecraft.net/";
    public static final int DOWNLOAD_TRIES = 5;
    public static final int KEEPALIVE_TIMEOUT = 15000;
    public static String LANG_CODE = "en";
    public static boolean UPDATE_CHECKED = false;
}