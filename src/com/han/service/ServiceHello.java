package com.han.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * 服务器端
 * @author Hxd
 *
 */
@WebService
public class ServiceHello {

	/**
	 * 供客户端调用的方法
	 * @param name 传入参数
	 * @return 返回结果
	 */
	public String sayHello(String name){
		return "Hellow Word!" + name + "to say!";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 用于发布服务器,
		 * 172.16.11.207代表当时本机地址
		 * 9901:端口号,必须是未占用
		 * 
		 * Service/ServiceHello?代表???
		 */
		Endpoint.publish("http://172.16.11.207:9901/Service/ServiceHello", new ServiceHello());
		System.out.println("Service Create Success");
	}

}
