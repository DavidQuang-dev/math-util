package com.davidquang.mathutil.main;

import com.davidquang.mathutil.core.MathUtility;
import jdk.dynalink.beans.StaticClass;

import static com.davidquang.mathutil.core.MathUtility.getFactorial;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgument0RunsWell();
        testFactorialGivenRightArgument1RunsWell();
        testFactorialGivenRightArgument5RunsWell();
        testFactorialGivenWrongArgumentMinus5ThrowException();
    }

    //CÁC TEST CASES ĐỂ DƯỚI ĐÂY, LÁT HỒI RUN TRONG MAIN()
    static void testFactorialGivenRightArgument0RunsWell() {
        // TEST CASE #1:
        // DESCRIPTION: CHECK getFactorial() function with valid argument (n == 0 )
        // Steps:
        //      Call function/method with n = 0 getFactorial(0)
        // EXPECTED result:
        //              Get 1 as the result of 0!
        // Actual result/Status (passed, failed) (waiting for test run)
        //
        //TESTER RUN: RUN CÁI TEST CASE
        long expectedResult = 0;
        long actualResult = getFactorial(0); //named-argument
        System.out.println("expected value: " + expectedResult
                        + "| actual value: " + actualResult);
    }

    //VỀ LÝ THUYẾT TA PHẢI TEST VỚI DATA N = 1, 2, 3, 4, ... 20

    //TEST CASE #2
    // Description: Check getFactorial() method with valid argument ( n = 1 )
    // Steps/Procedures ( cách test, các bước, verify hàm, chức năng )
    //          Call function with n = 1 getFactorial(1)
    // EXPECTED RESULT: ( hy vọng gọi 1! giá trị trả về là mấy
    //                  To have 1 as the result of 1!
    // Status (passed/failed-bug): mình phải run hàm và nhìn giá trị trả về mới biết
    //                              hàm chạy đúng hay sai
    //              PASSED!!!!!
    // Chạy TEST/CASE LÀM CÁC BƯỚC Ở TRÊN ĐỂ XÁC ĐỊNH ĐƯỢC HÀM ĐÚNG SAI
    // -> GỌI LÀ TEST RUN
    static void testFactorialGivenRightArgument1RunsWell(){
        long expectedResult = 1;
        long actualResult = getFactorial(1);
        System.out.println("expected value: " + expectedResult
                + "| actual value: " + actualResult);

    }

    //TEST CASE #3:
    //DECRIPTION
    //STEPS/PROCEDURES
    //EXPECTED RESULT
    //STATUS
    //TEST RUN
    static void testFactorialGivenRightArgument5RunsWell(){
        long expectedResult = 120;
        long actualResult = getFactorial(5);
        System.out.println("5! expected = 120 \n " +  "actual = " + getFactorial(5));

    }

    //TEST CASE #4
    // DESCRIPTION
    // STEPS:
    //      CALL getFactorial(-5)
    // EXPECTED RESULT:
    //              AN EXCEPTION IS THROWN - KÌ VỌNG 1 NGOẠI LỆ XH
    static void testFactorialGivenWrongArgumentMinus5ThrowException(){
        getFactorial(-5);
    }
}