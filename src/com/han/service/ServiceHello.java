package com.han.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * ��������
 * @author Hxd
 *
 */
@WebService
public class ServiceHello {

	/**
	 * ���ͻ��˵��õķ���
	 * @param name �������
	 * @return ���ؽ��
	 */
	public String sayHello(String name){
		return "Hellow Word!" + name + "to say!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ���ڷ���������,
		 * 172.16.11.207����ʱ������ַ
		 * 9901:�˿ں�,������δռ��
		 * 
		 * Service/ServiceHello?����???
		 */
		Endpoint.publish("http://172.16.11.207:9901/Service/ServiceHello", new ServiceHello());
		System.out.println("Service Create Success");
	}

}
