package com.project.collection.stream;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.project.collection.Student;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Base {
    public static void main(String[] args) {

        Student student = new Student("张1","成都1",10,"小学");
        Student student1 = new Student("张2","成都2",11,"中学");
        Student student2 = new Student("张3","成都3",12,"大学");

        List<Student> studentList = Lists.newArrayList();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        System.out.println(JSONObject.toJSONString(studentList));

        Map<String,String> map = Maps.newLinkedHashMap();
               map = studentList.stream().collect(Collectors.
                toMap(k -> String.format("%s%s", StringUtils.isBlank(k.getName())?"":k.getName(), k.getAddress()),
                        Student::getSchool,
                        (key1, key2) -> key2)); // 此种做法是保证key唯一，如果有重复key

        for (Map.Entry map2 : map.entrySet()){
            System.out.println(map2.getKey()+":"+map2.getValue());
        }

        String format = String.format("%s%s", StringUtils.isBlank(student.getName()) ? "" : student.getName(), student.getAddress());
        System.out.println(format);
    }
}
