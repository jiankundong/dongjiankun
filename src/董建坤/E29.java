package 董建坤;
public class E29 {
	public static int divide(int x ,int y) {
		try{int result=x/y;
		return  result;
		}catch(Exception e) {
			System.out.println("不活的信息为："+e.getMessage());
		}finally {
			System.out.println("执行finally代码块，无论程序是否异常，都会执行");
		}
		return -1;
	}
	public static void main(String[] args) {
		int result=divide(4, 0);
		if(result == -1) {
			System.out.println("程序异常！");
		}else {
			System.out.println(result);
		}
	}

}
