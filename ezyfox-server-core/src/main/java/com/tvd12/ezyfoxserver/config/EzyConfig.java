package com.tvd12.ezyfoxserver.config;

import com.tvd12.ezyfox.util.EzyToMap;

public interface EzyConfig extends EzyToMap {

    String getEzyfoxHome();
    
    boolean isPrintSettings();
    
    boolean isPrintBanner();
    
    String getLoggerConfigFile();
    
    boolean isEnableAppClassLoader();
    
}
