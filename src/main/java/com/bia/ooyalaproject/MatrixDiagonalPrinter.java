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

/**
 * This program prints diagonal elements in a matrix
 *
 * @author intesar
 */
public class MatrixDiagonalPrinter {

    /**
     * sample input abc def ghi
     *
     * prints a db gec hf i
     *
     * i.e. (Algorithm works) a ==> matrix a00 // i,j = starts with 0 then i
     * incr and j decr a10 a01 // i++, j-- a20 a11 a02 a21 a12 // i starts as
     * rows, and j = 1, j decr and i incr a22
     *
     * abcd efgh ijkl mnop
     *
     * a
     * eb ifc mjgd nkh ol p
     *
     * @param matrix
     */
    public void print(char[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        // validate
        if (matrix == null) {
            throw new RuntimeException("Invalid invalid");
        }

        for (int x = 0; x < rows; x++) {
            int i = x;
            int j = 0;
            while (i >= 0 && j < cols) {
                System.out.print(matrix[i--][j++]);
            }
            System.out.println("");
        }

        int k = 1;
        for (int x = 0; x < rows; x++) {
            int i = rows - 1;
            int j = k;
            while (i >= 0 && j < cols) {
                System.out.print(matrix[i--][j++]);
            }
            System.out.println("");
            k++;
        }
    }

    /**
     * easy testable method checkout the test cases
     *
     * @param matrix
     * @return
     */
    public String getDiagonal(char[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return "";
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        StringBuilder sb = new StringBuilder();

        // validate
        

        for (int x = 0; x < rows; x++) {
            int i = x;
            int j = 0;
            while (i >= 0 && j < cols) {
                sb.append(matrix[i--][j++]);
            }
            sb.append("\n");
        }

        int k = 1;
        for (int x = 0; x < rows; x++) {
            int i = rows - 1;
            int j = k;
            while (i >= 0 && j < cols) {
                sb.append(matrix[i--][j++]);
            }
            k++;
            if ( k < cols ){
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
