package com.beyond.exception.practice;

public class A_TryCatchFinally {
    public void method1(){
        try{
            // 예외가 발생할 수 있는 코드 작성
            int result = 10 / 0; // throw new ArithmeticException();

            String str = null;

            System.out.println(result);
        }catch (ArithmeticException e){ // catch 여러개 사용하면 다중catch
            // try에서 발생한 예외를 처리하는 코드 작성
            System.out.printf("ArithmeticException(%s)이 발생했습니다\n", e.getMessage());
        }catch (NullPointerException | ClassCastException e){  // 멀티catch
            System.out.println("NullPointerException 또는 ClassCastException이 발생했습니다");
        }catch (Exception e){
            e.printStackTrace();
        }finally { // finally는 생략 가능
            // 예외 발생 여부와 상관없이 무조건 수행
            System.out.println("finally 블록 실행");
        }

    }
}
