package com.gdu.app02.anno01;

public class Calculator {

  // no field
  
  // default constructor : new Calculator() <- 이 역할을 수행할 bean 태그를 만들면 된다.
  
  
  // method
  // 더하기
  public void add(int a, int b) {
    System.out.println(a+ "+" + b + "=" + (a + b));
  }
  
  // 빼기
  public void sub(int a, int b) {
    System.out.println(a+ "-" + b + "=" + (a - b));
  }
  
  // 곱하기
  public void mul(int a, int b) {
    System.out.println(a+ "x" + b + "=" + (a * b));
  }
  
  // 나누기
  public void div(int a, int b) {
    System.out.println(a+ "/" + b + "=" + (a / b));
  }
}
