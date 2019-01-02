package com.jxust.controller;


import com.jxust.PersonProperties;
import com.jxust.entity.Person;
import com.jxust.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author czw
 */
@RestController

@RequestMapping(value = "/yto56", method = { RequestMethod.GET, RequestMethod.POST })
public class HelloController {
        public HelloController(){

            this.testsay();
        }
    HelloController h = new HelloController();
        /**
        * 直接从yml中取值
        */
        @Value("${name}${age}")
        private String name;
        private int age;
        @RequestMapping(value = "/testhello",method = RequestMethod.GET)
        public String testsay(){
        return name+age;
        }


        @Autowired
        private PersonProperties personProperties;
        //通过@Autowired配合@ConfigurationProperties(prefix = "person")取值
        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String say() {
                return personProperties.getName() + personProperties.getAge();
        }

        /**
        * @author czw
        * 查找所有信息
        */
        @Autowired
        private IPersonService Ips;
        @RequestMapping("/find")
        public List<Person> findUsers() {
                return Ips.findPerson();
        }
        /**
         * 根据条件查询
         */
        @GetMapping("/getPersonById/{id}")
        public Person findUser(@PathVariable(value = "id") Integer id) {
                return Ips.getPersonById(id);
        }

        /**
        * 插入
        * @param person
        * @return
        */
        @PostMapping(value = "/insert")
        public String  InsertPerson(Person person) {
        int message = Ips.InsertPerson(person);
        System.out.println(message);
        if(message>0){
            return "成功";
        }else{
            return  "失败";
        }

        }

        /**
        * 删除
        * @param id
        * @return
        */
         @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
        public String delete(@PathVariable("id") Integer id) {
                int result = Ips.DeletePerson(id);
                if (result >= 1) {
                        return "删除成功";
                } else {
                        return "删除失败";
                }


        }
        @RequestMapping(value = "/testdelete", method = RequestMethod.GET)
        public String testdelete(@RequestParam(value = "Pid") Integer id) {
        int result = Ips.DeletePerson(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }


    }

        /**
        * 修改
        * @param person
        * @return
        */
        @RequestMapping(value = "/update", method = RequestMethod.POST)
        public String update(Person person) {
        int result = Ips.UpdatePerson(person);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

}
