package com.future.thread;

public class Test1 {
	public static void main(String[] args) {
		Thread curr = Thread.currentThread();
		//���̵߳����������ʧ��
		//curr.setDaemon(true);
		System.out.println(curr.getName());
		curr.setName("BigMain");
		System.out.println(curr.getName());
	}

}
