package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2016-06-10.
 */
@RestController
public class boardController {
    @RequestMapping(value="/" , method = RequestMethod.GET)
    public String index() {
        return "게시판보여줄곳ㅋz";
    }
}
