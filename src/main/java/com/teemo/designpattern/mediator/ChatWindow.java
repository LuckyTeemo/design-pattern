package com.teemo.designpattern.mediator;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author Teemo
 * @date 2022/10/24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ChatWindow extends ChatMediator{

    private ZhangSan zhangSan;

    private LiSi liSi;

    private WangWu wangWu;

    @Override
    public void chat(String message, Player player) {

        // 谁发送消息 其余的人就接受消息
        if (player == zhangSan) {
            wangWu.getMessage(message);
            liSi.getMessage(message);
        }
        if (player == liSi) {
            zhangSan.getMessage(message);
            wangWu.getMessage(message);
        }
        if (player == wangWu) {
            zhangSan.getMessage(message);
            liSi.getMessage(message);
        }
    }

}
