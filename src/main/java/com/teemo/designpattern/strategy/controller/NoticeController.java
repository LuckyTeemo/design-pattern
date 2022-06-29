package com.teemo.designpattern.strategy.controller;

import com.teemo.designpattern.strategy.model.NoticeDAO;
import com.teemo.designpattern.strategy.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Teemo
 * @date 2022/6/29
 */
@RestController
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @PostMapping("/notice")
    public String notice(@RequestBody NoticeDAO noticeDao) {
        return noticeService.notice(noticeDao);
    }
}
