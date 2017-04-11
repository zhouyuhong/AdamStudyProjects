package com.adam.Designs.behaviour.Commond.interfaces;
/**
 * 命令模式
 * 这种模式主要作用是把发起请求者和实际处理者分离，实现松耦合，它的主要实现过程如下：
 * 1、创建一个命令接口，然后有不同的命令实现
 * 2、创建实际处理的类，这个类就叫做命令接受者，即命令执行者
 * 3、通过命令实现类，定义一个命令接受者对象，然后再该命令中，调用这个接受者的实际处理方法
 * 4、请求发起者就只需要创建命令对象，调用命令对象的执行命令方法（例如 excute方法）即可
 * @author adam
 * 2015.5.22
 *
 */
public interface Commond {

	//命令接口，定义一个方法，即执行命令的方法
	public void excute();
	
}
