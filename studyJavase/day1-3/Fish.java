public class Fish{
	//����
	private String name;
	private int age;
		
	//���췽��
	public Fish(String name,int age){
		this.name=name;
		this.age=age;
		}
	
	//����
	public String show(){
		return "���ƣ�"+name+"\t"+"���䣺"+age;
		}
	//����һ���ӷ��ķ���
	public static int add(int a,int b){
		return a+b;
	}

	//set,get����
	
	
	//�ڲ���
	class FoodFish{
		}
	
	//ʵ����
	{
	System.out.println("����һ���óԵ���");
	}
	
	//��̬��
	static{
	System.out.println("����һ���ǳ����óԵ���");
	}
	public static void main(String[] args){
	Fish fish=new Fish("����",1);
	System.out.println(fish.show());
	System.out.println(add(3,5));
	
	}

}