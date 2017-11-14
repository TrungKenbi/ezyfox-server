package com.tvd12.ezyfoxserver.statistics;

import java.io.Serializable;

import lombok.Getter;

@Getter
public class EzySimpleStatistics implements EzyStatistics, Serializable {
    private static final long serialVersionUID = 5000816469696512888L;
    
    protected long startTime = System.currentTimeMillis();
    protected EzyUserStatistics userStats = newUserStats();
    protected EzySocketStatistics socketStats = newSocketStatistics();
    protected EzyWebSocketStatistics webSocketStats = newWebSocketStatistics();
    
    protected EzyUserStatistics newUserStats() {
        return new EzySimpleUserStats();
    }
    
    protected EzySocketStatistics newSocketStatistics() {
        return new EzySimpleSocketStatistics();
    }
    
    protected EzyWebSocketStatistics newWebSocketStatistics() {
        return new EzySimpleWebSocketStatistics();
    }
    
}
