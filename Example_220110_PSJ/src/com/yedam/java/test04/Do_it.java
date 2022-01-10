package com.yedam.java.test04;

public class Do_it {
	int num; // 번호
	static int count = 1; // 카운팅
	String do_it; //할일
	boolean tf; //했는지 여부
	
	public Do_it(String do_it) {
		num += count;
		count++;
		this.do_it =do_it;
		tf = false;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDo_it() {
		return do_it;
	}

	public void setDo_it(String do_it) {
		this.do_it = do_it;
	}

	public boolean isTf() {
		return tf;
	}

	public void setTf(boolean tf) {
		this.tf = tf;
	}

}
