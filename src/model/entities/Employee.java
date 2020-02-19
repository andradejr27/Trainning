package model.entities;

public class Employee {
	
	private double ht;
	private double vh;
	private double pd;
	private double sb;
	private double td;
	
	public Employee(double ht, double vh, double pd) {
		this.ht = ht;
		this.vh = vh;
		this.pd = pd;
	}
	
	public void setHt(double ht) {
		this.ht = ht;
	}
	
	public double getHt() {
		return ht;
	}
	
	public void setVh(double vh) {
		this.vh = vh;
	}
	
	public double getVh() {
		return vh;
	}
	
	public void setPd(double pd) {
		this.pd = pd;
	}
	
	public double getPd() {
		return pd;
	}
	
	public double salarioBruto(double ht, double vh) {
		this.sb = ht * vh;
		return sb;
	}
	
	public double percentualDesconto(double pd, double sb) {
		this.td = (pd /100) * sb;
		return td;
	}
	
	public double salarioLiquido(double sb) {
		return this.sb - this.td;
	}
	
	
}
