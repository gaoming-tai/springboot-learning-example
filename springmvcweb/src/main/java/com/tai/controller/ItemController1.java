package com.tai.controller;/**
 * Created by gaoming on 2019/12/29.
 */

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @auther gaoming
 * @create 2019/12/29
 * @Description TODO
 */
@Controller
@RequestMapping("/")
public class ItemController1 {
        private static final Logger logger = Logger.getLogger(ItemController1.class);

        @RequestMapping("/sayHello")
        public ModelAndView sayHello(){
            logger.info("sayHello....00");
            logger.debug("sayHello....11");
            logger.error("sayHello....22");
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("index");
            return modelAndView;
        }

}
