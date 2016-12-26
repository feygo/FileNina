package org.nina.wscli;


/**
 * @author gacl
 * ����WebService�Ŀͻ���
 */
public class WSClient {

    public static void main(String[] args) {
        //����һ�����ڲ���WebServiceImplʵ���Ĺ�����WebServiceImplService����wsimport�������ɵ�
        WebServiceImplService factory = new WebServiceImplService();
        //ͨ����������һ��WebServiceImplʵ����WebServiceImpl��wsimport�������ɵ�
        WebServiceImpl wsImpl = factory.getWebServiceImplPort();
        //����WebService��sayHello����
        String resResult = wsImpl.sayHello("�°�����");
        System.out.println("����WebService��sayHello�������صĽ���ǣ�"+resResult);
        System.out.println("---------------------------------------------------");
        //����WebService��save����
        resResult = wsImpl.save("�°�����","123");
        System.out.println("����WebService��save�������صĽ���ǣ�"+resResult);
    }
}