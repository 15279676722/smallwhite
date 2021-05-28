package com.example.smallwhite.utils;import java.lang.reflect.Field;import java.lang.reflect.InvocationTargetException;import java.util.HashMap;import java.util.Iterator;import java.util.Map;/** * @author: yangqiang * @create: 2020-11-27 14:39 */public class CommonUtils {    /**     * java对象转为map对象     * @param obj 要转化的对象     */    public static Map<String, String> convertToMap(Object obj) {        Class<?> aClass = obj.getClass();        //获得这个类中所有声明的字段 包括public private proteced 但是不包括父类的字段        Field[] declaredFields = aClass.getDeclaredFields();        //获得这个类以及父类所有访问修饰符为 public的字段        Field[] fields = aClass.getFields();        HashMap<String, String> objToMap = new HashMap<>();        try {            for (Field field : declaredFields) {                if(!"serialVersionUID".equals(field.getName())) {                    objToMap.put(field.getName(), String.valueOf(field.get(obj)));                }            }        } catch (IllegalAccessException e) {            e.printStackTrace();        }        return objToMap;    }    /**     *  map对象转为java对象     * @param map 要转化的map     * @param clazz     */    public  static <T> T convertToObj(Map<String, Object> map, Class<T> clazz) {        T obj = null;        try {             obj = clazz.getDeclaredConstructor().newInstance();            Field[] declaredFields = clazz.getDeclaredFields();            Iterator<String> iterator = map.keySet().iterator();            while (iterator.hasNext()){                String fieldName = iterator.next();                for (Field field:declaredFields){                    if(fieldName.equalsIgnoreCase(field.getName())){                        // 判断类型是否一致，调用反射注入值，                        field.setAccessible(true);                        field.set(obj,new Object[]{TypeConversionUtils.converType(TypeConversionUtils.getType(map.get(fieldName)), field.getType().getName(), map.get(fieldName))}[0]);                    }                }            }        } catch (InstantiationException e) {            e.printStackTrace();        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {            e.printStackTrace();        }        return obj;    }}