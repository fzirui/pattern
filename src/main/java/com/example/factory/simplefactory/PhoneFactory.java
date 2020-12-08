package com.example.factory.simplefactory;


import com.example.factory.entities.MiPhone;
import com.example.factory.entities.OnePlusPhone;
import com.example.factory.entities.Phone;

public class PhoneFactory {

    /**
     * 每次增加手机品牌需要修改工厂类，增加判断
     * @param name
     * @return
     */
    public static Phone createPhone(String name){
        if("mi".equals(name)){
            return new MiPhone();
        }else if("oneplus".equals(name)){
            return new OnePlusPhone();
        }
        return null;
    }

    /**
     * 需要增加手机品牌时直接增加Phone接口的实例即可，不需要修改工厂类，
     * @param className
     * @return
     */
    public static Phone createPhone2(String className){
        try{
            if(!(null == className || "".equals(className))){
                return (Phone) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
