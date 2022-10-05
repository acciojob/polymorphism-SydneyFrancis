package com.driver;

public class Main {
  public static void main(String[] args) {
    Product p = new Product();
    int a = p.product(10,15);
    System.out.println(a);
    double b = p.product(10.3,2.5);
    System.out.println(b);
    int c = p.product(10,20,50);
    System.out.println(c);
  }
  static class Product{
    public Product(){

    }
    public int product(int x,int y){
      return x*y;
    }
    public int product(int x,int y,int z){
      return x*y*z;
    }

    public double product(double x,double y){
      return  x*y;
    }

  }
    
}