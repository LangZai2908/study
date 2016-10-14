package com.demo.day19;

/**
 *
 * @author ChenChangJian
 * @createTime 2016年10月12日 下午6:10:28
 */
public class App {
	public static void main(String[] args) {
		Round round = new Round();
		round.drawRound(0, 0, 25);

		Director director = new Director();
		director.setName("傻蛋");
		director.setAddress("幸福村西餐厅后窗厕所西侧");
		director.setSalary(20000000);
		director.setTravelAllowance(20000);
		director.show();

		Manager manager = new Manager();
		manager.setName("二楞");
		manager.setAddress("幸福村西餐厅后窗厕所东侧");
		manager.setSalary(20000);
		manager.setLeadDepartment("残障部，二缺部");
		manager.show();

	}
}
