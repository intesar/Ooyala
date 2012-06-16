/*
 * Copyright 2012 intesar.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bia.ooyalaproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author intesar
 */
public class MatrixDiagonalPrinterTest {

    public MatrixDiagonalPrinterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    MatrixDiagonalPrinter instance = new MatrixDiagonalPrinter();

    /**
     * Test of getDiagonal method, of class MatrixDiagonalPrinter.
     */
    @Test
    public void testGetDiagonal() {
        System.out.println("getDiagonal");
        
        
        char[][] m1 = {};
        String expResult = "";
        //validate(m1, expResult);

        char[][] m2 = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        expResult = "a\ndb\ngec\nhf\ni";
        validate(m2, expResult);
        
        char[][] m3 = {{'a', 'b', 'c', 'd'}, {'e','f','g','h'}, {'i','j','k','l'}, {'m','n','o','p'}};
        expResult = "a\neb\nifc\nmjgd\nnkh\nol\np";
        validate(m3, expResult);
    }

    private void validate(char[][] matrix, String expResult) {
        
        String result = instance.getDiagonal(matrix);
        System.out.println (expResult + "==" + result);
        //assertSame(expResult, result);
    }
}
