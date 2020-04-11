package com.rpcl.test;

import com.rpcl.beans.DateUtils;

public class Test {
	public static void main(String[] args) {
		DateUtils du = new DateUtils();
		System.out.println("System date :: "+du.getSysdate());
	}
}
