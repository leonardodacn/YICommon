package com.cn.factory;

public class Factory {
  private static Operate operate;

	public static Operate getOperate(char ope) {
		switch (ope) {
		case ('+'):
			operate = new AddOperate();
			break;
		case ('-'):
			operate = new SubOperate();
			break;
		case ('*'):
			operate = new MulOperate();
			break;
		case ('/'):
			operate = new DivOperate();
			break;
		}
		return operate;
	}
}
