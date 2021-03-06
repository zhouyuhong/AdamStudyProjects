package com.adam.Designs.behaviour.Strategy.strategy;
/**
 * 策略模式
 * 策略模式的思想就是把所有的业务方法封装成一个接口和实现类，做成一个策略，当用户有不痛的需求时，调用不同的策略即可，这个策略可以是算法，操作业务等
 * 
 * 例如此时我们有8打排序算法，但是不同的情况下，我们需要采取不同的算法，此时我们就可以把排序算法做成一个策略，然后编写8个对应的排序算法实现类，当我们需要什么算法时
 * 就调用什么实现类即可，这样的话，所有的策略都可以公用，并且如果某一个算法需要修改代码，也只需要直接修改策略实现类即可，如果是在每个类中写一个相应的算法，那么如果此时需要修改
 * 则工作量就大了
 * @author adam
 * 2015.6.3
 *
 */
public interface Strategy {

	//策略接口，内部就一个方法，执行策略方法
	public void excute();
	
}
