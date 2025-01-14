package com.kh.controller;

import java.util.Random;
import java.util.Scanner;
import com.kh.model.vo.User.User;

public class PlayController {

    Scanner sc = new Scanner(System.in);
    User user = new User("이주원");

    public void game01() {
        // Random 객체 생성
        Random rand = new Random();

        // 1 ~ 50 사이의 랜덤값 추출
        int random = rand.nextInt(50) + 1;
        int attempts = 5;
        boolean caught = false;

        System.out.println("1 ~ 50 사이의 정수를 입력하세요:");

        // 최대 5번의 기회
        for (int i = 0; i < attempts; i++) {
            System.out.print((i + 1) + "번째 시도: ");
            int userInput = sc.nextInt();

            if (userInput > random) {
                System.out.println("Down");
            } else if (userInput < random) {
                System.out.println("Up");
            } else {
                System.out.println("Catch");
                user.setScore(user.getScore() + 10);
                caught = true;
                break;
            }
        }

        if (!caught) {
            System.out.println("5번의 기회 내에 맞추지 못했습니다. 랜덤값은 " + random + "였습니다.");
        } else {
            System.out.println("축하합니다! 점수: " + user.getScore());
        }
    }

    public void game02() {
        final String[] rps = {"가위","바위","보"};
    }

    public void game03() {
       
    }

    public void getUserInfo() {
       
    }
}

