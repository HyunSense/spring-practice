package com.hyun.springprac.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class NetworkClient{

    private String url;

    public NetworkClient() {

        System.out.println("생성자 호출, url = " + url);
    }


    public void setUrl(String url) {
        this.url = url;
    }

    //Service 시작시 호출
    public void connect() {
        System.out.println("connect: " + url);
    }

    //Service 종료시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }


//    //InitializingBean의 초기화 메서드
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        connect();
//        call("초기화 연결 메시지");
//    }
//
//    //DisposableBean의 소멸 메서드
//    @Override
//    public void destroy() throws Exception {
//        disconnect();
//    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메시지");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
