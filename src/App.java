/**
* Filename : App.java
* Author : huyn
* Creation time : ����5:33:20 - 2019��1��6��
* Description :
*/
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "hello world world";
		//������,�ַ��ĸ���
		System.out.println(str.length());
//		str =  "hello worl��";
		System.out.println(str.length());
		
		//charAt() ��ȡָ��λ���ϵ��ַ�
		System.out.println(str.charAt(10));
		//����String�е�[],�����µ�����,����Ӱ��ԭ��������
		char[] arr = str.toCharArray();
		
		//�����Ӵ���ĸ���е�λ��(����ֵ,��0 Ϊ��ַ)ָ���ַ���λ������
		int pos = str.indexOf("world",7);
		System.out.println(pos);
		
		String s1 = "3month";
		String s2 = "3year";
		String s3 = "3day";
		
		//�ж��Ƿ���ָ���ַ���β
		System.out.println(s1.endsWith("year"));
		System.out.println(s1.startsWith("3"));
		
		
		str = "hello world";
		String[] atrArr =  str.split(" ");
		System.out.println(atrArr.length);
		//ǰ���󲻰�
		System.out.println("hello world".substring(6,10));
		
		char a  = 97;
		a = 'a';
		a = '\uFFFF';//unicode �ַ�
		a = 0xffff;
		int ii = 5;
		ii = 05;
		ii = 0x5;
		System.out.println(a);
		
		int col = 0;
		for(int j = 0;j < 0xffff;j ++){
			System.out.print((char)j);
			col ++;
			if(col >= 80){
				col = 0;
				System.out.println();
			}
		}
	}

}
