public class Fish{
	//属性
	private String name;
	private int age;
		
	//构造方法
	public Fish(String name,int age){
		this.name=name;
		this.age=age;
		}
	
	//方法
	public String show(){
		return "名称："+name+"\t"+"年龄："+age;
		}
	//构造一个加法的方法
	public static int add(int a,int b){
		return a+b;
	}

	//set,get方法
	
	
	//内部类
	class FoodFish{
		}
	
	//实例块
	{
	System.out.println("这是一条好吃的鱼");
	}
	
	//静态块
	static{
	System.out.println("这是一条非常不好吃的鱼");
	}
	public static void main(String[] args){
	Fish fish=new Fish("鲤鱼",1);
	System.out.println(fish.show());
	System.out.println(add(3,5));
	
	}

}