package main.controller;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016-06-12.
 */
@Controller
public class ViewController {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ViewController.class);

    @RequestMapping("hello")
    public String index(Model model) {
        model.addAttribute("hello", "SpringBlog from Millky");
        return "hello";
    }


//
//    @RequestMapping(value= "/" ,  method = RequestMethod.GET)
//    public String showBoardList(Model model) {
//        logger.info("display view board list");
//        return "board.list";
//    }
//
//    // 게시글 상세보기
//    // PathVariable 어노테이션을 이용하여 RESTful 방식 적용
//    // bbs/1 -> id = 1; id = 게시물 번호로 인식함.
//    @RequestMapping("/{idx}")
//    public String dispBbsView(@PathVariable int idx, Model model) {
//        logger.info("display view BBS view idx = {}", idx);
//        return "bbs.view";
//    }
//
//    // 게시판 쓰기
//    @RequestMapping(value = "/write", method = RequestMethod.GET)
//    public String boardWrite(Model model) {
//        logger.info("display view board write");
//        return "board.write";
//    }

}