package com.example.smallwhite.designpatterns.prototype;import lombok.Data;/** * 问答题 * @author: yangqiang * @create: 2021-02-22 19:53 */@Datapublic class AnswerQuestion {    private String name;  // 问题    private String key;   // 答案    public AnswerQuestion() {    }    public AnswerQuestion(String name, String key) {        this.name = name;        this.key = key;    }    // ...get/set}