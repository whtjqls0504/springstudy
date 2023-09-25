package com.gdu.app02.xml01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainWrapper {

  public static void main(String[] args) {
    
    // appCtx.xml에 정의된 bean 태그를 객체 생성.(불러오기)
    AbstractApplicationContext ctx = new GenericXmlApplicationContext("xml01/appCtx.xml");
    
    // 객체 가져오기
    Contact contact  = ctx.getBean("contact", Contact.class);
    Address address = ctx.getBean("address", Address.class);
    Person person = (Person)ctx.getBean("person");
    
    // 확인
    System.out.println(contact.getMobile() + ", " + contact.getFax());
    System.out.println(address.getPostcode() + ", " + address.getJibun() + ", " + address.getRoad());
    System.out.println(person.getName() + ", " + person.getContact() + ", " + person.getAddress()); 
   
    // appCtx.xml 파일 닫기
    ctx.close();

  }

}
