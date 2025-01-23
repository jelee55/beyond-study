package com.beyond.search;

import java.util.Arrays;

public class Search {

    // 정수형 배열에서 특정 숫자의 인덱스를 찾는 정적 메소드
    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // 문자열에서 특정 문자의 인덱스를 찾는 메소드
    public static int linearSearch(String str, int target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    // 정수형 배열의 요소에서 가장 작은 값을 찾는 메소드
    public static int minValue(int[] numbers) {
//        int min = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//                break;
//            }
//        }
//        return min;
        return Arrays.stream(numbers).min().getAsInt();
    }


    // 이진 탐색
    // 정수형 배열에서 특정 숫자의 인덱스를 찾는 메소드(이진 탐색, 반복문 사용)
    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target) {
                return mid;
            }else if (numbers[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }

        }

        return -1;
    }

    public static int binarySearch(int[] numbers, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }else if (numbers[mid] < target) {
                return binarySearch(numbers, target, mid +1, right);
            }else{
                return binarySearch(numbers, target, left, mid - 1);
            }
        }


        return -1;
    }
}
