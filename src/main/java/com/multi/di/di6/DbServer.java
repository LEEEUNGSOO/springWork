package com.multi.di.di6;

import lombok.Data;

@Data
public class DbServer {
    private String serverName;
    private String serverUrl;      // XML에서 p:serverUrl=... 로 주입
    private int serverPort;
    private int connectionCount;
}
