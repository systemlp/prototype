package com.lp.prototype;

import java.io.IOException;

public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
        Prototype prototype = new Prototype();
        prototype.setAttribute("字符");
        prototype.setProperty(1);
        System.out.println(prototype.hashCode() + "\t" + prototype.toString());
        //浅复制
        Prototype prototype2 = (Prototype) prototype.clone();
        System.out.println((prototype.getAttribute() == prototype2.getAttribute()) + "\t" + prototype2.hashCode()
                + "\t" + prototype2.toString());
        //深复制
        Prototype prototype3 = (Prototype) prototype.deepClone();
        System.out.println((prototype.getAttribute() == prototype3.getAttribute()) + "\t" + prototype3.hashCode()
                + "\t" + prototype3.toString());
    }
}
