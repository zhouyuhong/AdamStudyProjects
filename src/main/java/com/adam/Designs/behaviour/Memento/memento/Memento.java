package com.adam.Designs.behaviour.Memento.memento;
/**
 * 备忘录模式
 * 该模式顾名思义，就是通过一个自定义的对象来记录我们当前主对象的某个状态或者某一类状态，然后在某个时候，通过调用这个自定义的对象来得到我们之前传入的主对象的某个状态
 * 这个自定义的对象就叫备忘录，而主对象就是我们的主人，采用这种模式，我们就能轻易的在任何时候恢复我们之前的状态了，当然我们也说过，这种模式不仅仅保存一个状态，也可以
 * 保存一组状态，这个就根据业务需求来判断了
 * 
 * 除了主人与备忘录，我们还需要一个备忘录操作类，这个类的作用就是替主人保存备忘录，帮主人得到备忘录，当然，它并不能修改备忘录
 * 而有了备忘录操作类，主人只需要做的就是保存自己的备忘信息交给操作类，或者从操作类得到自己的备忘信息就OK了，主人并不会接触备忘录对象本身，
 * 而备忘录类就很简单了，只是负责保存主人希望记录的状态即可
 * 
 * @author adam
 * 2015.6.1
 * 
 */
public class Memento {

	//这就是我们的备忘录类，它内部就两个方法，记录保存的信息，返回保存的信息，当然还需要一个属性，就是信息变量
	private String infos;

	//我们就利用构造方法来初始化信息，即创建备忘录的时候，就必须创建备忘信息，这样就不需要下面的set方法了
	public Memento(String s){
		this.infos = s;
	}
	
	//get方法即可
	public String getInfos() {
		return infos;
	}
//	public void setInfos(String infos) {
//		this.infos = infos;
//	}
	
}
