package com.lp.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {

    /**
     */
    private static final long serialVersionUID = 1L;

    private String attribute;

    private Integer property;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Integer getProperty() {
        return property;
    }

    public void setProperty(Integer property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Prototype [attribute=" + attribute + ", property=" + property + "]";
    }

    /**
     * 浅复制
     */
    protected Object clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        return prototype;
    }

    /**
     * 
     * 功能描述:深复制 <br>
     * 〈功能详细描述〉
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /**
         * 读取当前对象流，转化为字节数组流
         */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /**
         * 读取字节数组流中的数据转化为对象
         */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
