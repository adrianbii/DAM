package t9_objetos;

import java.util.Date;

public class Loan {
//public double pagomensual{tasainteresmensual=  interes anual/ 1200
	//pagomensual= importeprestamo*tasainteresmensual / (1- (1/ math.pow(1+tasamensual, numerodeaños*12)
	
	private double annualInteresRate=2.5;
	private static int numberOfYear=1;
	private double loanAmount=1000;
	private Date loanDate;


public Loan () {}

public Loan (double annualIntRate, int numberOfY, double loanAmount) {
	
	this.annualInteresRate=annualIntRate;
	this.numberOfYear=numberOfY;
	this.loanAmount=loanAmount;
}

public double getAnnualInteresRate() {
	return annualInteresRate;
}

public void setAnnualInteresRate(double annualInteresRate) {
	this.annualInteresRate = annualInteresRate;
}

public int getNumberOfYear() {
	return numberOfYear;
}

public void setNumberOfYear(int numberOfYear) {
	this.numberOfYear = numberOfYear;
}

public double getLoanAmount() {
	return loanAmount;
}

public void setLoanAmount(double loanAmount) {
	this.loanAmount = loanAmount;
}

public Date getLoanDate() {
	return loanDate;
}

//falta escribir bien estos dos metodos
public static double getTotalPayment() {
	double  tasatotal=numberOfYear*12;
	
	return tasatotal;}

public static double getMonthlyPayment(double annualint) {
	
	
	double monthly= annualint/1200;
	
	return monthly;
}


}