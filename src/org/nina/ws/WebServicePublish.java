package org.nina.ws;

import javax.xml.ws.Endpoint;

/**
 * @author gacl
 *
 * ����Web Service
 */
public class WebServicePublish {

    public static void main(String[] args) {
        //����WebService�ķ�����ַ�������ַ�����ṩ��������Webervice��URL��ַ��URL��ַ��ʽΪ��http://ip:�˿ں�/xxxx
        //String address = "http://192.168.1.100:8989/";���WebService������ַ��д���ǺϷ���
        //String address = "http://192.168.1.100:8989/Webservice";���WebService������ַ���ǺϷ���
        String address = "http://127.0.0.1:9090/WS_Server1/Webservice1";
        //ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
        Endpoint.publish(address , new WebServiceImpl());
        System.out.println("����webservice�ɹ�!");
    }
}